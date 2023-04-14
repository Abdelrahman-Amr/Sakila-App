package gov.iti.jets.mapper;

import gov.iti.jets.dto.AddressDto;
import gov.iti.jets.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface AddressMapper extends BaseMapper<Address, AddressDto> {

}
