package com.datastructures.Trees;


public class Bst {

    class Node{
            int key;
            Node left, right ;

            public Node(int item){
                key = item;
                left = right = null;
        }
    }
    Node root;
    public Bst(){
        root = null;
    }


    void insert (int key){
        root = insertRecord(root, key);
    }

    //Insert into BST
    Node insertRecord(Node root, int rec){

        if (root == null){
            root = new Node(rec);
            return root;
        }
        else if (rec > root.key){
            root.right =  insertRecord(root.right, rec);
        }
        else{
            root.left =  insertRecord(root.left, rec);
        }
        return root;
    }

    //inorder to call actual traversal function as we can not call class variable from static context

    void inorder(){
        inorderTraversal(root);
    }

    //inorder traversal of BST
    void inorderTraversal(Node root){

        if (root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.key);
        inorderTraversal(root.right);
    }



    public static void main(String[] args) {
         Bst bst = new Bst();
         bst.insert(50);
         bst.insert(30);
         bst.insert(20);
         bst.insert(40);
         bst.insert(70);
         bst.insert(60);
         bst.insert(80);

         bst.inorder();
    }
}

//Time complexity will be O(h)  h=height of BST
//in case of skewed tree height will be n and so the search and insert will be O(n)