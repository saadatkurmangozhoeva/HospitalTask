package com.company;

public class Doctor extends User implements Purpose {


    public Doctor(int id, String name, String surname) {
        super(id, name, surname);
    }

    @Override
    public void doTherapy(Therapy rh, Patient patient) {
        patient.setTherapy(rh.name());
    }
}
