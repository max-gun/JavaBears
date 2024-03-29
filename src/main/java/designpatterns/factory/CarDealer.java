package designpatterns.factory;

import designpatterns.cars.Car;
import designpatterns.creator.CarCreator;
import designpatterns.strategy.CarStrategyCreator;

import java.util.Map;

import static designpatterns.factory.CarModel.*;

public class CarDealer {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        /*
        Car honda = carFactory.manufacture(HONDA);
        Car kia = carFactory.manufacture(KIA);
        Car dodge = carFactory.manufacture(DODGE);

        System.out.println(honda.drive());
        System.out.println(kia.drive());
        System.out.println(dodge.drive());
        */

        Map<CarModel, CarCreator> strategies = carFactory.getMap();

        CarStrategyCreator carStrategyCreator = new CarStrategyCreator();
        carStrategyCreator.setStrategy(strategies.get(HONDA));

        Car car = carStrategyCreator.manufacture();
        System.out.println(car.drive());
    }
}
