package com.example.demo.consumer;

import com.example.demo.config.RegistrationAMQPConfig;
import com.example.demo.dto.RegistrationDTO;
import com.example.demo.service.RegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationConsumer {

    @Autowired
    private RegistrationService service;

    private static final Logger LOGGER = LoggerFactory.getLogger(RegistrationConsumer.class);

    @RabbitListener(queues = RegistrationAMQPConfig.QUEUE)
    public void consumer(RegistrationDTO registration) {
        LOGGER.info(String.format("Consuming the registration %s", registration.getId()));
        service.saveRegistration(registration);
    }

}
