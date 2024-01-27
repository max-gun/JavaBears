package designpatterns.strategy;

import designpatterns.cars.Car;
import designpatterns.creator.CarCreator;

public class CarStrategyCreator {
    CarCreator strategy;

    public void setStrategy(CarCreator strategy) {
        this.strategy = strategy;
    }

    public Car manufacture() {
        return strategy.manufacture();
    }
}
