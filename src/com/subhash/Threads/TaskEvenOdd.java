package com.subhash.Threads;

public class TaskEvenOdd implements Runnable
{

    private final Printer printer;
    private final int max;
    private final boolean isEvenNumber;

    public TaskEvenOdd(Printer printer, int max, boolean isEvenNumber){
        this.printer=printer;
        this.max = max;
        this.isEvenNumber=isEvenNumber;
    }



    public static void main(String[] args) {

        Printer print = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(print,10, false), "Odd");
        Thread t2 = new Thread(new TaskEvenOdd(print, 10, true), "Even");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        int number = isEvenNumber?2:1;
        while(number<=max){
            if(isEvenNumber){
                printer.printEven(number);
            }else{
                printer.printOdd(number);
            }
            number+=2;
        }
    }
}
