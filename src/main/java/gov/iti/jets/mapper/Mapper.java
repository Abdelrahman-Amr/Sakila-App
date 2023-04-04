package gov.iti.jets.mapper;

import gov.iti.jets.entity.Actor;
import gov.iti.jets.entity.BaseEntity;
import gov.iti.jets.web.dto.ActorDto;
import gov.iti.jets.web.dto.BaseDto;

import java.util.ArrayList;
import java.util.Collection;

public interface Mapper <E extends BaseEntity, D extends BaseDto> {
    D toDTO(final E entity);
    E toEntity(final D dto);
    ArrayList<D> toDTOs(final Collection<E> entities);
    ArrayList<E> toEntities(final Collection<D> dtos);
}
