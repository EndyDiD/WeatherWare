package lt.codeacademy.javau8.weatherware.configurations;

import lt.codeacademy.javau8.weatherware.controllers.ClothingItemController;
import lt.codeacademy.javau8.weatherware.entities.ClothingItem;
import lt.codeacademy.javau8.weatherware.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger Log = LoggerFactory.getLogger(ClothingItemController.class);

    @Bean
    CommandLineRunner initDatabase(ClothingItemRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                Log.warn("The repository is empty. Filling it with data...");
                repository.save(new ClothingItem(50, "🔥"));
                repository.save(new ClothingItem(49, "🔥"));
                repository.save(new ClothingItem(48, "🔥"));
                repository.save(new ClothingItem(47, "🔥"));
                repository.save(new ClothingItem(46, "🔥"));
                repository.save(new ClothingItem(45, "🔥"));
                repository.save(new ClothingItem(44, "🔥"));
                repository.save(new ClothingItem(43, "🔥"));
                repository.save(new ClothingItem(42, "🔥"));
                repository.save(new ClothingItem(41, "🔥"));
                repository.save(new ClothingItem(40, "👙"));
                repository.save(new ClothingItem(39, "👙"));
                repository.save(new ClothingItem(38, "👙"));
                repository.save(new ClothingItem(37, "👙"));
                repository.save(new ClothingItem(36, "👙"));
                repository.save(new ClothingItem(35, "👙"));
                repository.save(new ClothingItem(34, "👙"));
                repository.save(new ClothingItem(33, "👙"));
                repository.save(new ClothingItem(32, "👙"));
                repository.save(new ClothingItem(31, "👙"));
                repository.save(new ClothingItem(30, "👕👖👟"));
                repository.save(new ClothingItem(29, "👕👖👟"));
                repository.save(new ClothingItem(28, "👕👖👟"));
                repository.save(new ClothingItem(27, "👕👖👟"));
                repository.save(new ClothingItem(26, "👕👖👟"));
                repository.save(new ClothingItem(25, "👕👖👟"));
                repository.save(new ClothingItem(24, "👕👖👟"));
                repository.save(new ClothingItem(23, "👕👖👟"));
                repository.save(new ClothingItem(22, "🧥👖👟"));
                repository.save(new ClothingItem(21, "🧥👖👟"));
                repository.save(new ClothingItem(20, "🧥👖👟"));
                repository.save(new ClothingItem(19, "🧥👖👟"));
                repository.save(new ClothingItem(18, "🧥👖👟"));
                repository.save(new ClothingItem(17, "🧥👖👟"));
                repository.save(new ClothingItem(16, "🧥👖👟"));
                repository.save(new ClothingItem(15, "🧥👖👟"));
                repository.save(new ClothingItem(14, "🧥👖👟"));
                repository.save(new ClothingItem(13, "🧥👖👟"));
                repository.save(new ClothingItem(12, "🧥👖👟"));
                repository.save(new ClothingItem(11, "🧥👖👟"));
                repository.save(new ClothingItem(10, "🧥👖👟"));
                repository.save(new ClothingItem(9, "🧥👖👟"));
                repository.save(new ClothingItem(8, "🧥👖👟"));
                repository.save(new ClothingItem(7, "🧥👖👟"));
                repository.save(new ClothingItem(6, "🧥👖👟"));
                repository.save(new ClothingItem(5, "🧥👖👟"));
                repository.save(new ClothingItem(4, "🧥👖👟"));
                repository.save(new ClothingItem(3, "🧥👖👟"));
                repository.save(new ClothingItem(2, "🧥👖👟"));
                repository.save(new ClothingItem(1, "🧥👖👟"));
                repository.save(new ClothingItem(0, "🧣🧥👖👟"));
                repository.save(new ClothingItem(-1, "🧣🧥👖👟"));
                repository.save(new ClothingItem(-2, "🧣🧥👖👟"));
                repository.save(new ClothingItem(-3, "🧣🧥👖👟"));
                repository.save(new ClothingItem(-4, "🧣🧥👖👟"));
                repository.save(new ClothingItem(-5, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-6, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-7, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-8, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-9, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-10, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-11, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-12, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-13, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-14, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-15, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-16, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-17, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-18, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-19, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-20, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-21, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-22, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-23, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-24, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-25, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-26, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-27, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-28, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-29, "🧤🧣🧥👖🥾"));
                repository.save(new ClothingItem(-30, "🥶"));
                repository.save(new ClothingItem(-31, "🥶"));
                repository.save(new ClothingItem(-32, "🥶"));
                repository.save(new ClothingItem(-33, "🥶"));
                repository.save(new ClothingItem(-34, "🥶"));
                repository.save(new ClothingItem(-35, "🥶"));
                repository.save(new ClothingItem(-36, "🥶"));
                repository.save(new ClothingItem(-37, "🥶"));
                repository.save(new ClothingItem(-38, "🥶"));
                repository.save(new ClothingItem(-39, "🥶"));
                repository.save(new ClothingItem(-40, "🥶"));
            } else {
                Log.warn("The repository is not empty. No action taken.");
            }
        };
    }
}
