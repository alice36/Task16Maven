package sterowniki;

import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika {

    private StacjaPogodowa stacjaPogodowa;

    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void showInfo(){
        System.out.println("Dzień dobry. Dzisiejsza temperatura " + stacjaPogodowa.showWeather().getTemperature() + "*C i jest " + stacjaPogodowa.showWeather().getWeatherDescription()
                + ". To będzie dobry dzień!");
    }
}
