package main.java.com.tykhonchuk.diAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Ferrari implements Vehicle {

    @Override
    public void start() {
        System.out.println("Vrmmmmm Ferrari");
    }
}
