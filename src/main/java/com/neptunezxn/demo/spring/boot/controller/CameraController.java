package com.neptunezxn.demo.spring.boot.controller;

import com.neptunezxn.demo.spring.boot.persistence.entity.Camera;
import com.neptunezxn.demo.spring.boot.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("camera/")
public class CameraController {

    @Autowired
    private CameraService cameraService;

    @GetMapping("/populate")
    public String populateCameras() {
        cameraService.populateSampleCameras();
        return "Success";
    }

    @GetMapping("/list")
    public @ResponseBody List<Camera> listCameras() {
        return cameraService.findAllCameras();
    }

    @PostMapping("/add")
    public String addCamera(@RequestBody Camera camera) {
        cameraService.addCamera(camera);
        return "Success";
    }

}
