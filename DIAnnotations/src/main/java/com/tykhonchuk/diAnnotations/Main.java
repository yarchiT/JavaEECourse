package main.java.com.tykhonchuk.diAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("main/resources/spring-config.xml");

        Rider schumacher = context.getBean(Rider.class);

        System.out.println("Yo i have "+ schumacher.getCars().size() + " cars\n");

        for (Vehicle veh: schumacher.getCars()) {
            schumacher.rideCar(veh);
        }
    }
}
