package com.neptunezxn.demo.spring.boot.controller;

import com.neptunezxn.demo.spring.boot.persistence.entity.Car;
import com.neptunezxn.demo.spring.boot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jms.JMSException;
import java.util.List;

@RestController
@RequestMapping("car/")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/populate")
    public String populateSampleCars() {
        carService.populateSampleCars();
        return "Success";
    }

    @GetMapping("/list")
    public @ResponseBody List<Car> listCars() {
        return carService.getAllCars();
    }

    @GetMapping("/description/{description}")
    public @ResponseBody List<Car> findDescription(@PathVariable String description) {
        return carService.getCar(description);
    }


    @PostMapping("/add")
    public String addCar(@RequestBody Car car) throws JMSException {
        carService.addCar(car);
        carService.register(car);
        return "Success";
    }

}
