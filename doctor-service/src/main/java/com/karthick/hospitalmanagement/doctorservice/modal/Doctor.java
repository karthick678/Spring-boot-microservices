package com.karthick.hospitalmanagement.doctorservice.modal;

import javax.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int _id;
    private String name;

    public Doctor() {
    }

    public Doctor(int _id, String name) {
        this._id = _id;
        this.name = name;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
