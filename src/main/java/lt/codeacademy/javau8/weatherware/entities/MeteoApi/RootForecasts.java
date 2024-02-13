package lt.codeacademy.javau8.weatherware.entities.MeteoApi;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class RootForecasts {
    @OneToOne
    public Place place;
    public String forecastType;
    public String forecastCreationTimeUtc;
    @OneToMany
    public List<Forecast> forecasts;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(place + forecastCreationTimeUtc + '\n');
        sb.append("---- Forcast List ----\n");

        if (forecasts == null || forecasts.isEmpty()) {
            return sb.toString();
        } else {
            for (Forecast f : forecasts) {
                sb.append(f + "\n");
            }
        }
        return sb.toString();
    }
}
