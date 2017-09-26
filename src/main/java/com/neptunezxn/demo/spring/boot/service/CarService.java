package com.neptunezxn.demo.spring.boot.service;

import com.neptunezxn.demo.spring.boot.persistence.entity.Car;
import com.neptunezxn.demo.spring.boot.persistence.entity.CarMake;
import com.neptunezxn.demo.spring.boot.persistence.repository.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Queue;
import java.lang.invoke.MethodHandles;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private static Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getName());

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private Queue carRegisterQueue;

    public void populateSampleCars() {
        Car polo = new Car(CarMake.VOLKSWAGEN, "POLO", "New", Date.valueOf(LocalDate.now()));
        Car golf = new Car(CarMake.VOLKSWAGEN, "GOLF", "New", Date.valueOf(LocalDate.now()));

        carRepository.save(polo);
        carRepository.save(golf);
    }

    public void addCar(Car car) {
        car.setCreated(Date.valueOf(LocalDate.now()));
        carRepository.save(car);
    }

    public List<Car> getAllCars() {
        List<Car> result = new ArrayList<>();
        carRepository.findAll().iterator().forEachRemaining(result::add);
        return result;
    }

    public List<Car> getCar(String description) {
        LOGGER.info("Trying to find car with description {}.", description);
        return carRepository.findByDescription(description);
    }

    public void register(Car car) throws JMSException {
        jmsTemplate.convertAndSend(carRegisterQueue.getQueueName(), car);
    }

}
