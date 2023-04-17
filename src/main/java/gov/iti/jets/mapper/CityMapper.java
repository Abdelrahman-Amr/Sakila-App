package gov.iti.jets.mapper;

import gov.iti.jets.dto.CityDto;
import gov.iti.jets.entity.City;
import gov.iti.jets.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface CityMapper extends BaseMapper<City, CityDto> {

    default City partialUpdate(CityDto dto, City entity) {
        if (dto == null) {
            return entity;
        }

        if (dto.getCityId() != null) {
            entity.setCityId(dto.getCityId());
        }
        if (dto.getCity() != null) {
            entity.setCity(dto.getCity());
        }
        if (dto.getLastUpdate() != null) {
            entity.setLastUpdate(dto.getLastUpdate());
        }
        if (dto.getCountryId() != null) {

            Country country = new Country();
            country.setCountryId(dto.getCountryId().getCountryId());
            country.setCountry(dto.getCountryId().getCountry());
            country.setLastUpdate(dto.getCountryId().getLastUpdate());
            entity.setCountryId(country);
        }
        return entity;
    }
}
