package com.techgig;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Question2 {

    public static void main(String[] args) {
        try{
            File file = new File("data.txt");
            file.createNewFile();
            FileWriter fr = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fr);
            bw.append("javachamp");
            bw.flush();
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
