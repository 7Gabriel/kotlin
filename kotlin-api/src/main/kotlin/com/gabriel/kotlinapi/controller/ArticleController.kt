package com.gabriel.kotlinapi.controller

import com.gabriel.kotlinapi.model.Article
import com.gabriel.kotlinapi.repository.ArticleRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class ArticleController (private val articleRepository: ArticleRepository){

    @GetMapping("/articles")
    fun getAllArticle(): List<Article> =
            articleRepository.findAll()

    @PostMapping("/articles")
    fun createdArticle(@Valid @RequestBody article: Article): Article =
            articleRepository.save(article)

    @GetMapping("/articles/{id}")
    fun getArticleById(@PathVariable(value = "id") articleId: Long): ResponseEntity<Article> {

        return articleRepository.findById(articleId).map { article ->
            ResponseEntity.ok(article)
        }.orElse(ResponseEntity.notFound().build())
    }

    @PutMapping("/articles/{id}")
    fun updateArticleById(@PathVariable(value = "id") articleId: Long, @Valid @RequestBody article: Article): ResponseEntity<Article>{
        return  articleRepository.findById(articleId).map { existingArticle ->
            val updateArticle: Article = existingArticle.copy(title = article.title, content = article.content)
            ResponseEntity.ok().body(articleRepository.save(updateArticle))
        }.orElse(ResponseEntity.notFound().build())
    }

    @DeleteMapping("/articles/{id}")
    fun deleteArticle(@PathVariable(value = "id") articleId: Long): ResponseEntity<Void> {

        return articleRepository.findById(articleId).map { article -> articleRepository.delete(article)
        ResponseEntity<Void>(HttpStatus.OK)}
                .orElse(ResponseEntity.notFound().build())
    }
}