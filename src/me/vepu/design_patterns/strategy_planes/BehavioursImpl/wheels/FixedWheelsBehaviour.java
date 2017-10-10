package me.vepu.design_patterns.strategy_planes.BehavioursImpl.wheels;

import me.vepu.design_patterns.strategy_planes.Behaviours.IPlaneWheelsBehaviour;

public class FixedWheelsBehaviour implements IPlaneWheelsBehaviour {

    public void wheels(){
        System.out.println("I have fixed wheels. I can't fly that fast :( ");
    }
}
