package com.trainee.AppForClinic.controller;

import com.trainee.AppForClinic.model.Doctor;
import com.trainee.AppForClinic.model.Patient;
import com.trainee.AppForClinic.service.DoctorService;
import com.trainee.AppForClinic.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@CrossOrigin
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/add")
    public String add(@RequestBody Patient patient){
        patientService.savePatient(patient);
        return "New patient id added";
    }

    @GetMapping("getAll")
    public List<Patient> list() { return patientService.getAllPatients(); }

}
