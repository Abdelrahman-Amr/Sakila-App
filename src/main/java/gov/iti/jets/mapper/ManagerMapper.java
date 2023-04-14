package gov.iti.jets.mapper;

import gov.iti.jets.dto.ManagerDto;
import gov.iti.jets.entity.Staff;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)

public interface ManagerMapper extends BaseMapper<Staff, ManagerDto> {
}
