package pl.coderslab.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.annotation.beans.HelloWorld;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);

        helloWorld.hello();
    }
}
