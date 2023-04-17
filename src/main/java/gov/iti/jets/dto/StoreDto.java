package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO for the {@link gov.iti.jets.entity.Store} entity
 */
@Data
@NoArgsConstructor
public class StoreDto extends BaseDto{
    private  Short storeId;
//    private  LocalDateTime lastUpdate;
    private AddressDto addressId;
    private ManagerDto managerStaffId;
}
