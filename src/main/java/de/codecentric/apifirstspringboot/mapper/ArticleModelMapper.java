package de.codecentric.apifirstspringboot.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.codecentric.apifirstspringboot.entities.Article;

import java.util.List;
import java.util.stream.Collectors;

public class ArticleModelMapper {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Article toEntity(de.codecentric.generated.news.model.Article article) {
        Article articleEntity = new Article();
        articleEntity.setId(article.getId());
        articleEntity.setTitle(article.getTitle());
        articleEntity.setDate(article.getDate());
        articleEntity.setDescription(article.getDescription());
        articleEntity.setImageUrl(article.getImageUrl());
        return articleEntity;
    }

    public static de.codecentric.generated.news.model.Article toApi(Article article) {
        de.codecentric.generated.news.model.Article articleModel = new de.codecentric.generated.news.model.Article();
        articleModel.setId(article.getId());
        articleModel.setTitle(article.getTitle());
        articleModel.setDate(article.getDate());
        articleModel.setDescription(article.getDescription());
        articleModel.setImageUrl(article.getImageUrl());

        return articleModel;
    }

    public static List<de.codecentric.generated.news.model.Article> toApi(List<Article> retrieveAllArticles) {
        return retrieveAllArticles.stream()
                .map(ArticleModelMapper::toApi)
                .collect(Collectors.toList());
    }

    public static de.codecentric.generated.news.model.Article jsonToArticle(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, de.codecentric.generated.news.model.Article.class);
    }
}
