package designpatterns.creator;

import designpatterns.cars.Car;
import designpatterns.cars.Honda;

public class HondaCreator implements CarCreator{

    @Override
    public Car manufacture() {
        return new Honda();
    }
}
