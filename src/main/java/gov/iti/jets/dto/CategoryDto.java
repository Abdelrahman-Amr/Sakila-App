package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO for the {@link gov.iti.jets.entity.Category} entity
 */
@Data
@NoArgsConstructor
public class CategoryDto extends BaseDto {
    private  Short categoryId;
    private  String name;
//    private  LocalDateTime lastUpdate;
}
