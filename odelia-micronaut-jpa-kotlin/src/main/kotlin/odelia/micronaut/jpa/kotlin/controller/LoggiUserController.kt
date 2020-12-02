package odelia.micronaut.jpa.kotlin.controller

import io.micronaut.http.annotation.Controller
import odelia.micronaut.jpa.kotlin.repository.LoggiUserRepository

@Controller("/users")
class LoggiUserController(private val loggiUserRepository: LoggiUserRepository) {



}