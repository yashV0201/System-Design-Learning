package StrategyPattern;

import StrategyPattern.Strategy.*;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SportsDriveCapability());
    }
}
