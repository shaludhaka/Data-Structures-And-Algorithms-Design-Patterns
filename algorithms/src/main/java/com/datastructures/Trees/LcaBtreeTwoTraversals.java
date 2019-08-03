package com.datastructures.Trees;


import java.util.ArrayList;
import java.util.*;

public class LcaBtreeTwoTraversals {

    private Node root;

    private List<Integer> path1 = new ArrayList<>();
    private List<Integer> path2 = new ArrayList<>();

    private int findLca(int n1, int n2) {
        path1.clear();
        path2.clear();
        return getLCA(root, n1, n2);
    }

    private int getLCA(Node root, int n1, int n2) {

        boolean isN1Path = isPath(root, n1, path1);
        boolean isN2Path = isPath(root, n2, path2);
        Collections.reverse(path1);
        Collections.reverse(path2);
        System.out.println(path1);
        System.out.println(path2);


        if (!isN1Path || !isN2Path) {
            return -1;
        }
        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (!path1.get(i).equals(path2.get(i))) {
                break;
            }
        }
        return path1.get(i - 1);
    }

    private boolean isPath(Node root, int n, List<Integer> path) {
        if (root == null) {
            return false;
        }

        if (root.key == n) {
            path.add(root.key);
            return true;
        }

        if (isPath(root.left, n, path) || isPath(root.right, n, path)) {
            path.add(root.key);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LcaBtreeTwoTraversals tree = new LcaBtreeTwoTraversals();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.right.right = new Node(8);

        System.out.println("LCA(4, 5): " + tree.findLca(4, 5));
        System.out.println("LCA(4, 6): " + tree.findLca(4,6));
        System.out.println("LCA(3, 4): " + tree.findLca(3,4));
        System.out.println("LCA(2, 4): " + tree.findLca(2,4));


    }

}
