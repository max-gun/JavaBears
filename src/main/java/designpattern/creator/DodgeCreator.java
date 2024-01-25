package designpattern.creator;

import designpattern.cars.Car;
import designpattern.cars.Dodge;

public class DodgeCreator implements CarCreator {
    @Override
    public Car manufacture() {
        return new Dodge();
    }
}
