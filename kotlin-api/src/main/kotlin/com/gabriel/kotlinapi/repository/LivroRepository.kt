package com.gabriel.kotlinapi.repository

import com.gabriel.kotlinapi.model.Livro
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LivroRepository: JpaRepository<Livro, Long> {
}