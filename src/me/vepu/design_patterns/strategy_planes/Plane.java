package me.vepu.design_patterns.strategy_planes;

import me.vepu.design_patterns.strategy_planes.Behaviours.IPlaneEnginesBehaviour;
import me.vepu.design_patterns.strategy_planes.Behaviours.IPlanePurposeBehaviour;
import me.vepu.design_patterns.strategy_planes.Behaviours.IPlaneWheelsBehaviour;

public class Plane {

    private IPlaneEnginesBehaviour eB;
    private IPlaneWheelsBehaviour wB;
    private IPlanePurposeBehaviour pB;

    public void engines(){
        this.eB.engines();
    }

    public void wheels(){
       this.wB.wheels();
    }

    public void purpose(){
        this.pB.purpose();
    }

    public void printMyBehaviour(){
        engines();
        wheels();
        purpose();
    }

    public Plane(IPlaneEnginesBehaviour eB, IPlaneWheelsBehaviour wB, IPlanePurposeBehaviour pB){
        this.eB=eB;
        this.wB=wB;
        this.pB=pB;
        printMyBehaviour();
    }
}
