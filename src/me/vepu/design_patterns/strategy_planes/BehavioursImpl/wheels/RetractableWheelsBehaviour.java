package me.vepu.design_patterns.strategy_planes.BehavioursImpl.wheels;

import me.vepu.design_patterns.strategy_planes.Behaviours.IPlaneWheelsBehaviour;

public class RetractableWheelsBehaviour implements IPlaneWheelsBehaviour {

    public void wheels(){
        System.out.println("I have retractable wheels");
    }
}
