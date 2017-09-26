package com.neptunezxn.demo.spring.boot.service;

import com.neptunezxn.demo.spring.boot.persistence.entity.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;

@Component
public class CarRegisterService {

    private static Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getName());

    @ServiceActivator
    public void register(Car car) {
        LOGGER.info("Car registered successfully: {}", car);
    }
}
