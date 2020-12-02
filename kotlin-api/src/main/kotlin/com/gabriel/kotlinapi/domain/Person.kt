package com.gabriel.kotlinapi.domain

import java.time.LocalDate

data class Person(
        val name: String,
        val collegeCompletedYear: Int?,
        val bornAt: LocalDate,
        val active: Boolean
)