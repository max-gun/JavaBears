package spring;

import org.springframework.context.annotation.*;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.*;

@Configuration
@ComponentScan(basePackages = "spring.components")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean(name={"kosta","etzem"})
    @Scope(value = SCOPE_SINGLETON)
    public Bone getBone() {
        return new Bone();
    }
}
