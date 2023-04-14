/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.iti.jets.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


/**
 *
 * @author Abdolrahman
 */
@Entity
@Table(name = "film_actor")
@Data
@NoArgsConstructor
public class FilmActor implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FilmActorPK filmActorPK;
    @Basic(optional = false)
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @JoinColumn(name = "actor_id", referencedColumnName = "actor_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Actor actor;
    @JoinColumn(name = "film_id", referencedColumnName = "film_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Film film;



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
