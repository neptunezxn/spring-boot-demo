package com.neptunezxn.demo.spring.boot.persistence.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Camera {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAMERA_SEQ")
    @SequenceGenerator(sequenceName = "camera_seq", allocationSize = 1, name = "CAMERA_SEQ")
    private Long id;

    private CameraBrand brand;

    private String name;

    private String description;

    @Column(name = "CREATED_DATE")
    private Date created;

    public Camera() {

    }

    public Camera(CameraBrand brand, String name, String description, Date created) {
        this.brand = brand;
        this.name = name;
        this.description = description;
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CameraBrand getBrand() {
        return brand;
    }

    public void setBrand(CameraBrand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
