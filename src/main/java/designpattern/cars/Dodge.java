package designpattern.cars;

public class Dodge implements Car {
    @Override
    public Car manufacture() {
        return new Dodge();
    }

    @Override
    public String drive() {
        return "Dodge is driving";
    }
}
