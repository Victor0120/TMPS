package com.company.Domain.Staff;

import com.company.Domain.Equipment.Implementations.LimitedMembership;
import com.company.Domain.Equipment.Abstractions.Membership;
import com.company.Domain.Equipment.Implementations.UnlimitedMembership;

public class Cashier {

    private Membership limited;
    private Membership unlimited;

    public Cashier(){
        limited = new LimitedMembership();
        unlimited = new UnlimitedMembership();
    }

    public void buyLimitedMembership(){
        limited.buy();
    }

    public void buyUnlimitedMembership(){
        unlimited.buy();
    }
}
