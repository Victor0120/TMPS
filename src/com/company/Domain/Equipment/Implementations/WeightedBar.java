package com.company.Domain.Equipment.Implementations;

import com.company.Domain.Equipment.Abstractions.BarWithWeights;

public class WeightedBar implements BarWithWeights {

    private String barType;
    private int plates20kgCount;
    private int plates15kgCount;
    private int plates10kgCount;
    private int plates5kgCount;
    private int plates1kgCount;

    public void setBarType(String barType) {
        this.barType = barType;
    }

    public void set20kgPlatesNumber(int number) {
        this.plates20kgCount = number;
    }

    public void set15kgPlatesNumber(int number) {
        this.plates15kgCount = number;
    }

    public void set10kgPlatesNumber(int number) {
        this.plates10kgCount = number;
    }

    public void set5kgPlatesNumber(int number) {
        this.plates5kgCount = number;
    }

    public void set1kgPlatesNumber(int number) {
        this.plates1kgCount = number;
    }

    public int getBarWeight() {
        int weight = 0;

        if (this.barType == "Straight") {
            weight += 20;
        }
        if (this.barType == "Curled") {
            weight += 10;
        }
        weight += this.plates1kgCount;
        weight += this.plates5kgCount * 5;
        weight += this.plates10kgCount * 10;
        weight += this.plates15kgCount * 15;
        weight += this.plates20kgCount * 20;


        return weight;
    }
}
