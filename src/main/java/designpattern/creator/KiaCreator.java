package designpattern.creator;

import designpattern.cars.Car;
import designpattern.cars.Kia;

public class KiaCreator implements CarCreator {
    @Override
    public Car manufacture() {
        return new Kia();
    }
}
