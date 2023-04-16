package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO for the {@link gov.iti.jets.entity.City} entity
 */
@Data
@NoArgsConstructor
public class CityDto extends BaseDto {
    private  Short cityId;
    private  String city;
    private CountryDto countryId;
//    private  LocalDateTime lastUpdate;
}
