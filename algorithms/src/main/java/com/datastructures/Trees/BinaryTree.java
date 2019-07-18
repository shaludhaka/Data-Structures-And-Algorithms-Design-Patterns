package com.datastructures.Trees;

import java.util.Stack;
import java.util.ArrayList;


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

    //Postorder traversal

    ArrayList<Integer> postorderIterative(){
        return postorderIterative(root);
    }

    ArrayList<Integer> postorderIterative(Node root){
        ArrayList <Integer> list = new ArrayList<Integer>();
        Stack <Node> s = new Stack<Node>();

        if (root  == null)
            return list;
        else if (root.right!=null){
            s.push(root.right);
        }
        s.push(root);
        root=root.left;
        while(!s.isEmpty()){
                while(root!=null){
                    if(root.right!=null){
                        s.push(root.right);
                    }
                    s.push(root);
                    root = root.left;
                }


                root = s.pop();
                if(root.right!=null && s.isEmpty()!=true && root.right == s.peek()){
                    Node current = s.pop();
                    root = s.push(root);
                    root = current;
                }
                else{
                    list.add(root.key);
                    root = null;
                }
        }


        return list;
    }

    // Preorder traversal
    void preorderIterative(){
        preorderIterative(root);
    }

    void preorderIterative(Node node){
        Stack<Node> stack = new Stack<>();
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
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);



//        tree.preorderIterative();
        System.out.println(tree.postorderIterative());
    }
}
