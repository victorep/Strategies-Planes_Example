package me.vepu.design_patterns.strategy_planes.BehavioursImpl.purpose;

import me.vepu.design_patterns.strategy_planes.Behaviours.IPlanePurposeBehaviour;

public class CarryPersonsAndLuggagePurposeBehaviour implements IPlanePurposeBehaviour{
    @Override
    public void purpose() {
        System.out.println("I only carry persons and their luggage!");
    }
}
