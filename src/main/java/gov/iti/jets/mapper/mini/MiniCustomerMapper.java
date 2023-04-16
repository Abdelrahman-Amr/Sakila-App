package gov.iti.jets.mapper.mini;

import gov.iti.jets.dto.miniDto.MiniCustomerDto;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)

public interface MiniCustomerMapper extends BaseMapper<Customer, MiniCustomerDto> {
}
