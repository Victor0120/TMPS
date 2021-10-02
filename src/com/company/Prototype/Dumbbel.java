package com.company.Prototype;

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
