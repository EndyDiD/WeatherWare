package lt.codeacademy.javau8.weatherware.repositories;

import lt.codeacademy.javau8.weatherware.entities.MeteoApi.ForecastTimestamps;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForecastTimestampRepository  extends JpaRepository<ForecastTimestamps, Long> {
}
