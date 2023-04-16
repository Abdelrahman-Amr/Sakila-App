package gov.iti.jets.dto.miniDto;

import gov.iti.jets.dto.AddressDto;
import gov.iti.jets.dto.BaseDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class MiniCustomerDto extends BaseDto {
    private  Short customerId;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  boolean active;
    private AddressDto addressId;
}
