package com.gabriel.kotlinapi.controller

import com.gabriel.kotlinapi.model.Categoria
import com.gabriel.kotlinapi.repository.CategoriaRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class CategoriaController(private val categoriaRepository: CategoriaRepository) {

    @GetMapping("/categorias")
    fun getAllCategoria(): List<Categoria> = categoriaRepository.findAll()

    @PostMapping("/categorias")
    fun createLivro(@Valid @RequestBody categoria: Categoria): ResponseEntity<Categoria> {
        categoriaRepository.save(categoria)
        return ResponseEntity.ok(categoria)
    }

    @GetMapping("/categorias/{id}")
    fun getLivroById(@PathVariable(value = "id") categoriaId: Long): ResponseEntity<Categoria>{
        return  categoriaRepository.findById(categoriaId).map { categoria ->
            ResponseEntity.ok(categoria)
        }.orElse(ResponseEntity.notFound().build())
    }
}