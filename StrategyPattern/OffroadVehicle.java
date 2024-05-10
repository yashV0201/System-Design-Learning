package StrategyPattern;

import StrategyPattern.Strategy.*;

public class OffroadVehicle extends Vehicle {
    OffroadVehicle(){
        super(new SportsDriveCapability());
    }
}
