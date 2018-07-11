package sterowniki;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {
    @Bean
    public void piec(Weather weather){
        if (weather.getTemperature()< 15){
            System.out.println("Jest zimno. Uruchamiam piec.");
        } else{
            System.out.println("Jest ciepło. Nie uruchamiam pieca.");
        }
    }
}
