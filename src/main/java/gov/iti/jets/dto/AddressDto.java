package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link gov.iti.jets.entity.Address} entity
 */
@Data
@NoArgsConstructor
public class AddressDto extends BaseDto {
    private  Short addressId;
    private  String address;
    private  String address2;
    private  String district;
    private  String postalCode;
    private  String phone;
    private  byte[] location;
    private CityDto cityId;
}
