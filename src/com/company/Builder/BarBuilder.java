package com.company.Builder;

public interface BarBuilder {
    public void setBarType();

    public void set20kgPlates();

    public void set15kgPlates();

    public void set10kgPlates();

    public void set5kgPlates();

    public void set1kgPlates();

    public WeightedBar getWeightedBar();
}
