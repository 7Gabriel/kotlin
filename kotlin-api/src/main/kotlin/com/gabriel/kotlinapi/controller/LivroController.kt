package com.gabriel.kotlinapi.controller

import com.gabriel.kotlinapi.model.Livro
import com.gabriel.kotlinapi.repository.CategoriaRepository
import com.gabriel.kotlinapi.repository.LivroRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class LivroController(private val livroRepository: LivroRepository, private val categoriaRepository: CategoriaRepository) {

    @GetMapping("/livros")
    fun getAllLivros(): List<Livro> = livroRepository.findAll()

    @PostMapping("/livros")
    fun createLivro(@Valid @RequestBody livro: Livro): Livro {

        livro.categoria?.let { categoriaRepository.save(it)
            livroRepository.save(livro)
        }

        return livro
    }

    @GetMapping("/livros/{id}")
    fun getLivroById(@PathVariable(value = "id") livroId: Long): ResponseEntity<Livro> {
        return livroRepository.findById(livroId).map { livro -> ResponseEntity.ok(livro)
        }.orElse(ResponseEntity.notFound().build())
    }

    @DeleteMapping("/livros/{id}")
    fun deleteById(@PathVariable(value = "id") livroId: Long): ResponseEntity<Void> {

        return livroRepository.findById(livroId).map { livro -> livroRepository.delete(livro)
            ResponseEntity<Void>(HttpStatus.OK)}
                .orElse(ResponseEntity.notFound().build())
    }

}