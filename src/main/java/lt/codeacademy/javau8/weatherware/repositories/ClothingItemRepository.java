package lt.codeacademy.javau8.weatherware.repositories;

import lt.codeacademy.javau8.weatherware.entities.ClothingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ClothingItemRepository extends JpaRepository<ClothingItem, Long> {

    @Modifying
    @Transactional
    @Query("update ClothingItem c set c.clothingItemEmoji = :emoji where c.tempValue = :tempValue")
    void updateSingle(@Param("tempValue") int tempValue, @Param("emoji") String emoji);

    @Modifying
    @Transactional
    @Query("update ClothingItem c set c.clothingItemEmoji = :emoji where c.tempValue in :tempValues")
    void updateMultiple(@Param("tempValues") List<Integer> tempValues, @Param("emoji") String emoji);
}
