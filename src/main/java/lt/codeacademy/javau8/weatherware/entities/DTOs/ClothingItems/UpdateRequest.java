package lt.codeacademy.javau8.weatherware.entities.DTOs.ClothingItems;

public class UpdateRequest {
    private int tempValue;
    private String clothingItemEmoji;

    //<editor-fold desc="Getter/Setter">
    public int getTempValue() {
        return tempValue;
    }

    public void setTempValue(int tempValue) {
        this.tempValue = tempValue;
    }

    public String getClothingItemEmoji() {
        return clothingItemEmoji;
    }

    public void setClothingItemEmoji(String clothingItemEmoji) {
        this.clothingItemEmoji = clothingItemEmoji;
    }
    //</editor-fold>
}
