package de.codecentric.apifirstspringboot.controller;

import de.codecentric.apifirstspringboot.service.NewsService;
import de.codecentric.news.api.model.Article;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api")
@Controller
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/news")
    public ResponseEntity<List<Article>> getNews() {
        return new ResponseEntity<>(this.newsService.getNews(), HttpStatus.OK);
    }
}
