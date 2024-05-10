package StrategyPattern;

import StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObj;
    
    Vehicle(DriveStrategy obj){
        this.driveObj = obj;
    }

    public void drive(){
        driveObj.drive();
    }
}
