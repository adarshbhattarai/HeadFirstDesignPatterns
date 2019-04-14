package com.headfirst.patterns.decoratorPattern.illustration;

/**
 * Created by adarshbhattarai on 4/14/19.
 */
public abstract  class Beverage {
   String description;
    boolean hasMocha;
    boolean hasSoy;
    boolean hasMilk;
    boolean hasWhip;

    abstract float cost();
    public void setHasMocha(boolean hasMocha) {
        this.hasMocha = hasMocha;
    }

    public void setHasSoy(boolean hasSoy) {
        this.hasSoy = hasSoy;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public void setHasWhip(boolean hasWhip) {
        this.hasWhip = hasWhip;
    }
}
