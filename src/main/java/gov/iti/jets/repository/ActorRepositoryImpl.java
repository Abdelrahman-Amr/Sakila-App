package gov.iti.jets.repository;

import gov.iti.jets.entity.Actor;
import jakarta.persistence.EntityManager;

import java.util.List;


public class ActorRepositoryImpl implements ActorRepository{
    public ActorRepositoryImpl()
    {
    }
    @Override
    public Actor findActorById(EntityManager entityManager, Integer id) {
        return entityManager.find(Actor.class,id);
    }

    @Override
    public List<Actor> findAllActors( EntityManager entityManager) {
        return entityManager.createQuery("from Actor a", Actor.class).getResultList();
    }

}
