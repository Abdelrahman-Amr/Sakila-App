package gov.iti.jets.service;

import gov.iti.jets.dto.ActorDto;
import gov.iti.jets.entity.Actor;
import gov.iti.jets.mapper.ActorMapper;
import gov.iti.jets.persistence.repositoryImpl.ActorRepositoryImpl;

import java.util.List;

public class ActorService extends BaseServiceImpl<Actor, ActorDto, Integer>{

    private static  volatile ActorService actorService;
    private ActorService()
    {
        super(Actor.class, ActorMapper.class);
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

    public List<ActorDto> findByName(String name)
    {
        ActorRepositoryImpl actorRepository = new ActorRepositoryImpl();
        List<Actor> actors = actorRepository.findByName(name);
        return baseMapper.toDTOs(actors);
    }
}
