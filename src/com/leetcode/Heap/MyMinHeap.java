package com.leetcode.Heap;

public class MyMinHeap {
    public static void main(String[] args) {

        MyMinHeap minHeap = new MyMinHeap(3);
        minHeap.add(3);
        minHeap.add(1);
        minHeap.add(2);
        // [1,3,2]
        System.out.println(minHeap.toString());
        // 1
        System.out.println(minHeap.peek());
        // 1
        System.out.println(minHeap.remove());
        // [2, 3]
        System.out.println(minHeap.toString());
        minHeap.add(4);
        // Add too many elements
        minHeap.add(5);
        // [2,3,4]
        System.out.println(minHeap.toString());

    }

    //Methods - get min, deleteEntry, insertEntry, fetchsize

    int [] minHeap;
    int heapSizeYouWant;
    int realSizeCurrently=0;

    MyMinHeap(int size){
        this.minHeap=new int[size+1];
        this.heapSizeYouWant=size;
        minHeap[0]=0;
    }

    public void add(int addEntry){

        realSizeCurrently++;
        if(realSizeCurrently>heapSizeYouWant){
            System.out.println("Can't add any more elements");
            realSizeCurrently--;
            return;
        }
        minHeap[realSizeCurrently]=addEntry;
        int index = realSizeCurrently;
        int parent = index/2;

        while(minHeap[index]<minHeap[parent] && index>1){
            int temp=minHeap[index];
            minHeap[index]=minHeap[parent];
            minHeap[parent]=temp;
            index=parent;
            parent=index/2;
        }

    }

    public int peek(){
        return minHeap[1];
    }

    public int remove(){

        if(realSizeCurrently<1){
            System.out.println("No entry available in Heap");
            return Integer.MIN_VALUE;
        }
        int removeElement = minHeap[1];

        minHeap[1]=minHeap[realSizeCurrently];
        realSizeCurrently--;
        int index = 1;
        while(index<=realSizeCurrently/2){

            int left = index*2;
            int right =index*2+1;


            if (minHeap[index] > minHeap[left] || minHeap[index] > minHeap[right]) {
                if(minHeap[left]<minHeap[right]){
                    int temp = minHeap[left];
                    minHeap[left]=minHeap[right];
                    minHeap[right]=temp;
                    index=left;
                }else{
                    int temp = minHeap[right];
                    minHeap[right]=minHeap[left];
                    minHeap[left]=temp;
                    index=right;
                }
            }else {
                break;
            }
        }
        return removeElement;
    }
    public int size() {
        return realSizeCurrently;
    }

    public String toString() {
        if (realSizeCurrently == 0) {
            return "No element!";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 1; i <= realSizeCurrently; i++) {
                sb.append(minHeap[i]);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(']');
            return sb.toString();
        }
    }
}
