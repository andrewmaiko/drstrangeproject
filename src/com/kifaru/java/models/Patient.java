package com.kifaru.java.models;

import java.util.ArrayList;

/**
 * Created by Andrew M
 */
public class Patient {
    private int id;
    private int doctor_id;
    private int prescription_id;
    private String firstName;
    private String secondName;
    private String hospitalName;
    private String doctorName;
    ArrayList<Prescription> listOfPrescriptions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getPrescription_id() {
        return prescription_id;
    }

    public void setPrescription_id(int prescription_id) {
        this.prescription_id = prescription_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public ArrayList<Prescription> getListOfPrescriptions() {
        return listOfPrescriptions;
    }

    public void setListOfPrescriptions(ArrayList<Prescription> listOfPrescriptions) {
        this.listOfPrescriptions = listOfPrescriptions;
    }
}
