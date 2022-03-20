package com.States;

import com.Water;

public abstract class StateOfWater {


    abstract public  void increaseTemp(Water water);
    abstract public  void decreaseTemp(Water water);

    @Override
    public String toString() {
        return "State of water is ";
    }
}
