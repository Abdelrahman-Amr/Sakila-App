package gov.iti.jets.dto;

import gov.iti.jets.dto.miniDto.MiniCustomerDto;
import gov.iti.jets.dto.miniDto.MiniStaffDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.Rental} entity
 */
@Data
@NoArgsConstructor
public class RentalDto extends BaseDto {
    private  Integer rentalId;
    private Date rentalDate;
    private  Date returnDate;
    private MiniCustomerDto customerId;
    private  InventoryDto inventoryId;
    private MiniStaffDto staffId;

}
