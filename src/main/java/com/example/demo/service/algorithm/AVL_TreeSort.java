package com.example.demo.service.algorithm;

import org.springframework.stereotype.Component;

@Component("8")
public class AVL_TreeSort extends TreeSort {
    // return height or 0, if node doesn't exist
    int height(Node node) {
        return node == null ? 0 : node.getHeight();
    }

    // balance factor of the Node (height difference between right and left subtrees)
    private int balanceFactor(Node node) {
        return height(node.getRight()) - height(node.getLeft());
    }

    // restoring the correct height value
    // (if the key values of the right and left child nodes are correct)
    private void fixheight(Node node) {
        int hl = height(node.getLeft());
        int hr = height(node.getRight());
        node.setHeight((Math.max(hl, hr)) + 1);
    }

    // right turn around node
    private Node rotateRight(Node node) {
        Node newNode = node.getLeft();
        node.setLeft(newNode.getRight());
        newNode.setRight(node);
        fixheight(node);
        fixheight(newNode);
        return newNode;
    }

    // left turn around node
    private Node rotateLeft(Node node) {
        Node newNode = node.getRight();
        node.setRight(newNode.getLeft());
        newNode.setLeft(node);
        fixheight(node);
        fixheight(newNode);
        return newNode;
    }

    // balancing node
    @Override
    protected Node balance(Node node) // p
    {
        fixheight(node);
        if (balanceFactor(node) == 2) {
            if (balanceFactor(node.getRight()) < 0) {
                node.setRight(rotateRight(node.getRight()));
            }
            return rotateLeft(node);
        }
        if (balanceFactor(node) == -2) {
            if (balanceFactor(node.getLeft()) > 0)
                node.setLeft(rotateLeft(node.getLeft()));
            return rotateRight(node);
        }
        return node;
    }
}
