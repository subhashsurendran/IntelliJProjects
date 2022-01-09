package com.Cisco;

import java.util.HashSet;
import java.util.Scanner;

class InvalidInputException extends Exception {

    public InvalidInputException(String message){
        super(message);
    }

}

class Employee {

    private int id = 0;
    private String name = null;
    private boolean male = true;

    Employee(int id, String name,  boolean male) {
        super();
        this.id = id;
        this.name = name;
        this.male = male;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ",  male=" + male + "]";
    }

    @Override
    public int hashCode() {
        // Complete all relevent code

        int hash = 3;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
        {
            return true;
        }
        Employee ob = (Employee)obj;
        if(this.id==ob.id){
            return true;
        }
        return false;

    }

}

public class Test {

    /*
     * Validate the input and create Employee object
     * If any of the given input is not valid throw InvalidInputException();
     */
    public static Employee createEmployee(String record) throws InvalidInputException{
        if(record==null || record.length()==0){
            throw new InvalidInputException("Bad Record found");
        }

        String [] inputArr=record.split(",");
        int employeeID = Integer.parseInt(inputArr[0]);
        String employeeName = inputArr[1];
        Boolean maleIndicator =Boolean.parseBoolean(inputArr[2]);
        //Complete the code
        Employee emp = new Employee(employeeID, employeeName, maleIndicator);
        return emp;

    }

    public static void main(String[] str) {

        //Input is expected as comma separated values for Employee object like id(int), name (String),isMale(boolean)"
        // 1,John,true
        Scanner scan = new Scanner(System.in);
        //String inputString =scan.nextLine();


        HashSet<Employee> employeeSet = new HashSet<>();

        /*Process each line and create Employee object using the "createEmployee" method add in employeeSet*/
        while (scan.nextLine()!=null) {
            try {
                Employee newEmployee = createEmployee(scan.nextLine());
                employeeSet.add(newEmployee);

            }catch(Exception e) {
                System.out.println(e.getClass().getName());
                System.exit(0);
            }

        }

        //Don't delete or modify this print statement
        System.out.println("Employees info : "+ employeeSet);

    }

}