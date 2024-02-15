package springs.spring.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import springs.spring.Dog;

@Component
@Scope("singleton")
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
