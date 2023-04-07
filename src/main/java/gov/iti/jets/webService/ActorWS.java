package gov.iti.jets.webService;

import gov.iti.jets.service.ActorService;
import gov.iti.jets.dto.ActorDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class ActorWS {

    private ActorService actorService;
    public ActorWS()
    {
        actorService = ActorService.getInstance();
    }
    @WebResult(name="Actor")
    public List<ActorDto> findAllActors()
    {
        List<ActorDto> actors = actorService.findAllActors();
        return  actors;
    }

    @WebResult(name="Actor")
    public ActorDto findActorById(@WebParam(name="id") int id)
    {
        return actorService.findActorById(id);
    }


}
