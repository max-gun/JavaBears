package designpattern;

import static designpattern.CarModel.*;

public class CarFactory {


    Car manufacture(CarModel carModel) {
        if (HONDA.equals(carModel))
            return new Honda();

        if (KIA.equals(carModel))
            return new Kia();

        if (DODGE.equals(carModel))
            return new Dodge();

        return null;
    }
}
