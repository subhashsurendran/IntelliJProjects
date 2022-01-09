package com.synechron;

import java.util.*;

public class FileReader {


    public static void main(String[] args) {


        List<String> arr = new ArrayList<String>(4);

        // using add() to initialize values
        // ["geeks", "for", "geeks"]
        arr.add("geeks");
        arr.add("for");
        arr.add("geeks");

        if(arr.contains("geeks")){
            String geeks = arr.get(arr.indexOf("geeks"));
            System.out.println("fetched using indexOf "+geeks);
        }



        Map<String, Integer> xyz = new HashMap<>();
        xyz.put("IBM",150);
        xyz.put("Microsoft",50);
        xyz.put("Google",450);
        xyz.put("Facebook",250);

        List<CustomerClass> customerListAndVolume = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : xyz.entrySet()){
            CustomerClass tempClass = new CustomerClass(entry.getKey(), entry.getValue());
            customerListAndVolume.add(tempClass);
        }

        Collections.sort(customerListAndVolume,new CustomClassComparator());
        customerListAndVolume.stream().limit(2).forEach(System.out::println);

    }

}


class CustomClassComparator implements Comparator<CustomerClass>{

    @Override
    public int compare(CustomerClass o1, CustomerClass o2) {
       return -Integer.compare(o1.getCustomerVolume(), o2.getCustomerVolume());
    }
}
class CustomerClass {

    String customerName;
    int customerVolume;

    public int getCustomerVolume() {
        return customerVolume;
    }

    public void setCustomerVolume(int customerVolume) {
        this.customerVolume = customerVolume;
    }

    public CustomerClass(String customerName, int customerVolume){
        this.customerName=customerName;
        this.customerVolume=customerVolume;
    }

    @Override
    public String toString() {
        return "CustomerClass{" +
                "customerName='" + customerName + '\'' +
                ", customerVolume=" + customerVolume +
                '}';
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


}

