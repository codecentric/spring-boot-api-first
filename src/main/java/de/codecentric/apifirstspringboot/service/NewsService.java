package de.codecentric.apifirstspringboot.service;

import de.codecentric.apifirstspringboot.entities.Article;
import de.codecentric.apifirstspringboot.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class NewsService {

    private final NewsRepository newsRepository;

    @Autowired
    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public Article createArticle(Article article) {
        return newsRepository.save(article);
    }

    public List<Article> retrieveAllArticles() {
        return newsRepository.findAll();
    }

    public Article findArticle(Long articleId) {
        return newsRepository.getOne(articleId);
    }

}
