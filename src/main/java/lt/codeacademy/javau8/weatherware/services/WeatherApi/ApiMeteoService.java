package lt.codeacademy.javau8.weatherware.services.WeatherApi;

import lt.codeacademy.javau8.weatherware.entities.MeteoApi.RootForecasts;
import lt.codeacademy.javau8.weatherware.services.JsonParseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Optional;
@Service
public class ApiMeteoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiMeteoService.class);

    public static Optional<RootForecasts> getDataFromMeteo(String url){

        // Somethign to Consume APIs from the web
        WebClient webClient = WebClient.create();
        LOGGER.info("Getting Data from apiMeteo");
        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(String.class)
                .map(JsonParseService::parseJson)
                .onErrorResume(e -> Mono.empty())
                .block();
    }

}
