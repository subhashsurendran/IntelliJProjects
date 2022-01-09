package com.subhash.singleton;

public class MySingleton{

    private static volatile MySingleton mySingleton;

    private MySingleton(){

    }

    private static MySingleton getInstance(){

        if(mySingleton == null){

            synchronized (MySingleton.class){ //Double Checked locking
                if(mySingleton==null){
                    mySingleton=new MySingleton();
                }
            }
        }

        return mySingleton;
    }

}