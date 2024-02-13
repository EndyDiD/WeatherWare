package lt.codeacademy.javau8.weatherware.entities.MeteoApi;

import jakarta.persistence.*;

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
