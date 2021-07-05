package de.codecentric.apifirstspringboot.repository;

import de.codecentric.apifirstspringboot.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<Article, Long> {

}
