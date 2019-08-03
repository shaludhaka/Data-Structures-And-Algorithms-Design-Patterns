package com.datastructures.Trees;

public class LcaSingleTraversalBothNodePresent {

    private Node root;



    public int lcaFunct(int n1, int n2){
        return callInternal(root, n1, n2);
    }

    public int callInternal(Node root, int n1, int n2){
        if (root == null){
            return -1;
        }
        if (root.key==n1 || root.key==n2){
            return root.key;
        }

        int left = callInternal(root.left, n1, n2);
        int right = callInternal(root.right, n1, n2);
        if (left >=0 && right>=0){
            return root.key;
        }
        return (left==-1)?right:left;
    }


    public static void main(String[] args) {
        LcaSingleTraversalBothNodePresent tree = new LcaSingleTraversalBothNodePresent();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.right.right = new Node(8);

        System.out.println("LCA(4, 5): " + tree.lcaFunct( 4, 5));
        System.out.println("LCA(4, 5): " + tree.lcaFunct( 4, 6));
        System.out.println("LCA(4, 5): " + tree.lcaFunct( 3, 4));
        System.out.println("LCA(4, 5): " + tree.lcaFunct( 2, 4));
    }
}
