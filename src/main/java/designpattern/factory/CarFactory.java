package designpattern.factory;

import designpattern.cars.Car;
import designpattern.cars.Dodge;
import designpattern.cars.Honda;
import designpattern.cars.Kia;
import designpattern.creator.CarCreator;
import designpattern.creator.DodgeCreator;
import designpattern.creator.HondaCreator;
import designpattern.creator.KiaCreator;

import java.util.HashMap;
import java.util.Map;

import static designpattern.factory.CarModel.*;

public class CarFactory {

    Map<CarModel, CarCreator> carCreatorMap = new HashMap<>();

    public CarFactory() {
        carCreatorMap.put(HONDA, new HondaCreator());
        carCreatorMap.put(KIA, new KiaCreator());
        carCreatorMap.put(DODGE, new DodgeCreator());
    }

    public Map<CarModel, CarCreator> getMap(){
        return carCreatorMap;
    }

    Car manufacture(CarModel carModel) {
        return carCreatorMap.get(carModel).manufacture();
    }
}
