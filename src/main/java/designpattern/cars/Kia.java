package designpattern.cars;

public class Kia implements Car {
    @Override
    public Car manufacture() {
        return new Kia();
    }

    @Override
    public String drive() {
        return "Kia is driving";
    }
}
