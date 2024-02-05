package spring.components;

import org.springframework.stereotype.Component;
import spring.Dog;

@Component
public class Dalmatian implements Dog {

    private int dogId;

    @Override
    public String bark() {
        return "Woof!!!";
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }
}
