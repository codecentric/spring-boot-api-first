package de.codecentric.apifirstspringboot.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private LocalDate date;
    private String description;
    private String imageUrl;
    private String author;


    public Article() {
    }


    public Article(Integer id, String title, LocalDate date, String description, String imageUrl, String author) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.description = description;
        this.imageUrl = imageUrl;
        this.author = author;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Article)) {
            return false;
        }
        Article article = (Article) o;
        return Objects.equals(id, article.id) && Objects.equals(title, article.title) && Objects.equals(date, article.date) && Objects.equals(description, article.description) && Objects.equals(imageUrl, article.imageUrl) && Objects.equals(author, article.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, date, description, imageUrl, author);
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", date='" + getDate() + "'" +
            ", description='" + getDescription() + "'" +
            ", imageUrl='" + getImageUrl() + "'" +
            ", author='" + getAuthor() + "'" +
            "}";
    }


}
