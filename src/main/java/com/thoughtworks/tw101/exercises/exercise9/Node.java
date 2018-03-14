package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node leftChild;
    private Node rightChild;

    public Node(String name) {
        this.name = name;
        leftChild = null;
        rightChild = null;
    }

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareTo(name) < 0 && hasLeftChild()) {
            leftChild.add(nameOfNewNode);
        }
        else if (nameOfNewNode.compareTo(name) > 0 && hasRightChild()) {
            rightChild.add(nameOfNewNode);
        }
        else if (nameOfNewNode.compareTo(name) < 0) {
            Node newLeftChild = new Node(nameOfNewNode);
            setLeftChild(newLeftChild);
        }
        else if (nameOfNewNode.compareTo(name) > 0) {
            Node newRightChild = new Node(nameOfNewNode);
            setRightChild(newRightChild);
        }
    }

    public List<String> names() {

        List<String> allNames = new ArrayList<>();
        allNames = addNodesToList(this, allNames);

        return allNames;
    }

    public List<String> addNodesToList(Node currentNode, List<String> allNodeNames) {
        if (currentNode == null) {
            return null;
        }
        else {
            addNodesToList(currentNode.leftChild, allNodeNames);
            allNodeNames.add(currentNode.name);
            addNodesToList(currentNode.rightChild, allNodeNames);
        }

        return allNodeNames;
    }

    public void setLeftChild(Node newLeftChild) {
        leftChild = newLeftChild;
    }

    public void setRightChild(Node newRightChild) {
        rightChild = newRightChild;
    }

    public boolean hasLeftChild() {
        return leftChild != null;
    }

    public boolean hasRightChild() {
        return rightChild != null;
    }
}
