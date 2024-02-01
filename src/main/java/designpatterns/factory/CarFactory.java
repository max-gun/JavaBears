package designpatterns.factory;

import designpatterns.cars.Car;
import designpatterns.creator.CarCreator;
import designpatterns.creator.DodgeCreator;
import designpatterns.creator.HondaCreator;
import designpatterns.creator.KiaCreator;

import java.util.HashMap;
import java.util.Map;

import static designpatterns.factory.CarModel.*;

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
