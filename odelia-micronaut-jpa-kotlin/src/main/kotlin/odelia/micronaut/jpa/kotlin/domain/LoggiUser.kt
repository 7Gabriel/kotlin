package odelia.micronaut.jpa.kotlin.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class LoggiUser(

        @Id
        @GeneratedValue
        val id: Long,
        @get: NotBlank
        val full_name: String = "",
        @get: NotBlank
        val mobile_1: String = "",

        val birthday: String = "",

        val userType: String = "",

        val active: Boolean

)
