
package com.twilio;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question1 {

    public static void main(String[] args) {

        List<String>mystring = new ArrayList<>();
        mystring.add("Alex");
        mystring.add("Blake");
        mystring.add("5");
        List<String>mystring2 = new ArrayList<>();
        mystring2.add("Blake");
        mystring2.add("Alex");
        mystring2.add("5");
        List<String>mystring3 = new ArrayList<>();
        mystring3.add("Alex");
        mystring3.add("Overton");
        mystring3.add("5");
        List<String>mystring4 = new ArrayList<>();
        mystring4.add("Alex");
        mystring4.add("Shay");
        mystring4.add("5");

        List<List<String>> mylistStrings = new ArrayList<>();
        mylistStrings.add(mystring);
        mylistStrings.add(mystring2);
        mylistStrings.add(mystring3);
        mylistStrings.add(mystring4);


        smallestNegativeBalance(mylistStrings);
    }

    public static List<String> smallestNegativeBalance(List<List<String>> debts) {
        // Write your code here
        List<BorrowerLender> borrowerLenders = new ArrayList<>();
        Map<String, Balance> balanceSheet = new HashMap<>();
        for(List<String> debt: debts){
            borrowerLenders.add(new BorrowerLender(debt.get(0), debt.get(1), Integer.parseInt(debt.get(2))));
        }

        System.out.println("stopping point");
        Map<String, Integer> borrowersMap =
                borrowerLenders.stream().collect(Collectors.toMap(BorrowerLender::getBorrower,
                        BorrowerLender::getAmount, (old, newval)->old+newval, TreeMap::new));
        Map<String, Integer> lendersMap =
                borrowerLenders.stream().collect(Collectors.toMap(BorrowerLender::getLender,
                BorrowerLender::getAmount, (old, newval)->old+newval, TreeMap::new));

        borrowersMap.forEach((key, value) -> {
            if(balanceSheet.containsKey(key)){
                balanceSheet.get(key).updateBalance(value, true);
            }else {
                Balance X = new Balance(key, value, true);
                balanceSheet.put(key, X);
            }
        });
        for (Map.Entry<String, Integer> entry : lendersMap.entrySet()) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            if(balanceSheet.containsKey(k)){
                balanceSheet.get(k).updateBalance(v,false);
            }else {
                Balance X = new Balance(k, v, false);
                balanceSheet.put(k,X);
            }
        }


        System.out.println("");


        return null;
    }
}

class BorrowerLender{
    public String getBorrower() {
        return borrower;
    }

    public String getLender() {
        return lender;
    }

    public int getAmount() {
        return amount;
    }

    String borrower;
    String lender;
    int amount;
    BorrowerLender(String borrower, String lender, int amount){
        this.borrower=borrower;
        this.lender=lender;
        this.amount=amount;
    }
}

class Balance{

    String person;
    int amount=0;

    Balance(String person, int amount, boolean moneyType){
        this.person=person;
        if(moneyType) this.amount+=amount;
        if(!moneyType)this.amount-=amount;

    }

    public void updateBalance(int money, boolean moneyType){
        if(moneyType){
            amount+=money;
        }else{
           amount-=money;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Balance balance = (Balance) o;

        return person.equals(balance.person);
    }

    @Override
    public int hashCode() {
        return person.hashCode();
    }
}