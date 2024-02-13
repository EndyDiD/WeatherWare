package lt.codeacademy.javau8.weatherware.repositories;

import lt.codeacademy.javau8.weatherware.entities.MeteoApi.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository  extends JpaRepository<Place, Long> {
}
