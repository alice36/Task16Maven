package sterowniki;
import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {
    private StacjaPogodowa stacjaPogodowa;

    public SterownikRolet(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void rolety(){
        if (stacjaPogodowa.showWeather().getWeatherDescription().equals("słonecznie")){
            System.out.println("Jest słonecznie. Zasłaniam rolety.");
        } else{
            System.out.println("Nie jest słonecznie. Nie zasłaniam rolet.");
        }
    }
}
