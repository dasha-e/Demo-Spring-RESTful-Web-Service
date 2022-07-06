package com.example.demo.service.algorithm;

import org.springframework.stereotype.Component;

import java.util.Stack;

@Component("7")
public class TreeSort implements SortingStrategy {

    private Node createTree(int[] arr) {
        Node root = null;
        for (int j : arr) {
            System.out.println(j);
            root = insertKey(root, j);
        }
        return root;
    }

    //A recursive function to insert a new key in Binary Sort Tree
    private Node insertKey(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            return new Node(key, null, null, 1);
        }
        //Otherwise, recur down the tree
        Node temp = root;
        while (true) {
            if (key < temp.getKey()) {
                if (temp.getLeft() == null) {
                    temp.setLeft(new Node(key, null, null, 1));
                    break;
                }
                temp = temp.getLeft();
            } else if (key >= temp.getKey()) {
                if (temp.getRight() == null) {
                    temp.setRight(new Node(key, null, null, 1));
                    break;
                }
                temp = temp.getRight();
            }
        }
        // if tree is AVL it's need to be balanced, else just return the root
        return balance(root);
    }

    // tree traversal to build a sorted array
    private void treeTraversal(Node root, int[] arr) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        int i = 0;
        do {
            if (temp != null) {
                stack.push(temp);
                temp = temp.getLeft();
            } else {
                if (stack.isEmpty()) {
                    break;
                }
                temp = stack.pop();
                arr[i++] = temp.getKey();
                temp = temp.getRight();
            }
        } while (true);
    }

    protected Node balance(Node node) {
        return node;
    }

    @Override
    public void sort(int[] arr) {
        treeTraversal(createTree(arr), arr);
    }
}
