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
            System.out.print(top.key + " ");
            stack.pop();

            if (top.right!=null) {
                stack.push(top.right);
            }

            if(top.left!=null){
                stack.push(top.left);
            }
        }
    }


    public static void main(String[] args) {
        BinaryTree  tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);

        tree.preorderIterative();
    }
}
