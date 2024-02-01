package spring.components;

import org.springframework.stereotype.Component;
import spring.Dog;

@Component
public class Dalmatian implements Dog {
    @Override
    public String bark() {
        return "Woof!!!";
    }
}
