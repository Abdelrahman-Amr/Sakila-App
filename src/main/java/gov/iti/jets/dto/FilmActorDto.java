package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.FilmActor} entity
 */
@Data
@NoArgsConstructor
public class FilmActorDto implements Serializable {
    private  FilmActorPKDto filmActorPK;
    private  LocalDateTime lastUpdate;

    /**
     * A DTO for the {@link gov.iti.jets.entity.FilmActorPK} entity
     */
    @Data
    @NoArgsConstructor
    public static class FilmActorPKDto implements Serializable {
        private  Short actorId;
        private  Short filmId;
    }
}
