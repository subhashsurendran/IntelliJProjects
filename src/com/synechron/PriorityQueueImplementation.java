package com.synechron;

public class PriorityQueueImplementation {

    static class Node{
        Node next;
        int priority;
        int data;
    }

    static Node node = new Node();

    static Node newNode(int data, int priority){
        Node temp = new Node();
        temp.data=data;
        temp.priority=priority;
        temp.next=null;
        return temp;
    }

    static int peek(Node node){
        return 0;
    }
    static Node pop(Node head){
        return null;
    }
    static Node push(Node head, int data, int priority){
        Node start = head;
        Node temp =newNode(data, priority);
        if(head.priority>priority){
            temp.next = head;
            head = temp;
        }else{
            while(start.next!=null && start.next.priority<priority){
                start = start.next;
            }
            temp.next=start.next;
            start.next=temp;
        }
        return head;
    }
}
