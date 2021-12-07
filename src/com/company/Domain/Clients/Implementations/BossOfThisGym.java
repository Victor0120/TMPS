package com.company.Domain.Clients.Implementations;

public class BossOfThisGym {
    private static volatile BossOfThisGym boss = null;

    private BossOfThisGym() {
    }

    public static BossOfThisGym getInstance() {
        if (boss == null) {
            synchronized (BossOfThisGym.class) {
                if (boss == null) {
                    boss = new BossOfThisGym();
                }
            }
        }
        return boss;
    }

    public void say(){
        System.out.println("I am the boss of this gym!");
    }

}
