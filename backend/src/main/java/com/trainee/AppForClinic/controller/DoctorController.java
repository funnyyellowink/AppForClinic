package com.trainee.AppForClinic.controller;

import com.trainee.AppForClinic.model.Doctor;
import com.trainee.AppForClinic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@CrossOrigin
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @PostMapping("/add")
    public String add(@RequestBody Doctor doctor){
        doctorService.saveDoctor(doctor);
        return "New doctor id added";
    }

    @GetMapping("getAll")
    public List<Doctor> list() { return doctorService.getAllDoctors(); }

}
