package gov.iti.jets.webService;

import gov.iti.jets.entity.Actor;
import gov.iti.jets.service.ActorService;
import gov.iti.jets.dto.ActorDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@WebService
public class ActorWS   {

    private ActorService actorService;
    public ActorWS()
    {

        actorService = ActorService.getInstance();
//        baseService = actorService;
    }
    @WebResult(name="Actor")
    public List<ActorDto> findAllActors()
    {
        List<ActorDto> actors = actorService.findAll();
        return  actors;
    }

    @WebResult(name="Actor")
    public ActorDto findActorById(@WebParam(name="id") int id)
    {
        return actorService.findById(id);
    }

    @WebResult(name="Actor")
    public ActorDto addActor(@WebParam(name = "Actor") ActorDto dto) {
        ActorDto savedDto = actorService.add(dto);
        return savedDto;
    }

    @WebResult(name="Actor")
    public ActorDto updateActor(@WebParam(name = "id")Integer id,@WebParam(name = "Actor") ActorDto dto) {
        ActorDto updatedDto = actorService.update(id, dto);
        return updatedDto;
    }


}
