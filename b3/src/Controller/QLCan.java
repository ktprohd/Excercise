package Controller;

import Model.Candidate;

import java.util.ArrayList;

public class QLCan {
    ArrayList<Candidate> lists;
    public QLCan(){
        this.lists=new ArrayList<>();
    }
    public void addCan(Candidate candidate){
        lists.add(candidate);
    }
    public void showCan(){
        lists.forEach(candidate -> System.out.println(candidate.toString()));
    }
    public Candidate searchCan(String sbd){
        return lists.stream().filter(candidate -> candidate.getSbd().equals(sbd)).findFirst().orElse(null);
    }
}
