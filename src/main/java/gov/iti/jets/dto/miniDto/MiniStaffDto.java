package gov.iti.jets.dto.miniDto;

import gov.iti.jets.dto.BaseDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MiniStaffDto extends BaseDto {
    private  Short staffId;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String username;
    private  String password;
}
