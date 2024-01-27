package designpatterns.creator;

import designpatterns.cars.Car;
import designpatterns.cars.Kia;

public class KiaCreator implements CarCreator {
    @Override
    public Car manufacture() {
        return new Kia();
    }
}
