package com.datastructures.Trees;
import java.util.*;

public class TwoStackPostOrder {

    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

        static Stack s1, s2;
        static void postorderIteraive(Node root){

            s1 = new Stack<>();
            s2 = new Stack<>();
            if(root == null){
                return;
            }
            s1.push(root);
            while(!s1.isEmpty()){

                Node temp = (Node) s1.pop();
                s2.push(temp);

                if (temp.left!=null){
                    s1.push(temp.left);
                }
                if (temp.right!=null){
                    s1.push(temp.right);
                }
            }

            while(!s2.isEmpty()){
               Node temp = (Node) s2.pop();
               System.out.print(temp.data + " ");
            }

        }



    public static void main(String[] args){
            Node node = new Node(1);
            node.left = new Node(2);
            node.right = new Node(3);
            node.left.left = new Node(4);
            node.left.right= new Node(5);
            node.right.left= new Node(6);
            node.right.right= new Node(7);

            postorderIteraive(node);
    }

}
