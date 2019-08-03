package com.datastructures.Trees;

public class LcaSingleTraversalBothNodePresent {
    private Node root;
    static boolean v1, v2;



    Node callInternal(Node root, int n1, int n2){


        if (root == null){
            return null;
        }
        Node temp=null;

        if (root.key==n1){
            v1 = true;
            temp= root;
        }
        if(root.key == n2){
            v2=true;
            temp= root;
        }
        Node left = callInternal(root.left, n1, n2);
        Node right = callInternal(root.right, n1, n2);
        if (temp!=null){
            return temp;

        }

        if (left!=null && right!=null){
            return root;
        }
        return (left!=null)?left:right;
    }



    Node lcaFunct(int n1, int n2){
        v1=false;
        v2=false;
        Node lca = callInternal(root, n1, n2);
        if (v1 && v2) {
            return lca;
        }
        return null;
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
        try {
            System.out.println("LCA(4, 5): " + tree.lcaFunct(4, 5).key);
            System.out.println("LCA(4, 6): " + tree.lcaFunct(4, 6).key);
            System.out.println("LCA(3, 4): " + tree.lcaFunct(3, 4).key);
            System.out.println("LCA(2, 4): " + tree.lcaFunct(2, 4).key);
            System.out.println("LCA(2, 12): " + tree.lcaFunct(2, 12).key);
        }
        catch (NullPointerException ex){
            System.out.println("LCA not found");
        }
    }
}
