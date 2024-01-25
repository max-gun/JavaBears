package designpattern.factory;

import designpattern.cars.Car;
import designpattern.cars.Dodge;
import designpattern.cars.Honda;
import designpattern.cars.Kia;
import designpattern.creator.CarCreator;
import designpattern.creator.HondaCreator;

import static designpattern.factory.CarModel.*;

public class CarFactory {

    CarCreator hondaCreator;

    public CarFactory() {
        hondaCreator = new HondaCreator();
    }

    Car manufacture(CarModel carModel) {
        if (HONDA.equals(carModel))
            return hondaCreator.manufacture();

        if (KIA.equals(carModel))
            return new Kia();

        if (DODGE.equals(carModel))
            return new Dodge();

        return null;
    }
}
