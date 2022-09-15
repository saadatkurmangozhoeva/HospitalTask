package com.company;

import java.util.ArrayList;

public class Patient extends User {

    private Doctor doctor;
    private String therapy;

    public Patient(int id, String name, String surname, Doctor doctor, String therapy) {
        super(id, name, surname);
        this.doctor = doctor;
        this.therapy = therapy;
    }

    public Patient(int id, String name, String surname) {
        super(id, name, surname);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getTherapy() {
        return therapy;
    }

    public void setTherapy(String therapy) {
        this.therapy = therapy;
    }

    public void print() {
        System.out.printf("Patient -> %s %s\nTherapy -> %s\nDoctor -> %s %s\n",
                this.name, this.surname, this.therapy, this.doctor.name, this.doctor.surname);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctor=" + doctor.getName() +
                ", therapy='" + therapy + '\'' +
                '}';
    }
}
