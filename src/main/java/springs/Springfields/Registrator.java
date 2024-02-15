package springs.Springfields;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Registrator {

    @Bean
    public List<String> studentNames() {
        return Arrays.asList("Alexey","Doron","Moran","Raz");
    }

    @Bean
    public List<String> professorsNames() {
        return Arrays.asList("Max","Zeev","Karina","Olga");
    }
}
