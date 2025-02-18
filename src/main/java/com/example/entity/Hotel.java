package com.example.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(columnDefinition = "CHAR(36)", updatable = false, nullable = false)
    private String id;

    private String name;
    private String location;

    public Hotel() {}

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
