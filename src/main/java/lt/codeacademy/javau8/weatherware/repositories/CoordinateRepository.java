package lt.codeacademy.javau8.weatherware.repositories;

import lt.codeacademy.javau8.weatherware.entities.MeteoApi.Coordinates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinateRepository  extends JpaRepository<Coordinates, Long> {
}
