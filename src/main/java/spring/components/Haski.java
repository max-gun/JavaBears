package spring.components;

import org.springframework.stereotype.Component;
import spring.Dog;

@Component
public class Haski implements Dog {
    @Override
    public String bark() {
        return "Hau Hau!!!";
    }
}
