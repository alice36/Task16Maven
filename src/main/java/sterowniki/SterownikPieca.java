package sterowniki;

import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {
    private StacjaPogodowa stacjaPogodowa;

    public SterownikPieca(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void piec(){
        if (stacjaPogodowa.showWeather().getTemperature()< 15){
            System.out.println("Jest zimno. Uruchamiam piec.");
        } else{
            System.out.println("Jest ciepło. Nie uruchamiam pieca.");
        }
    }
}
