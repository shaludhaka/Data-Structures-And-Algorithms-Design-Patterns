package com.datastructures.Trees;


public class MinDepthBinaryTree {


    public int minDepth(Node node) {

        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        if (node.left == null) {
            return minDepth(node.right) + 1;
        }
        if (node.right == null) {
            return minDepth(node.left) + 1;
        }
        return Math.min(minDepth(node.left) + 1, minDepth(node.right) + 1);

    }
}
