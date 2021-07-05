package de.codecentric.apifirstspringboot.controller;

import de.codecentric.apifirstspringboot.repository.NewsRepository;
import de.codecentric.apifirstspringboot.service.NewsService;
import de.codecentric.generated.news.api.NewsApi;
import de.codecentric.generated.news.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static de.codecentric.apifirstspringboot.mapper.ArticleModelMapper.toApi;

@Controller
public class NewsController implements NewsApi {

    @Autowired
    private NewsService newsService;

    @Override
    public ResponseEntity<List<Article>> getNews() {
        List<de.codecentric.apifirstspringboot.entities.Article> allArticles = newsService.retrieveAllArticles();
        return ResponseEntity.ok().body(toApi(allArticles));
    }
}
