package gov.iti.jets.web.controller;

import gov.iti.jets.service.ActorService;
import gov.iti.jets.dto.ActorDto;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("actors")
public class ActorController {

    private ActorService actorService;

    public ActorController()
    {
        actorService = ActorService.getInstance();
    }


    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response findActorById(@PathParam("id") int id)
    {
        ActorDto actorDto = actorService.findActorById(id);
        return  Response.accepted().entity(actorDto).build();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response findActorById()
    {
        List<ActorDto> actorDtos = actorService.findAllActors();
        return  Response.accepted().entity(actorDtos).build();
    }
}
