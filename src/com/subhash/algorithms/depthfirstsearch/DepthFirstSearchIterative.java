package com.subhash.algorithms.depthfirstsearch;

import com.subhash.hackerrank.Solution1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchIterative {

    public static void main(String[] args) {

        Node root =new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> integers = postorderTraversalIterative(root);

        System.out.println(Arrays.toString(integers.toArray()));
        System.out.println(Arrays.toString(preorderTraversalIterative(root).toArray()));
        System.out.println(Arrays.toString(inorderTraversalIterative(root).toArray()));


    }

    public static List<Integer> postorderTraversalIterative(Node node){
        List<Integer> returnList = new ArrayList<>();
        Node curr = node;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
       if(node==null){
           return returnList;
       }
       stack1.push(node);

       while(!stack1.isEmpty()){
           Node pop = stack1.pop();
           stack2.push(pop);
           if(pop.left!=null){
               stack1.push(pop.left);
           }
           if(pop.right!=null){
               stack1.push(pop.right);
           }
       }
       while(!stack2.isEmpty()){
           returnList.add(stack2.pop().data);
       }
        return returnList;
    }

    public static List<Integer> preorderTraversalIterative(Node node){
        List<Integer> returnList = new ArrayList<>();
        Stack<Node> stack1 = new Stack<>();
         if(node==null){
            return returnList;
        }
        Node push = stack1.push(node);
        while(!stack1.isEmpty()){

            Node pop = stack1.pop();
            returnList.add(pop.data);
            if(pop.left!=null){
                stack1.push(pop.right);
            }
            if(pop.right!=null){
                stack1.push(pop.left);
            }
        }

        return returnList;
    }

    public static List<Integer> inorderTraversalIterative(Node node){
        List<Integer> returnList = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        if(node==null){
            return returnList;
        }

        Node current = node;
        while(!stack.isEmpty()|| current !=null){
            if(current!=null){
                stack.push(current);
                current=current.left;
            }else{
                current=stack.pop();
                returnList.add(current.data);
               current=current.right;
            }
        }

        return returnList;
    }
}
