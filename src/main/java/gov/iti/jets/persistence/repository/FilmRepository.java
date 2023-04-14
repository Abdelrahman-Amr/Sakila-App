package gov.iti.jets.persistence.repository;

import gov.iti.jets.entity.Film;

import java.util.List;

public interface FilmRepository extends BaseRepository<Film, Short>{

    List<Film> findFilmsByActorId(Integer actorId);
}
