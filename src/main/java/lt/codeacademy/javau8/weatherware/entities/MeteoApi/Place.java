package lt.codeacademy.javau8.weatherware.entities.MeteoApi;

import jakarta.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class Place {
    public String code;
    public String name;
    public String administrativeDivision;
    public String country;
    public String countryCode;
    @OneToOne
    public Coordinates coordinates;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private static final Logger LOGGER = LoggerFactory.getLogger(Place.class);

    //<editor-fold desc="Getter/Setter">
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdministrativeDivision() {
        return administrativeDivision;
    }

    public void setAdministrativeDivision(String administrativeDivision) {
        this.administrativeDivision = administrativeDivision;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
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
        sb.append("Place: " + place() + ", " + coordinates);

        return sb.toString();
    }
    private String place() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + '\n');
        sb.append(administrativeDivision + '\n');
        sb.append(country + '\n');

        return sb.toString();
    }
}
