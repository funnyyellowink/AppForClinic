package com.trainee.AppForClinic.service;

import com.trainee.AppForClinic.model.Doctor;
import com.trainee.AppForClinic.model.Patient;
import com.trainee.AppForClinic.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImplementation implements DoctorService{

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) { return null; }

    @Override
    public Doctor deleteDoctor(Doctor doctor) { return null; }
}
