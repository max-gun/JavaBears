package springs.springcoffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MyApplication implements WebMvcConfigurer {

    public static void main(String[] args) {

        SpringApplication.run(springs.springcoffee.MyApplication.class,args);
    }
}
