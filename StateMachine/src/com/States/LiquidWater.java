package com.States;

import com.Water;

public class LiquidWater extends StateOfWater{

    public LiquidWater() {
    }

    @Override
    public void increaseTemp(Water water) {
        water.setState(new WaterVapor());
    }

    @Override
    public void decreaseTemp(Water water) {

        water.setState(new Ice());

    }


    @Override
    public String toString() {
        return super.toString()+"Liquid";
    }
}
