package com.company.Builder;

public class HeavyBar implements BarBuilder {

    private WeightedBar weightedBar;

    public HeavyBar() {
        this.weightedBar = new WeightedBar();
    }

    public void setBarType() {
        weightedBar.setBarType("Straight");
    }

    public void set20kgPlates() {
        weightedBar.set20kgPlatesNumber(2);
    }

    public void set15kgPlates() {
        weightedBar.set15kgPlatesNumber(2);
    }

    public void set10kgPlates() {
        weightedBar.set10kgPlatesNumber(2);
    }

    public void set5kgPlates() {
        weightedBar.set5kgPlatesNumber(2);
    }

    public void set1kgPlates() {
        weightedBar.set1kgPlatesNumber(2);
    }

    public WeightedBar getWeightedBar() {
        return this.weightedBar;
    }
}
