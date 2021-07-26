package com.karthick.hospitalmanagement.patientservice.controller;

import com.karthick.hospitalmanagement.patientservice.DoctorBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    private DoctorBean doctorBean;

    @GetMapping("/patient")
    public String getPatient() {
        System.out.println(doctorBean.getDoctorDetails(1).getName());
        return "patient";
    }
}
