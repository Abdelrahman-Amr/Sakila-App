package gov.iti.jets.entity;

import jakarta.persistence.*;

import java.util.Date;

@Table(name = "film_category")
@Entity
public class FilmCategory {
    @EmbeddedId
    private FilmCategoryId id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_id")
    @MapsId("productId")
    private Film film;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="category_id")
    @MapsId("categoryId")
    private Category category;



    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public FilmCategoryId getId() {
        return id;
    }

    public void setId(FilmCategoryId id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
