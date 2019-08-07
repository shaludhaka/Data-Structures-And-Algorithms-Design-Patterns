package com.datastructures.Trees;

public class BinaryTreeParentWithoutHashMap {


    NodeWithParent root, n1,n2;

    int depth(NodeWithParent n){
        int depth=-1;
        while(n!=null){
           ++depth;
           n=n.parent;
        }
        return depth;
    }

    NodeWithParent lca(){

        int d1 = depth(n1);
        int d2 = depth(n2);
        int diff = d1-d2;
        if(diff<0){
            NodeWithParent temp = n1;
            n1=n2;
            n2=temp;
            diff = -diff;
        }
        while (diff--!=0){
            n1=n1.parent;
        }
        while (n1!=null && n2!=null){
            if(n1==n2){
                return n1;
            }
            n1=n1.parent;
            n2=n2.parent;
        }
        return null;
    }

    public static void main(String[] args) {
        BinaryTreeParentWithoutHashMap tree = new BinaryTreeParentWithoutHashMap();
        tree.root = new NodeWithParent(1);
        tree.root.left = new NodeWithParent(2);
        tree.root.left.parent = tree.root;
        tree.root.right = new NodeWithParent(3);
        tree.root.right.parent = tree.root;
        tree.root.left.left = new NodeWithParent(4);
        tree.root.left.left.parent = tree.root.left;
        tree.root.left.right = new NodeWithParent(5);
        tree.root.left.right.parent = tree.root.left;


        tree.n1 = tree.root.left.left;
        tree.n2 = tree.root.left.right;

        System.out.println(tree.lca().key);

    }
}
