package gov.iti.jets.mapper.mini;

import gov.iti.jets.dto.miniDto.MiniFilmDto;
import gov.iti.jets.entity.Film;
import gov.iti.jets.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)

public interface MiniInventoryMapper extends BaseMapper<Film, MiniFilmDto> {
}
