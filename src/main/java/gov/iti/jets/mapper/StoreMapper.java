package gov.iti.jets.mapper;

import gov.iti.jets.dto.StoreDto;
import gov.iti.jets.entity.Store;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface StoreMapper extends BaseMapper<Store, StoreDto>{

}
