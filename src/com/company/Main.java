package com.company;

import com.company.Builder.*;
import com.company.Prototype.Dumbbel;
import com.company.Singleton.BossOfThisGym;

public class Main {

    public static void main(String[] args) {

        BossOfThisGym boss = BossOfThisGym.getInstance();
        boss.say();


        BarBuilder heavyBar = new HeavyBar();
        BarBuilder lightBar = new LightBar();
        WeightedBar customBar = new WeightedBar();

        Trainer trainer1 = new Trainer(heavyBar);
        Trainer trainer2 = new Trainer(lightBar);

        trainer1.assembleBar();
        trainer2.assembleBar();

        customBar.setBarType("Curled");
        customBar.set20kgPlatesNumber(4);
        customBar.set5kgPlatesNumber(2);

        WeightedBar weightedBar1 = trainer1.getWeightedBar();
        WeightedBar weightedBar2 = trainer2.getWeightedBar();

        System.out.println("Constructed Heavy customBar with weight: " + weightedBar1.getBarWeight() + "kg");
        System.out.println("Constructed Light customBar with weight: " + weightedBar2.getBarWeight() + "kg");
        System.out.println("Constructed Custom customBar with weight: " + customBar.getBarWeight() + "kg");

        Dumbbel db1 = new Dumbbel(10);
        Dumbbel db2 = (Dumbbel) db1.getClone();

        db1.getWeight();
        db2.getWeight();
    }
}
