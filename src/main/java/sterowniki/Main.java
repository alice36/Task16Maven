package sterowniki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;


@ComponentScan
@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        sterowniki.SmartHome smartHome = context.getBean(sterowniki.SmartHome.class);
        smartHome.smartHome();
        context.close();
    }
}
