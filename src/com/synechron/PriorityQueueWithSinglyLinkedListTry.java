package com.synechron;

public class PriorityQueueWithSinglyLinkedListTry {

    private static NodeLinkedListTry head = null;

    private static void push(int dataVal, int priorityVal){
        NodeLinkedListTry newNode = new NodeLinkedListTry(dataVal, priorityVal);

        if(head == null){
            head =  newNode;
            return;
        }

        NodeLinkedListTry temp = head;
        NodeLinkedListTry prev = null;

        while(temp!=null && temp.priority>priorityVal){
            prev = temp;
            temp = temp.next;
        }
        if(temp ==null){
            prev.next = newNode;
        }else{
            if(prev == null){
                newNode.next = head;
                head = newNode;
            }else{
                newNode.next = temp;
                prev.next = newNode;
            }
        }
    }









    static class NodeLinkedListTry {

        NodeLinkedListTry next;
        int priority;
        int data;

        public NodeLinkedListTry(int data, int priority) {
            this.data = data;
            this.priority = priority;
        }
    }
}
