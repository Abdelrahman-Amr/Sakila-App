package gov.iti.jets.persistence.repository;

import gov.iti.jets.entity.Actor;
import gov.iti.jets.entity.BaseEntity;
import jakarta.persistence.EntityManager;

import java.util.List;

public interface BaseRepository <E extends BaseEntity, T>{

    E findById(T id);
    List<E> findAll();
}
