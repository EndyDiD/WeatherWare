package lt.codeacademy.javau8.weatherware.entities.DTOs.ClothingItems;

import java.util.List;

public class UpdateMultipleRequest {
    private List<Integer> tempValues;
    private String clothingItemEmoji;

    //<editor-fold desc="Getter/Setter">
    public List<Integer> getTempValues() {
        return tempValues;
    }

    public void setTempValues(List<Integer> tempValues) {
        this.tempValues = tempValues;
    }

    public String getClothingItemEmoji() {
        return clothingItemEmoji;
    }

    public void setClothingItemEmoji(String clothingItemEmoji) {
        this.clothingItemEmoji = clothingItemEmoji;
    }
    //</editor-fold>
}
