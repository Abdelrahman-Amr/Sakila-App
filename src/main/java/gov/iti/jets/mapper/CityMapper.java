package gov.iti.jets.mapper;

import gov.iti.jets.dto.CityDto;
import gov.iti.jets.entity.City;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface CityMapper extends BaseMapper<City, CityDto>  {

}
