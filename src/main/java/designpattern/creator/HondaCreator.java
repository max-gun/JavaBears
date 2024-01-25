package designpattern.creator;

import designpattern.cars.Car;
import designpattern.cars.Honda;

public class HondaCreator implements CarCreator{

    @Override
    public Car manufacture() {
        return new Honda();
    }
}
