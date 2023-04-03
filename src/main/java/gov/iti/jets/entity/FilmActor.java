package gov.iti.jets.entity;

import jakarta.persistence.*;

import java.util.Date;

@Table(name = "film_actor", indexes = {
        @Index(name = "idx_fk_film_id", columnList = "film_id")
})
@Entity
public class FilmActor {
    @EmbeddedId
    private FilmActorId id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="film_id")
    @MapsId("filmId")
    private Film film;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="actor_id")
    @MapsId("actorId")
    private Actor actor;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public FilmActorId getId() {
        return id;
    }

    public void setId(FilmActorId id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
