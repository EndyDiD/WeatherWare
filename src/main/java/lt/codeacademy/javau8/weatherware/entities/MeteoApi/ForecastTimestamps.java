package lt.codeacademy.javau8.weatherware.entities.MeteoApi;

import jakarta.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class ForecastTimestamps {
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
    @ManyToOne
    public RootForecasts rootForecasts;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private static final Logger LOGGER = LoggerFactory.getLogger(ForecastTimestamps.class);

    //<editor-fold desc="Getter/Setter">
    public String getForecastTimeUtc() {
        return forecastTimeUtc;
    }

    public void setForecastTimeUtc(String forecastTimeUtc) {
        this.forecastTimeUtc = forecastTimeUtc;
    }

    public double getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(double airTemperature) {
        this.airTemperature = airTemperature;
    }

    public double getFeelsLikeTemperature() {
        return feelsLikeTemperature;
    }

    public void setFeelsLikeTemperature(double feelsLikeTemperature) {
        this.feelsLikeTemperature = feelsLikeTemperature;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getWindGust() {
        return windGust;
    }

    public void setWindGust(int windGust) {
        this.windGust = windGust;
    }

    public int getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(int windDirection) {
        this.windDirection = windDirection;
    }

    public int getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(int cloudCover) {
        this.cloudCover = cloudCover;
    }

    public int getSeaLevelPressure() {
        return seaLevelPressure;
    }

    public void setSeaLevelPressure(int seaLevelPressure) {
        this.seaLevelPressure = seaLevelPressure;
    }

    public int getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(int relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public double getTotalPrecipitation() {
        return totalPrecipitation;
    }

    public void setTotalPrecipitation(double totalPrecipitation) {
        this.totalPrecipitation = totalPrecipitation;
    }

    public String getConditionCode() {
        return conditionCode;
    }

    public void setConditionCode(String conditionCode) {
        this.conditionCode = conditionCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public RootForecasts getRootForecasts() {
        return rootForecasts;
    }

    public void setRootForecasts(RootForecasts rootForecasts) {
        this.rootForecasts = rootForecasts;
    }
    //</editor-fold>

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
