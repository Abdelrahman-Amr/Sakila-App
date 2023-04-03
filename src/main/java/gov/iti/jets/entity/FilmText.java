package gov.iti.jets.entity;

import jakarta.persistence.*;

@Table(name = "film_text", indexes = {
        @Index(name = "idx_title_description", columnList = "title, description")
})
@Entity
public class FilmText {
    @Id
    @Column(name = "film_id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Lob
    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
