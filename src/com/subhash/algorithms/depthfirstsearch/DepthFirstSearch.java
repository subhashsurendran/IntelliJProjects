package com.subhash.algorithms.depthfirstsearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DepthFirstSearch {
    public static void main(String[] args) {



    }

    public List<Integer> preOrderRecursion(Node root){

        List<Integer> returnList = new ArrayList<>();
        if(root== null){
            return returnList;
        }

        
        returnList.add(root.data);
        preOrderRecursionInternal(root.left, returnList);
        preOrderRecursionInternal(root.right, returnList);
        return returnList;

    }

     static void preOrderRecursionInternal(Node root, List<Integer> returnList) {

        if(root!=null){
            returnList.add(root.data);
            preOrderRecursionInternal(root.left, returnList);
            preOrderRecursionInternal(root.right, returnList);
        }

    }

    public List<Integer> inOrderRecursion(Node root){

        List<Integer> returnList = new ArrayList<>();
        if(root== null){
            return returnList;
        }
        inOrderRecursionInternal(root.left, returnList);
        returnList.add(root.data);
        inOrderRecursionInternal(root.right, returnList);
        return returnList;

    }

    static void inOrderRecursionInternal(Node root, List<Integer> returnList) {

        if(root!=null){
            inOrderRecursionInternal(root.left, returnList);
            returnList.add(root.data);
            inOrderRecursionInternal(root.right, returnList);
        }

    }


    public List<Integer> postOrderRecursion(Node root){

        List<Integer> returnList = new ArrayList<>();
        if(root== null){
            return returnList;
        }
        postOrderRecursionInternal(root.left, returnList);
        postOrderRecursionInternal(root.right, returnList);
        returnList.add(root.data);
        return returnList;

    }

    static void postOrderRecursionInternal(Node root, List<Integer> returnList) {

        if(root!=null){
            postOrderRecursionInternal(root.left, returnList);
            postOrderRecursionInternal(root.right, returnList);
            returnList.add(root.data);
        }

    }
    private class Node {

        int data;
        Node left;
        Node right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
}
