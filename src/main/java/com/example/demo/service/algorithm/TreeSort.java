package com.example.demo.service.algorithm;

import com.example.demo.entity.Node;

public class TreeSort extends SortingStrategy {
    private Node root;

    void createTree(int[] arr) {
        root = null;
        for (int j : arr) {
            root = insertKey(root, j);
        }

    }

    // A recursive function to insert a new key in Binary Sort Tree
    Node insertKey(Node root, int key) {

        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key, null, null);
            return root;
        }

        //Otherwise, recur down the tree
        if (key < root.getKey())
            root.setLeft(insertKey(root.getLeft(), key));
        else if (key >= root.getKey())
            root.setRight(insertKey(root.getRight(), key));

        return root;
    }

    // tree traversal to build a sorted array
    int treeTraversal(Node root, int[] arr, int i) {
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

    @Override
    public void sort(int[] arr) {
        createTree(arr);
        treeTraversal(root, arr, 0);
    }
}
