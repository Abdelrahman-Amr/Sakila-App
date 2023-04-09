package gov.iti.jets.mapper;

import gov.iti.jets.dto.BaseDto;
import gov.iti.jets.entity.BaseEntity;
import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.stream.Collectors.toCollection;

public interface BaseMapper <E extends BaseEntity, D extends BaseDto>{
    E toEntity(D dto);

    D toDto(E entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    E partialUpdate(D dto, @MappingTarget E entity);

    default ArrayList<D> toDTOs(Collection<E> entities) {
        return entities.stream().map(entity -> toDto(entity)).collect(toCollection(ArrayList<D>::new));
    }

    default ArrayList<E> toEntities(Collection<D> dtos) {
        return dtos.stream().map(dto -> toEntity(dto)).collect(toCollection(ArrayList<E>::new));
    }
}
