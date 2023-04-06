package gov.iti.jets.persistence.repository;

import gov.iti.jets.entity.Actor;
import gov.iti.jets.util.MyLocal;
import jakarta.persistence.EntityManager;

import java.util.List;


public class ActorRepositoryImpl extends BaseRepositoryImpl<Actor, Integer> implements ActorRepository{
    public ActorRepositoryImpl()
    {
        super(Actor.class, MyLocal.getInstance().get());
    }

}
