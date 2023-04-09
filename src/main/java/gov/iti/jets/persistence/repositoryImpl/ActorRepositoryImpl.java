package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Actor;
import gov.iti.jets.persistence.repository.ActorRepository;
import gov.iti.jets.util.MyLocal;


public class ActorRepositoryImpl extends BaseRepositoryImpl<Actor, Integer> implements ActorRepository {
    public ActorRepositoryImpl()
    {
        super(Actor.class, MyLocal.getInstance().get());
    }

}
