package com.gabriel.kotlinconsumer.config

import com.gabriel.kotlinconsumer.service.BasicListener
import org.slf4j.LoggerFactory
import org.springframework.amqp.core.Message
import org.springframework.amqp.core.Queue
import org.springframework.amqp.core.QueueBuilder
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.amqp.rabbit.listener.MessageListenerContainer
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ConsumerConfig(
        private val connectionFactory: ConnectionFactory,
        private val basicListener: BasicListener,
        private val simpleRabbitListenerContainerFactory: SimpleRabbitListenerContainerFactory ) {

    private val log = LoggerFactory.getLogger(javaClass)

    @Bean
    fun queueBasic(): Queue {
        return QueueBuilder
                .durable("FIRST-QUEUE-BASIC")
                .build()
    }

    @Bean
    fun listenerContainer(): MessageListenerContainer {
        val container = SimpleMessageListenerContainer()
        container.connectionFactory = connectionFactory
        container.setQueues(queueBasic())
        container.setMessageListener(basicListener)
        simpleRabbitListenerContainerFactory.adviceChain?.let { container.setAdviceChain(*it) }
        container.start()
        return container
    }

    @RabbitListener(queues = ["SECOND-QUEUE-BASIC"])
    fun receiveMessageFromSecondQueue(message: Message) {
        log.info("receive message")
        val bodyAsString = message.body?.let { String(it) } ?: ""
        log.info("body $bodyAsString")
    }

}