import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        ApplicationContext context  = new
                ClassPathXmlApplicationContext("resources/spring-context.xml");
        /**
         * Implementing dependency injection with constructor
         */
      /*  Footballer zidan = (Footballer) context.getBean("zidan");
        zidan.prepare();*/

        Coach mourinho = (Coach) context.getBean("mourinho");
        mourinho.prepare();
    }
}
