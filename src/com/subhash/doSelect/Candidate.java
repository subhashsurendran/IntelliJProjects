package com.subhash.doSelect;

import java.util.*;

public class Candidate {

    private String candidateName;
    private int votes;

    public Candidate(String candidateName, int votes){
        this.candidateName=candidateName;
        this.votes = votes;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    @Override
    public String toString() {
        return "Candidate Name is: "+candidateName +
                "Vote Count is: "+ votes;
    }

    public static void main(String[] args) {

       List<Candidate> candidates = Arrays.asList(new Candidate("Subhash1", 15), new Candidate("Subhash2", 45)
                , new Candidate("Subhash4", 95), new Candidate("Subhash4", 75));
       Optional<Candidate> max = candidates.stream().max(Comparator.comparing(Candidate::getVotes));
       Candidate candidate = max.get();
       System.out.println("Candidate name with max votes is "+candidate.getCandidateName()+ " , " + candidate.getVotes());


    }
}
