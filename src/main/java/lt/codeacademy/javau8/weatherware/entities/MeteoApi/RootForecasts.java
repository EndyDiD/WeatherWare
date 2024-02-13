package lt.codeacademy.javau8.weatherware.entities.MeteoApi;

import jakarta.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
@Entity
public class RootForecasts {
    @OneToOne
    public Place place;
    public String forecastType;
    public String forecastCreationTimeUtc;
    @OneToMany(mappedBy = "rootForecasts", cascade = CascadeType.ALL)
    public List<ForecastTimestamps> forecastTimestamps;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private static final Logger LOGGER = LoggerFactory.getLogger(RootForecasts.class);
    //<editor-fold desc="Getter/Setter">
    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getForecastType() {
        return forecastType;
    }

    public void setForecastType(String forecastType) {
        this.forecastType = forecastType;
    }

    public String getForecastCreationTimeUtc() {
        return forecastCreationTimeUtc;
    }

    public void setForecastCreationTimeUtc(String forecastCreationTimeUtc) {
        this.forecastCreationTimeUtc = forecastCreationTimeUtc;
    }

    public List<ForecastTimestamps> getForecastTimestamps() {
        return forecastTimestamps;
    }

    public void setForecastTimestamps(List<ForecastTimestamps> forecastTimestamps) {
        this.forecastTimestamps = forecastTimestamps;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    //</editor-fold>

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(place + forecastCreationTimeUtc + '\n');
        sb.append("---- Forcast List ----\n");

        if (forecastTimestamps == null || forecastTimestamps.isEmpty()) {
            return sb.toString();
        } else {
            for (ForecastTimestamps f : forecastTimestamps) {
                sb.append(f + "\n");
            }
        }
        return sb.toString();
    }
}
