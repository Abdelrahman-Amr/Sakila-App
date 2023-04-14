package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link gov.iti.jets.entity.Language} entity
 */
@Data
@NoArgsConstructor
public class LanguageDto extends BaseDto{
    private  Short languageId;
    private  String name;


}
