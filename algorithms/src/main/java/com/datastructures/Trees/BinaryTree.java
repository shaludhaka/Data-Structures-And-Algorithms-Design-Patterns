package com.datastructures.Trees;

import java.util.Stack;


class Node{

    int key;
    Node left, right;

    Node(int item){
        key = item;
        left=right=null;
    }
}


public class BinaryTree {
    Node root;

    void preorderIterative(){
        preorderIterative(root);
    }

    void preorderIterative(Node node){
        Stack <Node> stack = new Stack<>();
        stack.push(root);

        while(stack.empty()!=true){
            Node top = stack.peek();
            System.out.println(top.key + " ");

        }
    }


    public static void main(String[] args) {
        BinaryTree  tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(20);
        tree.root.left.right = new Node(10);
        tree.root.left.left = new Node(9);

        tree.preorderIterative();
    }
}
