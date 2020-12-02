package odelia.micronaut.jpa.kotlin.config

import javax.validation.constraints.NotNull

interface ApplicationConfiguration {

    @get:NotNull
    val max: Int?
}