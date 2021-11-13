package com.company.Domain.Equipment.Implementations;

import com.company.Utilities.Prototype.Prototype;

public class Dumbbel implements Prototype {

    private int weight;

    public Dumbbel(int weight) {
        this.weight = weight;
    }

    public void getWeight() {
        System.out.println("Weight is: " + this.weight);
    }

    public Prototype getClone() {
        return new Dumbbel(weight);
    }
}
