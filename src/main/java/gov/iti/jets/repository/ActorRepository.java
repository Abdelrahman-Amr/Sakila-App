package gov.iti.jets.repository;

import gov.iti.jets.entity.Actor;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Set;

public interface ActorRepository {
     Actor findActorById(EntityManager entityManager, Integer id);
     List<Actor> findAllActors(EntityManager entityManager);
}
