package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO for the {@link gov.iti.jets.entity.Country} entity
 */
@Data
@NoArgsConstructor
public class CountryDto extends BaseDto{
    private  Short countryId;
    private  String country;
//    private  LocalDateTime lastUpdate;
}
