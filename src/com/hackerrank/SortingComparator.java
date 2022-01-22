package com.hackerrank;

import java.util.Comparator;

public class SortingComparator {
    public static void main(String[] args) {

    }


}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {

        if (o1.score > o2.score) {
            return 1;
        } else if (o1.score == o2.score) {

            if(o1.name.compareTo(o2.name)<0){
                return -1;
            }else {
                return 1;
            }
        } else {
            return -1;
        }
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
