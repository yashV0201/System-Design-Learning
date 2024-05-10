package StrategyPattern;

import StrategyPattern.Strategy.*;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
