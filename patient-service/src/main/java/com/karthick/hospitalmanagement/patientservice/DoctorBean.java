package com.karthick.hospitalmanagement.patientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("doctor-service")
public interface DoctorBean {
    @RequestMapping("/api/doctor")
    String doctor();

    @RequestMapping("/api/getDoctorDetails/{id}")
    Doctor getDoctorDetails(@PathVariable("id") int id);
}
