package com.neptunezxn.demo.spring.boot.persistence.repository;

import com.neptunezxn.demo.spring.boot.persistence.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
