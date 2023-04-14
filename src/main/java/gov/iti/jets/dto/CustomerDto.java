package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.Customer} entity
 */
@Data
@NoArgsConstructor
public class CustomerDto extends BaseDto {
    private  Short customerId;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  boolean active;
    private  LocalDateTime createDate;
}
