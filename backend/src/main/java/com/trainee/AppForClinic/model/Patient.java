package com.trainee.AppForClinic.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.trainee.AppForClinic.model.Doctor;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patientId;
    private String firstName;
    private String lastName;
    private int age;
    private String disease;

    @ManyToOne
    @JsonBackReference
    private Doctor doctor;

    public Patient() {

    }

    public Patient(String firstName, String lastName, int age, String disease, Doctor doctor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.disease = disease;
        this.doctor = doctor;
    }

    public long getId() { return patientId; }
    public void setId(long id) { this.patientId = patientId; }

    @Column(name = "first_name_p", nullable = false)
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    @Column(name = "last_name_p", nullable = false)
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    @Column(name = "age", nullable = false)
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Column(name = "disease", nullable = false)
    public String getDisease() { return disease; }
    public void setDisease(String disease) { this.disease = disease; }

    @Column(name = "doctor", nullable = false)
    public Doctor getDoctor() { return doctor; }
    public void setDoctor(Doctor doctor) { this.doctor = doctor; }
}
