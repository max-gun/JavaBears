package springs.spring.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kennel {

    @Autowired
    private Dalmatian dalmatian;

    @Autowired
    private Haski haski;

    public Dalmatian getDalmatian() {
        return dalmatian;
    }

    public Haski getHaski() {
        return haski;
    }


}
