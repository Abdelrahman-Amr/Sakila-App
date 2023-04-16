package gov.iti.jets.mapper;

import gov.iti.jets.dto.InventoryDto;
import gov.iti.jets.entity.Inventory;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface InventoryMapper  extends BaseMapper<Inventory, InventoryDto> {

}
