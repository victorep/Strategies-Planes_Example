package me.vepu.design_patterns.strategy_planes;

import me.vepu.design_patterns.strategy_planes.BehavioursImpl.engines.JetEnginesBehaviour;
import me.vepu.design_patterns.strategy_planes.BehavioursImpl.engines.PropelorBehaviour;
import me.vepu.design_patterns.strategy_planes.BehavioursImpl.purpose.CarryCargoPurposeBehaviour;
import me.vepu.design_patterns.strategy_planes.BehavioursImpl.purpose.CarryPersonsAndLuggagePurposeBehaviour;
import me.vepu.design_patterns.strategy_planes.BehavioursImpl.wheels.FixedWheelsBehaviour;
import me.vepu.design_patterns.strategy_planes.BehavioursImpl.wheels.RetractableWheelsBehaviour;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("=====A jet plane for cargo with retractable wheels======");
        Plane cargoJet = new Plane(new JetEnginesBehaviour(),new RetractableWheelsBehaviour(),new CarryCargoPurposeBehaviour());
        System.out.println("========================================================");
        System.out.println();
        System.out.println("==A propelor plane for persons with retractable wheels==");
        Plane personsPropelor = new Plane(new PropelorBehaviour(),new RetractableWheelsBehaviour(),new CarryPersonsAndLuggagePurposeBehaviour());
        System.out.println("========================================================");
        System.out.println();
        System.out.println("======A propelor plane for cargo with fixed wheels======");
        Plane cargoPropelor = new Plane(new PropelorBehaviour(),new FixedWheelsBehaviour(),new CarryCargoPurposeBehaviour());
        System.out.println("========================================================");
    }
}
