package com.subhash.doSelect;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class StateKey implements Comparable<StateKey> {

    String stateName;
    String statePartyName;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStatePartyName() {
        return statePartyName;
    }

    public void setStatePartyName(String statePartyName) {
        this.statePartyName = statePartyName;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    int votes;

   public StateKey(String stateName, String statePartyName, int votes){
        this.stateName=stateName;
        this.statePartyName=statePartyName;
        this.votes=votes;

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StateKey stateKey = (StateKey) o;

        if (votes != stateKey.votes) return false;
        if (stateName != null ? !stateName.equals(stateKey.stateName) : stateKey.stateName != null) return false;
        return statePartyName != null ? statePartyName.equals(stateKey.statePartyName) : stateKey.statePartyName == null;
    }

    @Override
    public String toString() {
        return "StateKey{" +
                "stateName='" + stateName + '\'' +
                ", statePartyName='" + statePartyName + '\'' +
                ", votes=" + votes +
                '}';
    }

    @Override
    public int hashCode() {
        int result = stateName != null ? stateName.hashCode() : 0;
        result = 31 * result + (statePartyName != null ? statePartyName.hashCode() : 0);
        result = 31 * result + votes;
        return result;
    }

    @Override
    public int compareTo(StateKey o) {
        return
                o.getVotes()-this.getVotes();
    }


    public static void main(String[] args) {
        NavigableMap<StateKey, Integer> hm = new TreeMap<StateKey, Integer>();

        hm.comparator();


        StateKey sk1 = new StateKey("TN", "BJP",1000);
        StateKey sk9 = new StateKey("TN", "INC",1000);
        StateKey sk2 = new StateKey("KL", "INC",3000);
        StateKey sk3 = new StateKey("KA", "BJD",5000);
        StateKey sk8 = new StateKey("TN", "TMC",2000);
        StateKey sk4 = new StateKey("MP", "TMC",7000);

        hm.put(sk1, 1);
        hm.put(sk2, 2);
        hm.put(sk3, 3);
        hm.put(sk4, 4);
        hm.put(sk8, 4);
        hm.put(sk9, 4);

        for(Map.Entry<StateKey, Integer> entries:hm.entrySet()){
            System.out.println(entries.getKey());
        }
    }


}

