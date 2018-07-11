import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sterowniki.StacjaPogodowa;
import sterowniki.SterownikGlosnika;
import sterowniki.SterownikPieca;
import sterowniki.SterownikRolet;
import sterowniki.Weather;

@Component
public class SmartHome {
    private StacjaPogodowa stacjaPogodowa;
    private SterownikGlosnika sterownikGlosnika;
    private SterownikPieca sterownikPieca;
    private SterownikRolet sterownikRolet;

    public SmartHome(StacjaPogodowa stacjaPogodowa, SterownikGlosnika sterownikGlosnika, SterownikPieca sterownikPieca, SterownikRolet sterownikRolet) {
        this.stacjaPogodowa = stacjaPogodowa;
        this.sterownikGlosnika = sterownikGlosnika;
        this.sterownikPieca = sterownikPieca;
        this.sterownikRolet = sterownikRolet;
    }

    @Bean
    public void smartHome(){
        Weather weather = stacjaPogodowa.showWeather();
        sterownikGlosnika.showInfo(weather);
        sterownikPieca.piec(weather);
        sterownikRolet.rolety(weather);
    }
}
