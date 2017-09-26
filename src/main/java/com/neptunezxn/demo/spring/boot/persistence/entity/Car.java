package com.neptunezxn.demo.spring.boot.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAR_SEQ")
    @SequenceGenerator(sequenceName = "car_seq", allocationSize = 1, name = "CAR_SEQ")
    private Long id;

    private CarMake carMake;

    private String model;

    private String description;

    @Column(name = "CREATED_DATE")
    private Date created;

    public Car() {

    }

    public Car(CarMake carMake, String model, String description, Date created) {
        this.carMake = carMake;
        this.model = model;
        this.description = description;
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CarMake getCarMake() {
        return carMake;
    }

    public void setCarMake(CarMake carMake) {
        this.carMake = carMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carMake=" + carMake +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                '}';
    }
}
