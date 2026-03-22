package com.healthcare.backend;

import jakarta.persistence.*;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;
    private int experience;

    public Doctor() {}

    public Doctor(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }

    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    public int getExperience() { return experience; }
}