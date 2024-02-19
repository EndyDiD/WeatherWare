package lt.codeacademy.javau8.weatherware.controllers;

import lt.codeacademy.javau8.weatherware.repositories.ClothingItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClothingItemController {

    private final ClothingItemRepository repository;

    private static final Logger Log = LoggerFactory.getLogger(ClothingItemController.class);
    public ClothingItemController(ClothingItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/clothingItems")
    public String getClothingItems(Model model) {
        model.addAttribute("clothingItems", repository.findAll());
        return "clothingItems";  // This is the name of your Thymeleaf template
    }
}
