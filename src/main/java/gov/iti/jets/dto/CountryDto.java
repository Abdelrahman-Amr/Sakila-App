package gov.iti.jets.dto;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO for the {@link gov.iti.jets.entity.Country} entity
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class CountryDto extends BaseDto{
    private  Short countryId;
    private  String country;
//    private  LocalDateTime lastUpdate;
}
