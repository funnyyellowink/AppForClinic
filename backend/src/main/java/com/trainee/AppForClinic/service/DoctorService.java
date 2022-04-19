package com.trainee.AppForClinic.service;

import com.trainee.AppForClinic.model.Doctor;

import java.util.List;

public interface DoctorService {
    public Doctor saveDoctor(Doctor doctor);
    public List<Doctor> getAllDoctors();
    public Doctor updateDoctor(Doctor doctor);
    public Doctor deleteDoctor(Doctor doctor);
}
