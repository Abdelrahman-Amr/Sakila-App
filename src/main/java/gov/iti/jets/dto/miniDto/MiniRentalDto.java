package gov.iti.jets.dto.miniDto;

import gov.iti.jets.dto.BaseDto;
import gov.iti.jets.dto.InventoryDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class MiniRentalDto extends BaseDto {
    private  Integer rentalId;
    private LocalDateTime rentalDate;
    private  LocalDateTime returnDate;
    private InventoryDto inventoryId;

}
