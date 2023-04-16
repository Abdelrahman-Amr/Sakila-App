package gov.iti.jets.mapper.mini;

import gov.iti.jets.dto.miniDto.MiniStoreDto;
import gov.iti.jets.entity.Store;
import gov.iti.jets.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)

public interface MiniStoreMapper extends BaseMapper<Store, MiniStoreDto> {
}
