package com.gabriel.kotlinapi

import org.springframework.amqp.core.Queue
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.Bean

@EnableCaching
@SpringBootApplication
class KotlinApiApplication

	fun main(args: Array<String>) {
		runApplication<KotlinApiApplication>(*args)
	}

