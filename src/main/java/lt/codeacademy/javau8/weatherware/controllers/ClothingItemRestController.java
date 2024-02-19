package lt.codeacademy.javau8.weatherware.controllers;

import lt.codeacademy.javau8.weatherware.entities.DTOs.ClothingItems.UpdateMultipleRequest;
import lt.codeacademy.javau8.weatherware.entities.DTOs.ClothingItems.UpdateRequest;
import lt.codeacademy.javau8.weatherware.repositories.ClothingItemRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
public class ClothingItemRestController {
    private final ClothingItemRepository repository;

    ClothingItemRestController(ClothingItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/edit")
    public String showUpdateForm(){
        return "update-form";
    }

    @PostMapping("/updateSingle")
    public void updateSingle(@RequestBody UpdateRequest request) {
        repository.updateSingle(request.getTempValue(), request.getClothingItemEmoji());
    }

    @PostMapping("/updateMultiple")
    public void updateMultiple(@RequestBody UpdateMultipleRequest request) {
        repository.updateMultiple(request.getTempValues(), request.getClothingItemEmoji());
    }
}
