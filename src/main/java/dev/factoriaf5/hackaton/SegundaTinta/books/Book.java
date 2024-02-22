package dev.factoriaf5.hackaton.SegundaTinta.books;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;


@Entity
@Table(name = "announcements")

public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")

    private Long id;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private String genre;

    @Column
    private String description;

    public Book() {
    }


public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public String getAuthor() {
    return author;
}
public void setAuthor(String author) {
    this.author = author;
}
public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
}

public String getGenre() {
    return genre;
}
public void setGenre(String genre) {
    this.genre = genre;
}

}