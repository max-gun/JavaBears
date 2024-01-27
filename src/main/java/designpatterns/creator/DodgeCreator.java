package designpatterns.creator;

import designpatterns.cars.Car;
import designpatterns.cars.Dodge;

public class DodgeCreator implements CarCreator {
    @Override
    public Car manufacture() {
        return new Dodge();
    }
}
