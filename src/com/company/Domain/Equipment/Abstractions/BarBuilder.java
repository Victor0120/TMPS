package com.company.Domain.Equipment.Abstractions;

import com.company.Domain.Equipment.Implementations.WeightedBar;

public interface BarBuilder {
    public void setBarType();

    public void set20kgPlates();

    public void set15kgPlates();

    public void set10kgPlates();

    public void set5kgPlates();

    public void set1kgPlates();

    public WeightedBar getWeightedBar();
}
