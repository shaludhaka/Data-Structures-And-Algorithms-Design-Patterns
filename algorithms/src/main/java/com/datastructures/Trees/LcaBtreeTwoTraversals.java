package com.datastructures.Trees;


import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.ArrayList;
import java.util.List;

public class LcaBtreeTwoTraversals {

    Node root;

    private List<Integer> path1 = new ArrayList <>();
    private List<Integer> path2 = new ArrayList<>();

    public int findLca(int n1, int n2){
        path1.clear();
        path2.clear();
        return getLCA(root, n1, n2);
    }

    private int getLCA(Node root, int n1, int n2){

        boolean isN1Path = isPath(root, n1, path1);
        boolean isN2Path = isPath(root, n2, path2);
        System.out.println(isN1Path);
        System.out.println(isN2Path);
    }

    private boolean isPath(Node root, int n, List<Integer> path){
          if(root == null){
              return false;
          }
          if(root.key==n){
              return true;
          }

          if(isPath(root.left, n ,path) || isPath(root.right, n, path)){
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


    }

}
