package odelia.micronaut.jpa.kotlin.repository

import odelia.micronaut.jpa.kotlin.SortingAndOrderArguments
import odelia.micronaut.jpa.kotlin.domain.LoggiUser
import javax.validation.constraints.NotBlank

interface LoggiUserRepository {

    fun findById(id: Long): LoggiUser?

    fun findByCompany(idCompany: Long): LoggiUser?

    fun save(@NotBlank name: String): LoggiUser

    fun deleteById(id: Long)

    fun findAll(args: SortingAndOrderArguments): List<LoggiUser>

    fun update(id: Long, @NotBlank name: String): Int
}