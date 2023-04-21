package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Actor;
import gov.iti.jets.persistence.repository.ActorRepository;
import gov.iti.jets.util.MyLocal;
import jakarta.persistence.TypedQuery;

import java.util.List;


public class ActorRepositoryImpl extends BaseRepositoryImpl<Actor, Integer> implements ActorRepository {
    public ActorRepositoryImpl()
    {
        super(Actor.class, MyLocal.getInstance().get());
    }

    @Override
    public List<Actor> findByName(String name)
    {
        TypedQuery<Actor> query = entityManager.createNamedQuery("Actor.getByName",Actor.class);
        query.setParameter("name", name);
        return  query.getResultList();
    }

}
