package com.States;

import com.Water;

public class WaterVapor extends StateOfWater{

    public WaterVapor() {
    }

    @Override
    public void increaseTemp(Water water) {;

    }

    @Override
    public void decreaseTemp(Water water) {
        water.setState(new LiquidWater());

    }

    @Override
    public String toString() {
        return super.toString()+"Vapor";
    }
}
