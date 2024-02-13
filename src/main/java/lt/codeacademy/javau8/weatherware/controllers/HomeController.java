package lt.codeacademy.javau8.weatherware.controllers;

import lt.codeacademy.javau8.weatherware.entities.MeteoApi.RootForecasts;
import lt.codeacademy.javau8.weatherware.repositories.WeatherRepository;
import lt.codeacademy.javau8.weatherware.services.MeteoApi.ApiMeteo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    private WeatherRepository wRepo;

    ApiMeteo apiMeteo;

    public HomeController(ApiMeteo apiMeteo) {
        this.apiMeteo = apiMeteo;
    }

    @GetMapping("/hw")
    public String getHome(){
        return "Hello World!";
    }

    @GetMapping("/home")
    public Optional<RootForecasts> getWeatherVilnius(){
        String apiMeteoURL = "https://api.meteo.lt/v1/places/vilnius/forecasts/long-term";

        try {
            Optional<RootForecasts> optRF = ApiMeteo.getDataFromMeteo(apiMeteoURL);
        } catch (Exception e) {
            LOGGER.error("Failed to get data from Meteo", e);
        }
        return Optional.empty();
    }



}
