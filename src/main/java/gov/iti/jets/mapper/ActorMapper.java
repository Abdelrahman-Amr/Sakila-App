package gov.iti.jets.mapper;

import gov.iti.jets.entity.Actor;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.web.dto.ActorDto;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.stream.Collectors.toCollection;

public class ActorMapper implements Mapper<Actor, ActorDto>{
    @Override
    public ActorDto toDTO(Actor entity) {
        ActorDto dto = new ActorDto();
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setId(entity.getActorId());
        dto.setLastUpdate(entity.getLastUpdate());
        return dto;
    }

    @Override
    public Actor toEntity(ActorDto dto) {
        Actor entity = new Actor();
        dto.setFirstName(dto.getFirstName());
        dto.setLastName(dto.getLastName());
        dto.setId(dto.getId());
        dto.setLastUpdate(dto.getLastUpdate());
        return entity;
    }
    @Override
    public ArrayList<ActorDto> toDTOs(Collection<Actor> actors) {
        return actors.stream().map(entity -> toDTO(entity)).collect(toCollection(ArrayList<ActorDto>::new));
    }
    @Override
    public ArrayList<Actor> toEntities(Collection<ActorDto> actorDtos) {
        return actorDtos.stream().map(dto -> toEntity(dto)).collect(toCollection(ArrayList<Actor>::new));
    }


}
