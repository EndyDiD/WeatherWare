package lt.codeacademy.javau8.weatherware.entities.MeteoApi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Forecast {
    public String forecastTimeUtc;
    public double airTemperature;
    public double feelsLikeTemperature;
    public int windSpeed;
    public int windGust;
    public int windDirection;
    public int cloudCover;
    public int seaLevelPressure;
    public int relativeHumidity;
    public double totalPrecipitation;
    public String conditionCode;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Override
    public String toString() {
        return "\nForecast{\n" +
                "• forecastTimeUtc='" + forecastTimeUtc + "'\n" +
                "• airTemperature=" + airTemperature + '\n' +
                "• feelsLikeTemperature=" + feelsLikeTemperature + '\n' +
                "• windSpeed=" + windSpeed + '\n' +
                "• windGust=" + windGust + '\n' +
                "• windDirection=" + windDirection + '\n' +
                "• cloudCover=" + cloudCover + '\n' +
                "• seaLevelPressure=" + seaLevelPressure + '\n' +
                "• relativeHumidity=" + relativeHumidity + '\n' +
                "• totalPrecipitation=" + totalPrecipitation + '\n' +
                "• conditionCode='" + conditionCode + "'\n" +
                '}';
    }
}
