package gov.iti.jets.dto;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO for the {@link gov.iti.jets.entity.Store} entity
 */
@Data
@NoArgsConstructor
@XmlRootElement

public class StoreDto extends BaseDto{
    private  Short storeId;
//    private  LocalDateTime lastUpdate;
    private AddressDto addressId;
    private ManagerDto managerStaffId;
}
