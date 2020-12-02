package com.gabriel.kotlinconsumer

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinConsumerApplication

	fun main(args: Array<String>) {
		runApplication<KotlinConsumerApplication>(*args)
	}
