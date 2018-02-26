package main.java.com.tykhonchuk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/spring_config.xml");
        Coach mourinho = (Coach) context.getBean("mourinho");
        mourinho.speakAbout(mourinho.getFavouriteTopic());
    }



}
