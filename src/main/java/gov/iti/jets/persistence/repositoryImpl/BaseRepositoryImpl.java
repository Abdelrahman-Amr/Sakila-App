package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.BaseEntity;
import gov.iti.jets.persistence.repository.BaseRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class BaseRepositoryImpl<E extends BaseEntity, T> implements BaseRepository<E  , T> {

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

    @Override
    public E add(E entity) {
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
        }catch (Exception ex)
        {
            entityManager.getTransaction().rollback();
            entity = null;
            ex.printStackTrace();
        }
        finally {
            entityManager.getTransaction().commit();
        }
       return entity;
    }

    @Override
    public E update(E entity) {
        try{
            entityManager.getTransaction().begin();
            entityManager.merge(entity);
        }catch (Exception ex)
        {
            entityManager.getTransaction().rollback();
            entity = null;
            ex.printStackTrace();
        }
        finally {
            entityManager.getTransaction().commit();
        }
        return entity;
    }


}
