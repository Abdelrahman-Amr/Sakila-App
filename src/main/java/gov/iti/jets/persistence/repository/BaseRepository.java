package gov.iti.jets.persistence.repository;

import gov.iti.jets.entity.BaseEntity;

import java.util.List;

public interface BaseRepository <E extends BaseEntity, T>{

    E findById(T id);
    List<E> findAll();
    E add(E entity);
    E update(E entity);

}
