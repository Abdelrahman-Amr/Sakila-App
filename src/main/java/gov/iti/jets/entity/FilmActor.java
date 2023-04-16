/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.iti.jets.entity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 *
 * @author Abdolrahman
 */
@Entity
@Table(name = "film_actor")
@NamedQueries({
    @NamedQuery(name = "FilmActor.findAll", query = "SELECT f FROM FilmActor f"),
    @NamedQuery(name = "FilmActor.findByActorId", query = "SELECT f FROM FilmActor f WHERE f.filmActorPK.actorId = :actorId"),
    @NamedQuery(name = "FilmActor.findByFilmId", query = "SELECT f FROM FilmActor f WHERE f.filmActorPK.filmId = :filmId"),
    @NamedQuery(name = "FilmActor.findByLastUpdate", query = "SELECT f FROM FilmActor f WHERE f.lastUpdate = :lastUpdate")})
public class FilmActor implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FilmActorPK filmActorPK;
    @Basic(optional = false)
    @Column(name = "last_update")
//    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime lastUpdate;
    @JoinColumn(name = "actor_id", referencedColumnName = "actor_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Actor actor;
    @JoinColumn(name = "film_id", referencedColumnName = "film_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Film film;

    public FilmActor() {
    }

    public FilmActor(FilmActorPK filmActorPK) {
        this.filmActorPK = filmActorPK;
    }

    public FilmActor(FilmActorPK filmActorPK, LocalDateTime lastUpdate) {
        this.filmActorPK = filmActorPK;
        this.lastUpdate = lastUpdate;
    }

    public FilmActor(short actorId, short filmId) {
        this.filmActorPK = new FilmActorPK(actorId, filmId);
    }

    public FilmActorPK getFilmActorPK() {
        return filmActorPK;
    }

    public void setFilmActorPK(FilmActorPK filmActorPK) {
        this.filmActorPK = filmActorPK;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filmActorPK != null ? filmActorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FilmActor)) {
            return false;
        }
        FilmActor other = (FilmActor) object;
        if ((this.filmActorPK == null && other.filmActorPK != null) || (this.filmActorPK != null && !this.filmActorPK.equals(other.filmActorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.FilmActor[ filmActorPK=" + filmActorPK + " ]";
    }
    
}
