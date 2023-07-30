package com.Nadeem;

import java.util.Stack;

import static java.lang.System.exit;

public class BST {
    Node root;

    private class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void insert(int data) {
        Node node = new Node(data);
        Node ptr = root;
        Node par = root;
        while (ptr != null) {
            par = ptr;
            if (data < ptr.val) {
                ptr = ptr.left;
            } else {
                ptr = ptr.right;
            }

        }
        if (par == null) {
            root = node;
        } else if (data < par.val) {
            par.left = node;
        } else {
            par.right = node;
        }
    }

    public void inorder() {
        inorder(root);
    }


    private void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);

    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.println("|\t\t");
            }
            System.out.println("|---------->" + node.val);
        } else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }

    public void Traversal_Non_rec_pre() {
        Traversal_Non_rec_pre(root);

    }

    private void Traversal_Non_rec_pre(Node root) {
        Node ptr = root;
        Stack<Node> s = new Stack<>();
        s.push(ptr);
        while (!s.isEmpty()) {
           ptr= s.pop();
            System.out.print(ptr.val+" ");
            if (ptr.right != null) {
                s.push(ptr.right);
            }
            if (ptr.left != null) {
                s.push(ptr.left);
            }
        }
    }
    public void Traversal_Non_rec_In() {
        Traversal_Non_rec_In(root);

    }
    private void Traversal_Non_rec_In(Node root) {
       Stack<Node> s=new Stack<>();
       Node ptr=root;
       while(true){
           while (ptr.left!=null){
               s.push(ptr);
               ptr=ptr.left;
           }
           while (ptr.right==null){
               System.out.print(ptr.val+" ");
               if(s.isEmpty()){
                   exit(1);
               }
               ptr=s.pop();
           }
           System.out.print(ptr.val+" ");
           ptr=ptr.right;

       }
    }
}





