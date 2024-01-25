package designpattern;

public class Honda implements Car{
    @Override
    public Car manufacture() {
        return new Honda();
    }

    @Override
    public String drive() {
        return "Honda is Driving";
    }
}
