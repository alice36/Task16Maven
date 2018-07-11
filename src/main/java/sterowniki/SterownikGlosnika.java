package sterowniki;

import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika {

    public void showInfo(sterowniki.Weather weather){
        System.out.println("Dzień dobry. Dzisiejsza temperatura " + weather.getTemperature() + "*C i jest " + weather.getWeatherDescription()
                + ". To będzie dobry dzień!");
    }
}
