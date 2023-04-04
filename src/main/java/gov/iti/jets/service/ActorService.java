package gov.iti.jets.service;

import gov.iti.jets.entity.Actor;
import gov.iti.jets.mapper.ActorMapper;
import gov.iti.jets.repository.ActorRepositoryImpl;
import gov.iti.jets.web.DBFactory;
import gov.iti.jets.web.dto.ActorDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ActorService {

    private static  volatile ActorService actorService;

    private ActorService()
    {

    }
    public static ActorService getInstance()
    {
        if(actorService == null)
        {
            synchronized (ActorService.class)
            {
                if(actorService == null)
                {
                    actorService = new ActorService();
                }
            }
        }
        return  actorService;
    }

    public List<ActorDto> findAllActors()
    {
        EntityManager entityManager = DBFactory.getInstance().createEntityManager();
        ActorRepositoryImpl actorRepository = new ActorRepositoryImpl();
        ActorMapper actorMapper = new ActorMapper();
        List<Actor> actors = actorRepository.findAllActors(entityManager);
        entityManager.close();
        return  actorMapper.toDTOs(actors);
    }

    public ActorDto findActorById( int id)
    {
        EntityManager entityManager = DBFactory.getInstance().createEntityManager();
        ActorMapper actorMapper = new ActorMapper();
        ActorRepositoryImpl actorRepository = new ActorRepositoryImpl();
        Actor actor =  actorRepository.findActorById(entityManager, id);
        return actorMapper.toDTO(actor);
    }
}
