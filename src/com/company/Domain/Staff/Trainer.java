package com.company.Domain.Staff;

import com.company.Domain.Equipment.Abstractions.BarBuilder;
import com.company.Domain.Equipment.Implementations.WeightedBar;

public class Trainer {
    private BarBuilder barBuilder;

    public Trainer(BarBuilder barBuilder) {
        this.barBuilder = barBuilder;
    }

    public WeightedBar getWeightedBar() {
        return this.barBuilder.getWeightedBar();
    }

    public void assembleBar() {
        this.barBuilder.setBarType();
        this.barBuilder.set20kgPlates();
        this.barBuilder.set15kgPlates();
        this.barBuilder.set10kgPlates();
        this.barBuilder.set5kgPlates();
        this.barBuilder.set1kgPlates();
    }
}
