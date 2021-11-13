package com.company.Utilities.Builders;

import com.company.Domain.Equipment.Implementations.HeavyBar;
import com.company.Domain.Equipment.Implementations.LightBar;
import com.company.Domain.Equipment.Implementations.WeightedBar;
import com.company.Domain.Staff.Trainer;
import com.company.Domain.Equipment.Abstractions.BarBuilder;

public class Builder {
    public static void main(String[] args) {
        BarBuilder heavyBar = new HeavyBar();
        BarBuilder lightBar = new LightBar();
        WeightedBar bar = new WeightedBar();
        Trainer trainer1 = new Trainer(heavyBar);
        Trainer trainer2 = new Trainer(lightBar);

        trainer1.assembleBar();
        trainer2.assembleBar();
        bar.set20kgPlatesNumber(4);
        bar.setBarType("Curled");
        bar.set5kgPlatesNumber(2);

        WeightedBar weightedBar1 = trainer1.getWeightedBar();
        WeightedBar weightedBar2 = trainer2.getWeightedBar();

        System.out.println("Constructed Heavy bar with weight: " + weightedBar1.getBarWeight() + "kg");
        System.out.println("Constructed Light bar with weight: " + weightedBar2.getBarWeight() + "kg");
        System.out.println("Constructed Custom bar with weight: " + bar.getBarWeight() + "kg");
    }
}
