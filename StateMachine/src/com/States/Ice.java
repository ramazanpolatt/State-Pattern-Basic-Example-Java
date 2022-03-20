package com.States;

import com.Water;

public class Ice extends StateOfWater{

    public Ice() {
    }

    @Override
    public void increaseTemp(Water water) {
        water.setState(new LiquidWater());
    }

    @Override
    public void decreaseTemp(Water water) {

    }


    @Override
    public String toString() {
        return super.toString()+"Ice";
    }
}
