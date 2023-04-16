package gov.iti.jets.mapper;

import gov.iti.jets.dto.CustomerDto;
import gov.iti.jets.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface CustomerMapper extends BaseMapper<Customer, CustomerDto>{

}
