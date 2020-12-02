package com.gabriel.kotlinapi.repository


import com.gabriel.kotlinapi.model.Categoria
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoriaRepository: JpaRepository<Categoria, Long> {
}