package odelia.micronaut.jpa.kotlin.repository

import odelia.micronaut.jpa.kotlin.SortingAndOrderArguments
import odelia.micronaut.jpa.kotlin.domain.LoggiUser
import javax.inject.Singleton

@Singleton
open class LoggiOneRepositoryImpl(): LoggiUserRepository{

    override fun findById(id: Long): LoggiUser? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun save(name: String): LoggiUser {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteById(id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(args: SortingAndOrderArguments): List<LoggiUser> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(id: Long, name: String): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}