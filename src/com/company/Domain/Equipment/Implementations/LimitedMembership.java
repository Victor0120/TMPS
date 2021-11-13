package com.company.Domain.Equipment.Implementations;

import com.company.Domain.Equipment.Abstractions.Membership;

public class LimitedMembership implements Membership {

    String name = "Limited Membership";
    String price = "50$";

    @Override
    public void buy(){
        System.out.println("You bought the "+ name +" for " + price);
    }

}
