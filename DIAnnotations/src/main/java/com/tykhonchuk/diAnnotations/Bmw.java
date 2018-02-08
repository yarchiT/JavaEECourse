package main.java.com.tykhonchuk.diAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Bmw implements Vehicle {
    @Override
    public void start() {
        System.out.println("Die Bayerische Motoren Werke Aktiengesellschaft! ");
    }
}
