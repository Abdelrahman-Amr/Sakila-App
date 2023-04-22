package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link gov.iti.jets.entity.FilmText} entity
 */
@Data
@NoArgsConstructor
public class FilmTextDto extends BaseDto {
    private  Short filmId;
    private  String title;
    private  String description;
}
