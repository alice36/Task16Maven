package sterowniki;

public class Weather {
    private int temperature;
    private String weatherDescription;

    public Weather(int temperature, String weatherDescription) {
        this.temperature = temperature;
        this.weatherDescription = weatherDescription;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }
}
