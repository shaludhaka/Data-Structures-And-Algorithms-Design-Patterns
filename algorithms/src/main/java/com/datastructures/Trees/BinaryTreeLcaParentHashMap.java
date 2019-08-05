package com.datastructures.Trees;
import java.util.HashMap;
import java.util.Map;

class NodeWithParent{
    int key;
    NodeWithParent left;
    NodeWithParent right;
    NodeWithParent parent;

    NodeWithParent(int data){
        left = null;
        right = null;
        key = data;
        parent = null;
    }
}

public class BinaryTreeLcaParentHashMap {

    NodeWithParent root, n1,n2;


    NodeWithParent Lca(){
        System.out.println(n1.key);

        Map<NodeWithParent, Boolean> map = new HashMap<NodeWithParent, Boolean>();

        while (n1!=null){
            map.put(n1, Boolean.TRUE);
            n1=n1.parent;
        }

        while(n2!=null){
            if(map.containsKey(n2)!=map.isEmpty()) {
                return n2;
            }
            n2 = n2.parent;
        }

        return null;
    }


    public static void main(String[] args) {
        BinaryTreeLcaParentHashMap tree = new BinaryTreeLcaParentHashMap();
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

        System.out.println(tree.Lca().key);
    }
}
