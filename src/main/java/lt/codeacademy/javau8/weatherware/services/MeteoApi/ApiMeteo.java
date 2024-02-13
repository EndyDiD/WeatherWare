package lt.codeacademy.javau8.weatherware.services.MeteoApi;

import lt.codeacademy.javau8.weatherware.entities.MeteoApi.RootForecasts;
import lt.codeacademy.javau8.weatherware.services.JsonParser;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Optional;
@Service
public class ApiMeteo {

    public static Optional<RootForecasts> getDataFromMeteo(String url){

        // Somethign to Consume APIs from the web
        WebClient webClient = WebClient.create();

        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(String.class)
                .map(JsonParser::parseJson)
                .onErrorResume(e -> Mono.empty())
                .block();
    }

}
