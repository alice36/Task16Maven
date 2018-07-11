package sterowniki;

import java.util.Random;

public class StacjaPogodowa {
    public Weather showWeather(){
        int temperature;
        String weatherDescription;

        temperature = getTemperature();
        weatherDescription = desc(temperature);
        Weather weather = new Weather(temperature,weatherDescription);
        return weather;
    }

    public static String desc(int temp){
        String description;

        if (temp>20) {
            description = "słonecznie";
        } else{
            description = "pochmurnie";
        }
        return description;
    }

    private int getTemperature() {
        return random(-25, 35);
    }

    private int random(int from, int to) {
        Random rand = new Random();
        int a = Math.abs(from);
        return rand.nextInt(a + to + 1) - to;
    }

}
