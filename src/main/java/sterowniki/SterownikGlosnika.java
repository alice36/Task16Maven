package sterowniki;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika {
    @Bean
    public void showInfo(Weather weather){
        System.out.println("Dzień dobry. Dzisiejsza temperatura " + weather.getTemperature() + "*C i jest " + weather.getWeatherDescription()
                + ". To będzie dobry dzień!");
    }
}
