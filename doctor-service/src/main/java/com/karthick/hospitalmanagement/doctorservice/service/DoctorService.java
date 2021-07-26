package com.karthick.hospitalmanagement.doctorservice.service;

import com.karthick.hospitalmanagement.doctorservice.modal.Doctor;

import java.util.Optional;

public interface DoctorService {
    Optional<Doctor> getDoctorDetails (int id);
}
