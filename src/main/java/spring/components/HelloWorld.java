package spring.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class HelloWorld {

    @Autowired
    Environment environment;

    public void sayHello() {
        System.out.println("Hello, World!");
    }

    public String getName() {
        return environment.getProperty("name");
    }

    public int getAge() {
        return 0;
    }
}
