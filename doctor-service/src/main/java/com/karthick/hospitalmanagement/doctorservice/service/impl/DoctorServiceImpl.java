package com.karthick.hospitalmanagement.doctorservice.service.impl;

import com.karthick.hospitalmanagement.doctorservice.dao.DoctorDao;
import com.karthick.hospitalmanagement.doctorservice.modal.Doctor;
import com.karthick.hospitalmanagement.doctorservice.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorDao doctorDao;

    @Override
    public Optional<Doctor> getDoctorDetails(int id) {
        return doctorDao.findBy_id(id);
    }
}
