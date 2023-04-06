package gov.iti.jets.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.Actor} entity
 */
@Data
public class ActorDto implements Serializable {
    private  Integer actorId;
    private  String firstName;
    private  String lastName;
    private  Date lastUpdate;
}
