package com.neptunezxn.demo.spring.boot.persistence.repository;

import com.neptunezxn.demo.spring.boot.persistence.entity.Camera;
import org.springframework.data.repository.CrudRepository;

public interface CameraRepository extends CrudRepository<Camera, Long> {
}
