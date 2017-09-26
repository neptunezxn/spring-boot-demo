package com.neptunezxn.demo.spring.boot.persistence.repository;

import com.neptunezxn.demo.spring.boot.persistence.entity.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {

    List<Car> findByDescription(String description);
}
