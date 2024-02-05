package spring.components;

import org.springframework.stereotype.Component;
import spring.Dog;

@Component
public class Haski implements Dog {

    private int dogId;
    @Override
    public String bark() {
        return "Hau Hau!!!";
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }
}
