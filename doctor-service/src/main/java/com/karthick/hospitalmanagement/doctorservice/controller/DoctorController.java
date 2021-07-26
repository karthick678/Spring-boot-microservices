package com.karthick.hospitalmanagement.doctorservice.controller;

import com.karthick.hospitalmanagement.doctorservice.modal.Doctor;
import com.karthick.hospitalmanagement.doctorservice.service.DoctorService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DoctorController {

    @Autowired
    Environment environment;

    @Autowired
    DoctorService doctorService;

    Logger logger = LoggerFactory.getLogger(DoctorController.class);

    @GetMapping("/getDoctorDetails/{id}")
    @ApiOperation(value = "find doctor by id",
            notes = "provided an id to look up specific doctor details",
            response = Doctor.class)
    public Optional<Doctor> getDoctorDetails(@PathVariable("id") int id) {
        logger.error("Error happend");
        System.out.println(environment.getProperty("local.server.port"));
        return doctorService.getDoctorDetails(id);
    }

    @GetMapping("/doctor")
    public String doctor() {
        System.out.println(environment.getProperty("local.server.port"));
        return "doctor";
    }
}
