package com.publicis;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aa {
}
class B implements Serializable{
    private static Aa a = new Aa();

    public static void main(String[] args) {
        B b = new B();
        try{
            FileOutputStream fs = new FileOutputStream("b.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(b);
            os.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
