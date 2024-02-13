package lt.codeacademy.javau8.weatherware.entities.MeteoApi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coordinates {
    public double latitude;
    public double longitude;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Override
    public String toString() {
        return "Coordinates{" +
                "latitude: " + latitude +
                ", longitude: " + longitude +
                '}';
    }
}
