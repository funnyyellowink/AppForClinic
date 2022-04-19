package com.trainee.AppForClinic.service;

import com.trainee.AppForClinic.model.Doctor;
import com.trainee.AppForClinic.model.Patient;

import java.util.List;

public interface PatientService {
    public Patient savePatient(Patient patient);
    public List<Patient> getAllPatients();
    public Patient updatePatient(Patient patient);
    public Patient deletePatient(Patient patient);
}