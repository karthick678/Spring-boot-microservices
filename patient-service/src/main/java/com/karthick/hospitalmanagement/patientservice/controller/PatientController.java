package com.karthick.hospitalmanagement.patientservice.controller;

import com.karthick.hospitalmanagement.patientservice.DoctorBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    private DoctorBean doctorBean;

    Logger logger = LoggerFactory.getLogger(PatientController.class);

    @GetMapping("/patient")
    public String getPatient() {
        logger.info("patient info");
        logger.error("patient error");
         System.out.println(doctorBean.getDoctorDetails(1).getName());
        return "patient";
    }
}
