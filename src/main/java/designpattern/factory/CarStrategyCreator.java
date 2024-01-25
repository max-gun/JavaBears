package designpattern.factory;

import designpattern.cars.Car;
import designpattern.creator.CarCreator;

public class CarStrategyCreator {
    CarCreator strategy;

    public void setStrategy(CarCreator strategy) {
        this.strategy = strategy;
    }

    public Car manufacture() {
        return strategy.manufacture();
    }
}
