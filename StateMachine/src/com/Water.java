package com;

import com.States.LiquidWater;
import com.States.StateOfWater;

public class Water {
    private StateOfWater state;

    public Water() {
        state= new LiquidWater();
    }

    public Water(StateOfWater state) {
        this.state = state;
    }

    public void setState(StateOfWater state)
    {
        this.state=state;
    }

    public void increaseTemp()
    {
        state.increaseTemp(this);
    }

    public void decreaseTemp()
    {
        state.decreaseTemp(this);
    }
    public void printCondition()
    {
        System.out.println(state);
    }

}
