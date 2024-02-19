package lt.codeacademy.javau8.weatherware.controllers;

import lt.codeacademy.javau8.weatherware.entities.ClothingItem;
import lt.codeacademy.javau8.weatherware.repositories.ClothingItemRepository;
import lt.codeacademy.javau8.weatherware.services.ClothingItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClothingItemController {

    private final ClothingItemRepository repository;

    private static final Logger Log = LoggerFactory.getLogger(ClothingItemController.class);

    ClothingItemService clothingItemService;
    public ClothingItemController(ClothingItemRepository repository, ClothingItemService wrService) {
        this.repository = repository;
        this.clothingItemService = wrService;
    }

    @GetMapping("/all")
    public List<ClothingItem> getAllWearables(){
        return clothingItemService.getAllWearables();
    }

    @GetMapping("/clothingItems")
    public String getClothingItems(Model model) {
        model.addAttribute("clothingItems", repository.findAll());
        return "clothingItems";  // This is the name of your Thymeleaf template
    }
}
