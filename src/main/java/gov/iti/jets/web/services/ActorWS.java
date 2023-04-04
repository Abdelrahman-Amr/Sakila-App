package gov.iti.jets.web.services;

import gov.iti.jets.entity.Actor;
import gov.iti.jets.mapper.ActorMapper;
import gov.iti.jets.repository.ActorRepositoryImpl;
import gov.iti.jets.service.ActorService;
import gov.iti.jets.web.DBFactory;
import gov.iti.jets.web.dto.ActorDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.persistence.EntityManager;

import java.util.List;

@WebService
public class ActorWS {

    @WebResult(name="Actor")
    public List<ActorDto> findAllActors()
    {
        List<ActorDto> actors = ActorService.getInstance().findAllActors();
        return  actors;
    }

    @WebResult(name="Actor")
    public ActorDto findActorById(@WebParam(name="id") int id)
    {

        return ActorService.getInstance().findActorById(id);
    }


}
