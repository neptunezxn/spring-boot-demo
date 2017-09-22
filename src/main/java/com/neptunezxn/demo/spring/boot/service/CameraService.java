package com.neptunezxn.demo.spring.boot.service;

import com.neptunezxn.demo.spring.boot.persistence.entity.Camera;
import com.neptunezxn.demo.spring.boot.persistence.entity.CameraBrand;
import com.neptunezxn.demo.spring.boot.persistence.repository.CameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CameraService {

    @Autowired
    private CameraRepository cameraRepository;

    public void populateSampleCameras() {
        Camera camera = new Camera(CameraBrand.NIKON, "D90", "New", Date.valueOf(LocalDate.now()));

        cameraRepository.save(camera);
    }

    public List<Camera> findAllCameras() {
        List<Camera> result = new ArrayList<>();
        cameraRepository.findAll().iterator().forEachRemaining(result::add);
        return result;
    }

}
