package com.synechron;

import java.util.Collections;

public class LinkedListFindingElement {

    static Node head;
    public static void main(String[] args) {
        LinkedListFindingElement list = new LinkedListFindingElement();
        list.head=new Node(85);
        list.head.next = new Node(15);
        list.head.next.next= new Node(4);
        list.head.next.next.next = new Node(120);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverseLinkedList(head);
        System.out.println("");
        System.out.println("Reversed Linked List");
        list.printList(head);
    }

    void printNthFromLast(int n){
        int len = 0;
        Node temp = head;


        while(temp!=null){
            temp = temp.next;
            len++;
        }

        if(len<0){
            return;
        }
        temp = head;
        for(int i =0;i<len-n+1;i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    void printList(Node node){
        while(node!=null){
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    Node reverseLinkedList(Node node){
        Node prev =null;
        Node current = node;//5 4 3
        Node next =null;

        while(current!=null){
            next = current.next; //  3
            current.next = prev; //5 4 3
            prev = current;//5 4 3
            current = next; // 4 3
        }
        node = prev;
        return node;
    }

    Node reverse(Node node){

        Node previousNode = null;
        Node currentNode = node;
        Node nextNode = null;

        while(currentNode!=null){

            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }


}




class Node{

    int data;
    Node next;

    Node(int data){
        this.data=data;
        next =null;
    }
}
