package lt.codeacademy.javau8.weatherware.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClothingItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int tempValue;
    private String clothingItemEmoji;

    //<editor-fold desc="Constructors">
    public ClothingItem() {
    }
    public ClothingItem(long id, int tempValue, String clothingItemEmoji) {
        this.id = id;
        this.tempValue = tempValue;
        this.clothingItemEmoji = clothingItemEmoji;
    }
    public ClothingItem(int tempValue, String clothingItemEmoji) {
        this.tempValue = tempValue;
        this.clothingItemEmoji = clothingItemEmoji;
    }
    //</editor-fold>

    //<editor-fold desc="Getter/Setter">
    public long getId() {
        return id;
    }

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

    @Override
    public String toString() {
        return "temp = " + tempValue + ", ClothingItemEmoji = " + clothingItemEmoji;
    }
    //</editor-fold>
}
