package main.java.com.tykhonchuk.diAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Mercedes implements Vehicle {
    @Override
    public void start() {
        System.out.println("Im an old poor Mercedes");
    }
}
