package com.leetcode;

import java.util.List;

public class ReverseALinkedLIst {

    public ListNode reverseAList(ListNode node){

        ListNode prev=null;
        ListNode currNode = node;

        while(currNode!=null){
            ListNode tempNode = currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode=tempNode;

        }

        return prev;
    }
}


class ListNode{

    int val;
    ListNode next;

    ListNode(){

    }

    ListNode(int val){
        this.val=val;
    }
    ListNode(int val, ListNode node){
        this.val=val;
        this.next=node;
    }
}