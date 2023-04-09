package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Film;
import gov.iti.jets.entity.FilmActor;
import gov.iti.jets.persistence.repository.FilmRepository;
import gov.iti.jets.util.MyLocal;
import jakarta.persistence.Query;

import java.util.List;

public class FilmRepositoryImpl extends BaseRepositoryImpl<Film, Short> implements FilmRepository {
    public FilmRepositoryImpl()
    {
        super(Film.class, MyLocal.getInstance().get());
    }

    @Override
    public List<Film> findFilmsByActorId(Integer actorId) {
        Query query = entityManager.createQuery("from FilmActor f where f.actor.actorId =:actorId");
        query.setParameter("actorId", actorId);
        List<FilmActor> filmActors = query.getResultList();
        List<Film> films = filmActors.stream().map(FilmActor::getFilm).toList();
        return  films;
    }
}
