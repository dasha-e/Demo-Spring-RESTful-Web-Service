package com.example.demo.service.algorithm;

import org.springframework.stereotype.Component;

@Component("7")
public class TreeSort implements SortingStrategy {

    private Node createTree(int[] arr) {
        Node root = null;
        for (int j : arr) {
            root = insertKey(root, j);
        }
        return root;
    }

    // A recursive function to insert a new key in Binary Sort Tree
    public Node insertKey(Node root, int key) {

        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key, null, null, 1);
            return root;
        }

        //Otherwise, recur down the tree
        if (key < root.getKey())
            root.setLeft(insertKey(root.getLeft(), key));
        else if (key >= root.getKey())
            root.setRight(insertKey(root.getRight(), key));

        return balance(root); // if tree is AVL it's need to be balanced, else just return the root
    }

    // tree traversal to build a sorted array
    private int treeTraversal(Node root, int[] arr, int i) {
        if (root != null) {
            if (root.getLeft() != null) {
                i = 1 + treeTraversal(root.getLeft(), arr, i);
            }
            arr[i] = root.getKey();
            if (root.getRight() != null) {
                i = treeTraversal(root.getRight(), arr, i + 1);
            }
        }
        return i;
    }

    protected Node balance(Node node) {
        return node;
    }

    @Override
    public void sort(int[] arr) {
        treeTraversal(createTree(arr), arr, 0);
    }
}
