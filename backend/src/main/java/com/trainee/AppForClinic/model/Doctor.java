package com.trainee.AppForClinic.model;

import javax.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.trainee.AppForClinic.model.Patient;

@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long doctorId;
    private String firstName;
    private String lastName;
    private String position;
    private String workingHours;

    @OneToMany(mappedBy = "doctor")
    @JsonManagedReference
    private List<Patient> patients;

    public Doctor() {

    }

    public Doctor(String firstName, String lastName, String position, String workingHours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.workingHours = workingHours;
    }

    public Doctor(String firstName, String lastName, String position, String workingHours, List<Patient> patients ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.workingHours = workingHours;
        this.patients = patients;
    }

    public long getId() { return doctorId; }
    public void setId(long id) { this.doctorId = doctorId; }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    @Column(name = "last_name", nullable = false)
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    @Column(name = "position", nullable = false)
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    @Column(name = "working_hours", nullable = false)
    public String getWorkingHours() { return workingHours; }
    public void setWorkingHours(String workingHours) { this.workingHours = workingHours; }

    @Column(name = "patients", nullable = false)
    public List<Patient> getPatients() { return patients; }
    public void setPatients(List<Patient> patients) { this.patients = patients; }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + doctorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", workingHours='" + workingHours + '\'' +
                '}';
    }
}
