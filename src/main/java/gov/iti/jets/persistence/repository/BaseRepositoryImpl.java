package gov.iti.jets.persistence.repository;

import gov.iti.jets.entity.BaseEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public abstract  class BaseRepositoryImpl<E extends BaseEntity, T> implements BaseRepository<E  , T>{

    protected EntityManager entityManager;
    private Class<?> entityClass;
    public BaseRepositoryImpl(Class<?> entityClass, EntityManager entityManager)
    {
        this.entityClass = entityClass;
        this.entityManager = entityManager;
    }

    @Override
    public E findById( T id) {
        E e = (E) entityManager.find(entityClass, id);
        return e;
    }

    @Override
    public List<E> findAll() {
            Query query = entityManager.createQuery("from "+entityClass.getName(),entityClass);
            List<E> entities = query.getResultList();
            return entities;
    }
}
