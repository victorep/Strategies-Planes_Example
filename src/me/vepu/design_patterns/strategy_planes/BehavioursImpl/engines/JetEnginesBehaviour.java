package me.vepu.design_patterns.strategy_planes.BehavioursImpl.engines;

import me.vepu.design_patterns.strategy_planes.Behaviours.IPlaneEnginesBehaviour;

public class JetEnginesBehaviour implements IPlaneEnginesBehaviour {

    public void engines(){
        System.out.println("I have jet engines");
    }
}
