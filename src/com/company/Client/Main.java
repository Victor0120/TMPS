package com.company.Client;

import com.company.Domain.Clients.Implementations.ClientCollection;
import com.company.Domain.Clients.Implementations.ClientListManager;
import com.company.Domain.Clients.Implementations.Lifter;
import com.company.Domain.Equipment.Implementations.Treadmill;
import com.company.Utilities.Decorators.TreadmillDecorator;
import com.company.Domain.Equipment.Abstractions.BarBuilder;
import com.company.Domain.Equipment.Implementations.HeavyBar;
import com.company.Domain.Equipment.Implementations.LightBar;
import com.company.Domain.Equipment.Implementations.WeightedBar;
import com.company.Domain.Staff.Trainer;
import com.company.Domain.Staff.Cashier;
import com.company.Domain.Equipment.Implementations.Dumbbel;
import com.company.Domain.Clients.Implementations.BossOfThisGym;

public class Main {

    public static void main(String[] args) {

        BossOfThisGym boss = BossOfThisGym.getInstance();
        boss.say();
        System.out.println();


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

        //Facade
        System.out.println("");
        Cashier cashier = new Cashier();
        cashier.buyLimitedMembership();
        cashier.buyUnlimitedMembership();

        //Composite
        Lifter bob = new Lifter("Big Bob", 300);

        Lifter john = new Lifter("John", 200);
        Lifter dan = new Lifter("Dan", 200);

        Lifter mark = new Lifter("Mark", 100);
        Lifter nick = new Lifter("Nick", 100);
        Lifter l1 = new Lifter("l1", 100);
        Lifter l2 = new Lifter("l2", 100);

        bob.add(john);
        bob.add(dan);

        john.add(mark);
        john.add(l1);
        dan.add(nick);
        dan.add(l2);

        System.out.println("");

        bob.getInfo();
        System.out.println("-------------");
        for (Lifter l : bob.getMentees()){
            l.getInfo();
            System.out.println("-------------");
            for (Lifter lifter : l.getMentees()){
                lifter.getInfo();
            }
            System.out.println("-------------");
        }

        //Decorator
        Treadmill treadmill = new Treadmill();
        treadmill.activate();
        TreadmillDecorator decoratedTreadmill = new TreadmillDecorator(treadmill);
        decoratedTreadmill.activate(10);

        System.out.println("__________________");
        ClientCollection cc = new ClientCollection();
        cc.addClient("Rick Dalton", 55, "079654789");
        ClientListManager manager = new ClientListManager(cc);
        manager.printClients();
    }
}
