package com.wilk.emailnotificationmicroservice.handler;


import com.wilk.core.ProductCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics="product-created-events-topic")
public class ProductCreatedHandler {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @KafkaHandler
    public void handler(ProductCreatedEvent productCreateEvent) {
        LOGGER.info("Received a new event: {}",productCreateEvent.getTitle());

    }

}
