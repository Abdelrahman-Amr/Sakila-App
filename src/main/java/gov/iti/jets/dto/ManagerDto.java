package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ManagerDto extends BaseDto {
    private Short staffId;
    private  String firstName;
    private  String lastName;
    private  byte[] picture;
    private  String email;
    private  boolean active;
    private  String username;
    private  String password;
//    private LocalDateTime lastUpdate;
//    private AddressDto addressId;
    //    private Short storeid;

    }
