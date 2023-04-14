package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link gov.iti.jets.entity.Store} entity
 */
@Data
@NoArgsConstructor
public class StoreDto extends BaseDto{
    private  Short storeId;
    private AddressDto addressId;
    private ManagerDto managerStaffId;



}
