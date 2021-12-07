package com.company.Domain.Clients.Implementations;

import java.util.ArrayList;
import java.util.List;

public class Lifter {

    private String name;
    private int maxLiftWeight;
    private List<Lifter> mentees;

    public Lifter (String name, int maxLiftWeight){
        this.name = name;
        this.maxLiftWeight = maxLiftWeight;
        mentees = new ArrayList<Lifter>();
    }

    public void add (Lifter mentee){
        mentees.add(mentee);
    }

    public void remove (Lifter mentee){
        mentees.remove(mentee);
    }

    public List<Lifter> getMentees(){
        return mentees;
    }

    public void getInfo(){
        System.out.println("Lifter "+ name +" can lift "+ maxLiftWeight +" kg");
    }
}
