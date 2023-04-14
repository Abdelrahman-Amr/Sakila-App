package gov.iti.jets.mapper;

import gov.iti.jets.dto.CategoryDto;
import gov.iti.jets.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface CategoryMapper extends BaseMapper<Category, CategoryDto> {

}
