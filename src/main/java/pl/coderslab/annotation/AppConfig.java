package pl.coderslab.annotation;

import org.springframework.context.annotation.Bean;
import pl.coderslab.annotation.beans.HelloWorld;

public class AppConfig {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
