package lt.codeacademy.javau8.weatherware.controllers;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resources")
public class TemplateResourceController {

    @GetMapping("/ThermoStyle.css")
    public ResponseEntity<Resource> getThermoStylesheet() {
        Resource resource = new ClassPathResource("/templates/ThermoStyle.css");
        return ResponseEntity.ok(resource);
    }
    @GetMapping("/ThermometerUnitConversion/UnitSwitch.css")
    public ResponseEntity<Resource> getSwitchStylesheet() {
        Resource resource = new ClassPathResource("/templates/ThermometerUnitConversion/UnitSwitch.css");
        return ResponseEntity.ok(resource);
    }
    @GetMapping("/ThermometerUnitConversion/UnitConverter.js")
    public ResponseEntity<Resource> getJavaScript() {
        Resource resource = new ClassPathResource("/templates/ThermometerUnitConversion/UnitConverter.js");
        return ResponseEntity.ok(resource);
    }
}