package com.synechron;

public class IncrementingThread extends Thread{

    private InventoryCounter inventoryCounter;

    public IncrementingThread(InventoryCounter inventoryCounter){
        this.inventoryCounter=inventoryCounter;
    }
    @Override
    public void run(){

        for(int i =0;i<10000;i++){
            inventoryCounter.increment();
        }

    }
}
