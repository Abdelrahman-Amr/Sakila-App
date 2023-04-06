package gov.iti.jets.service;

import gov.iti.jets.entity.Actor;
import gov.iti.jets.mapper.ActorMapper;
import gov.iti.jets.persistence.repository.ActorRepositoryImpl;
import gov.iti.jets.persistence.DBFactory;
import gov.iti.jets.dto.ActorDto;
import jakarta.persistence.EntityManager;
import org.mapstruct.factory.Mappers;

import java.util.List;

public class ActorService {

    private static  volatile ActorService actorService;
    private  ActorMapper actorMapper;

    private ActorService()
    {
        actorMapper =  Mappers.getMapper(ActorMapper.class);
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
        ActorRepositoryImpl actorRepository = new ActorRepositoryImpl();
        List<Actor> actors = actorRepository.findAll();
        return  actorMapper.toDTOs(actors);
    }

    public ActorDto findActorById( int id)
    {
        ActorRepositoryImpl actorRepository = new ActorRepositoryImpl();
        Actor actor =  actorRepository.findById( id);
        return actorMapper.toDto(actor);
    }
}
