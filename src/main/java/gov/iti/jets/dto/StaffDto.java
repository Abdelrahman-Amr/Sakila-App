package gov.iti.jets.dto;

import gov.iti.jets.dto.miniDto.MiniStoreDto;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO for the {@link gov.iti.jets.entity.Staff} entity
 */
@Data
@NoArgsConstructor
@XmlRootElement

public class StaffDto extends BaseDto {
    private Short staffId;
    private  String firstName;
    private  String lastName;
//    private  byte[] picture;
    private  String email;
    private  boolean active;
    private  String username;
    private  String password;
    private AddressDto addressId;
    private MiniStoreDto storeId;
}
