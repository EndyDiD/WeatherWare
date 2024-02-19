package lt.codeacademy.javau8.weatherware.services;

import lt.codeacademy.javau8.weatherware.entities.ClothingItem;
import lt.codeacademy.javau8.weatherware.repositories.ClothingItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothingItemService {

    ClothingItemRepository wearRepo;

    public ClothingItemService(ClothingItemRepository wearRepo) {
        this.wearRepo = wearRepo;
    }

    public List<ClothingItem> getAllWearables(){
        return wearRepo.findAll();
    }
}
