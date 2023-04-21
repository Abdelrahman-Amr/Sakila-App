package gov.iti.jets.dto;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO for the {@link gov.iti.jets.entity.Actor} entity
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class ActorDto extends BaseDto {
    private  Integer actorId;
    private  String firstName;
    private  String lastName;
//    private LocalDateTime lastUpdate;
}
