package sterowniki;

import org.springframework.context.annotation.Bean;


public class SterownikRolet {
    @Bean
    public void rolety(sterowniki.Weather weather){
        if (weather.getWeatherDescription().equals("słonecznie")){
            System.out.println("Jest słonecznie. Zasłaniam rolety.");
        } else{
            System.out.println("Nie jest słonecznie. Nie zasłaniam rolet.");
        }
    }
}
