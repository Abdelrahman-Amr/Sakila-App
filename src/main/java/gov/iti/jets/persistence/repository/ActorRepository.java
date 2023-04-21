package gov.iti.jets.persistence.repository;

import gov.iti.jets.entity.Actor;

import java.util.List;

public interface ActorRepository extends BaseRepository<Actor, Integer>{

    List<Actor> findByName(String name);


}
