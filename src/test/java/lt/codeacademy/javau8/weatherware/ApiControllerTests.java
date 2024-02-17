package lt.codeacademy.javau8.weatherware;

import lt.codeacademy.javau8.weatherware.controllers.ApiController;
import lt.codeacademy.javau8.weatherware.entities.MeteoApi.RootForecasts;
import lt.codeacademy.javau8.weatherware.services.WeatherApi.ApiMeteoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.Optional;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ApiControllerTests {
    private MockMvc mockMvc;
    @Mock
    private ApiMeteoService apiMeteoService;
    @InjectMocks
    private ApiController apiController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(apiController).build();
    }

    @Test
    public void getWeatherVilniusTest(Model model) throws Exception {

        String apiMeteoURL = "https://api.meteo.lt/v1/places/vilnius/forecasts/long-term";
        Optional<RootForecasts> optRF = ApiMeteoService.getDataFromMeteo(apiMeteoURL);

        mockMvc.perform(MockMvcRequestBuilders.get("/chart"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));

        Mockito.verify(apiMeteoService, Mockito.times(1));
        ApiMeteoService.getDataFromMeteo(apiMeteoURL);

    }
}
