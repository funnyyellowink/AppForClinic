package com.trainee.AppForClinic;

import com.trainee.AppForClinic.model.Doctor;
import com.trainee.AppForClinic.service.DoctorServiceImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.trainee.AppForClinic"})
public class AppForClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppForClinicApplication.class, args);

	}

}
