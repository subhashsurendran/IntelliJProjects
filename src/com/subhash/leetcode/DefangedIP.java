package com.subhash.leetcode;

public class DefangedIP {

    public static void main(String[] args) {
        DefangedIP dIp = new DefangedIP();
        String ipAddress = "192.68.256.15";
        System.out.println(dIp.defangIPAddress(ipAddress));
    }

    private String defangIPAddress(String ipAddress){

        StringBuilder sb = new StringBuilder();
        for(int i =0;i<ipAddress.length();i++){

            if(ipAddress.charAt(i)=='.'){

                String c = "[.]";
                sb.append(c);
            }else{

                sb.append(ipAddress.charAt(i));
            }
        }
        return sb.toString();

    }
}
