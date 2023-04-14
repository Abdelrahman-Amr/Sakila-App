package gov.iti.jets.service;

import gov.iti.jets.dto.ActorDto;
import gov.iti.jets.entity.Actor;
import gov.iti.jets.mapper.ActorMapper;

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

}
