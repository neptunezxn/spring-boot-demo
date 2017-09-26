package com.neptunezxn.demo.spring.boot.service;

import com.neptunezxn.demo.spring.boot.persistence.entity.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class CarRegisterService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CarRegisterService.class);

    @ServiceActivator
    public void register(Car car) {
        LOGGER.info("Car registered successfully: {}", car);
    }
}
