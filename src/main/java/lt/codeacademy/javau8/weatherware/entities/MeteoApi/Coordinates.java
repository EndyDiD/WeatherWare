package lt.codeacademy.javau8.weatherware.entities.MeteoApi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class Coordinates {
    public double latitude;
    public double longitude;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private static final Logger LOGGER = LoggerFactory.getLogger(Coordinates.class);

    //<editor-fold desc="Getter/Setter">
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
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
        return "Coordinates{" +
                "latitude: " + latitude +
                ", longitude: " + longitude +
                '}';
    }
}
