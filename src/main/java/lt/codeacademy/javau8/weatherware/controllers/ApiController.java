package lt.codeacademy.javau8.weatherware.controllers;

import lt.codeacademy.javau8.weatherware.entities.MeteoApi.Coordinates;
import lt.codeacademy.javau8.weatherware.entities.MeteoApi.Place;
import lt.codeacademy.javau8.weatherware.entities.MeteoApi.RootForecasts;
import lt.codeacademy.javau8.weatherware.repositories.CoordinateRepository;
import lt.codeacademy.javau8.weatherware.repositories.ForecastTimestampRepository;
import lt.codeacademy.javau8.weatherware.repositories.PlaceRepository;
import lt.codeacademy.javau8.weatherware.repositories.RootForcastRepository;
import lt.codeacademy.javau8.weatherware.services.WeatherApi.ApiMeteoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class ApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);

    private RootForcastRepository wRepo;
    private PlaceRepository pRepo;
    private CoordinateRepository cRepo;
    private ForecastTimestampRepository fRepo;

    ApiMeteoService apiMeteoService;

    @Autowired
    public ApiController(RootForcastRepository wRepo,
                         PlaceRepository pRepo,
                         CoordinateRepository cRepo,
                         ForecastTimestampRepository fRepo,
                         ApiMeteoService apiMeteoService) {
        this.wRepo = wRepo;
        this.pRepo = pRepo;
        this.cRepo = cRepo;
        this.fRepo = fRepo;
        this.apiMeteoService = apiMeteoService;
    }

    public ApiController() {
    }

    @GetMapping("/hw")
    @ResponseBody
    public String getHome() {
        return "Hello World!";
    }

    @GetMapping("/thermo")
    public String getWeatherVilnius(Model model) {
        String apiMeteoURL = "https://api.meteo.lt/v1/places/vilnius/forecasts/long-term";
        try {
            Optional<RootForecasts> optRF = ApiMeteoService.getDataFromMeteo(apiMeteoURL);
            if (optRF.isPresent()) {
                RootForecasts rootForecasts = optRF.get();
                Place place = rootForecasts.getPlace();
                Coordinates coordinates = place.getCoordinates();
                //<editor-fold desc="Saving Coordinates into database & variables">
                LOGGER.info("Saving Coordinates into database & variables");

                coordinates = cRepo.save(coordinates); // Assuming you have a CoordinatesRepository
                place.setCoordinates(coordinates);

                LOGGER.debug(coordinates.toString());
                //</editor-fold>
                //<editor-fold desc="Saving Place into database & variables">
                LOGGER.info("Saving Place into database & variables");

                place = pRepo.save(place); // Assuming you have a PlaceRepository
                rootForecasts.setPlace(place);

                LOGGER.debug(place.toString());
                //</editor-fold>
                //<editor-fold desc="Saving RootForcasts into database">
                LOGGER.info("Saving RootForcasts into database");

                wRepo.save(rootForecasts); // Save to the database

                LOGGER.debug(rootForecasts.toString());
                //</editor-fold>
                model.addAttribute("forecasts", rootForecasts); // Add to the model
            }
        } catch (Exception e) {
            LOGGER.error("Failed to get data from Meteo", e);
        }
        return "thermo"; // Return the view name
    }


}
