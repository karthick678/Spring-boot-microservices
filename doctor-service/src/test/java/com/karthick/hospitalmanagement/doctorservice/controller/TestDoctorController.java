package com.karthick.hospitalmanagement.doctorservice.controller;

import com.karthick.hospitalmanagement.doctorservice.service.DoctorService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestDoctorController {

    @Mock
    private DoctorService doctorService;

    @InjectMocks
    private DoctorController doctorController;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("before all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("before each");
    }

    @Test
    public void testDoctor() {
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }
}
