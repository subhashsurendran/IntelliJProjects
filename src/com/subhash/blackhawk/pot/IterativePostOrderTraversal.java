package com.subhash.blackhawk.pot;

import java.util.Stack;

public class IterativePostOrderTraversal {

    public static void main(String[] args) {

        Node root = null;
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        postOrderIterative(root);

    }

    private static void postOrderIterative(Node root) {

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        if(root ==null){
            return;
        }

        s1.push(root);

        while(!s1.isEmpty()){
            Node temp = s1.pop();
            s2.push(temp);

            if(temp.left!=null){
                s1.push(temp.left);
            }
            if(temp.right!=null){
                s1.push(temp.right);
            }
        }

        while(!s2.isEmpty()){
            System.out.print(s2.pop().data + " ");
        }


    }

}
