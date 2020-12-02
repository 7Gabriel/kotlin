package com.gabriel.kotlinapi.controller

import com.gabriel.kotlinapi.model.Livro
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.http.HttpEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("exchanges")
class ExchangeController (private val rabbitTemplate: RabbitTemplate){

    private val log = LoggerFactory.getLogger(javaClass)

    @PostMapping("{exchange}/{rountingKey}")
    fun postOnExchange(@PathVariable exchange: String, @PathVariable rountingKey: String, @RequestBody message: String): HttpEntity<Any?> {
        log.info("sending message")
        rabbitTemplate.convertAndSend(exchange, rountingKey, message)
        return ResponseEntity.ok().build()
    }

    @PostMapping("json/{exchange}/{rountingKey}")
    fun postJsonOnExchange(@PathVariable exchange: String, @PathVariable rountingKey: String, @RequestBody message: String): HttpEntity<Any?> {
        log.info("sending message $message")
        rabbitTemplate.convertAndSend(exchange, rountingKey, message)
        return ResponseEntity.ok().build()
    }
}