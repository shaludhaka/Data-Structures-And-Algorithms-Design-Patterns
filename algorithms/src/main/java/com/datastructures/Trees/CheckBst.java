package com.datastructures.Trees;

public class CheckBst {

    Node root;

    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left=right=null;
        }

    }

    public boolean  checkBst(){

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        return checkBstHelper(root, min, max);
    }

    public boolean  checkBstHelper(Node node, int min, int max){

        if (node == null){
            return true;
        }

        if(node.data>max || node.data < min){
            return false;
        }
        return checkBstHelper(node.left,min, node.data ) && checkBstHelper(node.right, node.data, max);
    }

    public static void main(String[] args) {

        CheckBst tree = new CheckBst();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        if(tree.checkBst()){
            System.out.println("is bst");
        }else {
            System.out.println("not a bst");

        }

    }

}
