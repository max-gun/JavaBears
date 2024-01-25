package designpattern;

import static designpattern.CarModel.*;

public class CarDealer {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car honda = carFactory.manufacture(HONDA);
        Car kia = carFactory.manufacture(KIA);
        Car dodge = carFactory.manufacture(DODGE);

        System.out.println(honda.drive());
        System.out.println(kia.drive());
        System.out.println(dodge.drive());
    }
}
