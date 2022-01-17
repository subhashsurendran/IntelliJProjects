/*
package com.twilio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;

public class sds{

}

class Result {

    */
/*
     * Complete the 'smallestNegativeBalance' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts 2D_STRING_ARRAY debts as parameter.
     *//*


    public static List<String> smallestNegativeBalance(List<List<String>> debts) {
        // Write your code here
        List<BorrowerLender> borrowerLenders = new ArrayList<>();
        for(List<String> debt: debts){
            borrowerLenders.add(new BorrowerLender(debt.get(0), debt.get(1), Integer.parseInt(debt.get(2))));
        }

        List<Borrower> x = borrowerLenders.stream().map(o->o.borrower).collect(new B);

    }


}
class BorrowerLender{

    String borrower;
    String lender;
    int amount;

    BorrowerLender(String borrower, String lender, int amount){
        this.borrower=borrower;
        this.lender=lender;
        this.amount=amount;
    }
}

class Borrower{
    String borrower;
    int amount;
    Borrower(String borrower, int amount){
        this.borrower=borrower;
        this.amount=amount;
    }
}

class Lender{
    String lender;
    int amount;
    Lender(String lender, int amount){
        this.lender=lender;
        this.amount=amount;
    }
}*/
