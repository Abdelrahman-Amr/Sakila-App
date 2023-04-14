package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link gov.iti.jets.entity.Actor} entity
 */
@Data
@NoArgsConstructor
public class ActorDto extends BaseDto {
    private  Integer actorId;
    private  String firstName;
    private  String lastName;
}
