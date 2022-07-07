package com.example.demo.service.algorithm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Node {
    private int key;
    private Node left, right;
    private int height;
}
