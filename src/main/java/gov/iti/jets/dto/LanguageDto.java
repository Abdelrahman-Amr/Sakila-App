package gov.iti.jets.dto;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO for the {@link gov.iti.jets.entity.Language} entity
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class LanguageDto extends BaseDto{
    private  Short languageId;
    private  String name;
//    private LocalDateTime lastUpdate;


}
