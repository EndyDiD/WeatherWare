package lt.codeacademy.javau8.weatherware.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lt.codeacademy.javau8.weatherware.entities.MeteoApi.RootForecasts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class JsonParseService {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonParseService.class);
    public static Optional<RootForecasts> parseJson(String json) {
        ObjectMapper om = new ObjectMapper();
        LOGGER.warn("Parsing Data in JsonParser");
        try {
            return Optional.ofNullable(om.readValue(json, RootForecasts.class));
        } catch (JsonProcessingException e) {
            LOGGER.error("Failed to parse JSON data", e);
        }
        return Optional.empty();
    }
}
