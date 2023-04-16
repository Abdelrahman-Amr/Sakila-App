package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO for the {@link gov.iti.jets.entity.Actor} entity
 */
@Data
@NoArgsConstructor
public class ActorDto extends BaseDto {
    private  Integer actorId;
    private  String firstName;
    private  String lastName;
//    private LocalDateTime lastUpdate;
}
