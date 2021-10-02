package com.company.Builder;

public class LightBar implements BarBuilder {

    private WeightedBar weightedBar;

    public LightBar() {
        this.weightedBar = new WeightedBar();
    }

    public void setBarType() {
        weightedBar.setBarType("Curled");
    }

    public void set20kgPlates() {
        weightedBar.set20kgPlatesNumber(0);
    }

    public void set15kgPlates() {
        weightedBar.set15kgPlatesNumber(0);
    }

    public void set10kgPlates() {
        weightedBar.set10kgPlatesNumber(0);
    }

    public void set5kgPlates() {
        weightedBar.set5kgPlatesNumber(0);
    }

    public void set1kgPlates() {
        weightedBar.set1kgPlatesNumber(2);
    }

    public WeightedBar getWeightedBar() {
        return this.weightedBar;
    }

}
