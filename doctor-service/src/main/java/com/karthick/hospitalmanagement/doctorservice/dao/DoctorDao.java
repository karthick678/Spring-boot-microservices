package com.karthick.hospitalmanagement.doctorservice.dao;

import com.karthick.hospitalmanagement.doctorservice.modal.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorDao extends JpaRepository<Doctor, Integer> {
    Optional<Doctor> findBy_id(int id);
}
