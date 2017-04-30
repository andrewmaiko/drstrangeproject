package com.kifaru.java.models;

import java.util.ArrayList;

/**
 * Created by Andrew M
 */
public class Doctor {
    private int id;
    private int hospital_id;
    private String firstName;
    private String secondName;
    private String hospitalName;
    private ArrayList<Patient> listOfPatients;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(int hospital_id) {
        this.hospital_id = hospital_id;
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

    public ArrayList<Patient> getListOfPatients() {
        return listOfPatients;
    }

    public void setListOfPatients(ArrayList<Patient> listOfPatients) {
        this.listOfPatients = listOfPatients;
    }




}
