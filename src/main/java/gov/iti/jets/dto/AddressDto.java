package gov.iti.jets.dto;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO for the {@link gov.iti.jets.entity.Address} entity
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class AddressDto extends BaseDto {
    private  Short addressId;
    private  String address;
    private  String address2;
    private  String district;
    private  String postalCode;
    private  String phone;
    private  byte[] location;
//    private LocalDateTime lastUpdate;
    private CityDto cityId;
}
