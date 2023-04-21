package gov.iti.jets.dto;

import gov.iti.jets.dto.miniDto.MiniFilmDto;
import gov.iti.jets.dto.miniDto.MiniStoreDto;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO for the {@link gov.iti.jets.entity.Inventory} entity
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class InventoryDto extends BaseDto {
    private  Integer inventoryId;
    private MiniFilmDto filmId;
    private MiniStoreDto storeId;
//    private FilmDto filmId;
//    private StoreDto storeId;
}
