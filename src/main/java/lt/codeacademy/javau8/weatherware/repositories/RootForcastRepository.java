package lt.codeacademy.javau8.weatherware.repositories;

import lt.codeacademy.javau8.weatherware.entities.MeteoApi.RootForecasts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RootForcastRepository extends JpaRepository<RootForecasts, Long> {
    //Todo this is where you put the database stuff
}
