package gov.iti.jets.dto;

import gov.iti.jets.dto.miniDto.MiniStoreDto;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.Customer} entity
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class CustomerDto extends BaseDto {
    private  Short customerId;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  boolean active;
    private Date createDate;
    private AddressDto addressId;
    private MiniStoreDto storeId;
//    private  Date lastUpdate;
}
