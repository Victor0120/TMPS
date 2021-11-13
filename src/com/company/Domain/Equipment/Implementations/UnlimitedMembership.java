package com.company.Domain.Equipment.Implementations;

import com.company.Domain.Equipment.Abstractions.Membership;

public class UnlimitedMembership implements Membership {

    String name = "Unlimited Membership";
    String price = "100$";

    @Override
    public void buy(){
        System.out.println("You bought the "+ name +" for " + price);
    }

}
