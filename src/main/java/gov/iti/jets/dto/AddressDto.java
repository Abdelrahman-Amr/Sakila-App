package gov.iti.jets.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.Address} entity
 */
@Data
public class AddressDto implements Serializable {
    private final Short addressId;
    private final String address;
    private final String address2;
    private final String district;
    private final String postalCode;
    private final String phone;
    private final byte[] location;
    private final Date lastUpdate;
}
