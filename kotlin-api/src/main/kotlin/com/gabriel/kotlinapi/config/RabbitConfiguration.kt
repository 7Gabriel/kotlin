package com.gabriel.kotlinapi.config

import org.springframework.amqp.core.*
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.amqp.rabbit.core.RabbitAdmin
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct

@Configuration
class RabbitConfiguration(private val connectionFactory: ConnectionFactory) {

    @PostConstruct
    fun createRabbitElements(){
        val rabbitAdmin = RabbitAdmin(connectionFactory)
        createExchange(rabbitAdmin)
        createFirstQueue(rabbitAdmin)
    }

    private fun createFirstQueue(rabbitAdmin: RabbitAdmin) {
        val queue = QueueBuilder.durable(QueueDefinition.FIRST_QUEUE)
                .build()
        val binding = Binding(
                QueueDefinition.FIRST_QUEUE,
                Binding.DestinationType.QUEUE,
                QueueDefinition.DIRECT_EXCHANGE,
                QueueDefinition.FIRST_BINDING_KEY,
                null
        )
        rabbitAdmin.declareQueue(queue)
        rabbitAdmin.declareBinding(binding)
    }

    private fun createExchange(rabbitAdmin: RabbitAdmin) {
        val exchange = ExchangeBuilder
                .directExchange(QueueDefinition.DIRECT_EXCHANGE)
                .durable(true)
                .build<Exchange>()
            rabbitAdmin.declareExchange(exchange)
    }

    private fun createSecondQueue(rabbitAdmin: RabbitAdmin) {
        val queue = QueueBuilder.durable(QueueDefinition.SECOND_QUEUE)
                .maxLength(10)
                .ttl(30_000)
                .deadLetterExchange(QueueDefinition.DLQ_EXCHANGE)
                .deadLetterRoutingKey(QueueDefinition.DLQ_QUEUE)
                .build()
        val binding = Binding(
                QueueDefinition.SECOND_QUEUE,
                Binding.DestinationType.QUEUE,
                QueueDefinition.DIRECT_EXCHANGE,
                QueueDefinition.SECOND_BINDING_KEY,
                null
        )
        rabbitAdmin.declareQueue(queue)
        rabbitAdmin.declareBinding(binding)
    }

    private fun createDLQ(rabbitAdmin: RabbitAdmin){
        val queue = QueueBuilder.durable(QueueDefinition.DLQ_QUEUE).build()
        val exchange = ExchangeBuilder
                .directExchange(QueueDefinition.DLQ_EXCHANGE)
                .durable(true)
                .build<Exchange>()
        val binding = Binding(
                QueueDefinition.DLQ_QUEUE,
                Binding.DestinationType.QUEUE,
                QueueDefinition.DLQ_EXCHANGE,
                QueueDefinition.DLQ_BINDING_KEY,
                null
        )
        rabbitAdmin.declareQueue(queue)
        rabbitAdmin.declareExchange(exchange)
        rabbitAdmin.declareBinding(binding)
    }

}