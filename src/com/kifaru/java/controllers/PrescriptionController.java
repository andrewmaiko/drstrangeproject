package com.kifaru.java.controllers;

import com.kifaru.java.data.InsertPrescription;
import com.kifaru.java.models.Prescription;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Andrew M.
 */
public class PrescriptionController {


    public void InsertPrescriptionInDb(String type, String name){

        Prescription prescription = new Prescription();
        InsertPrescription insertPrescription = new InsertPrescription();
        prescription.setType(type);
        prescription.setName(name);

        try {
           insertPrescription.InsertDbPrescription(prescription);
        }catch (SQLException ex){
            //Using Java 8 forEach lambda and executing print trace on each exception via Java 8 method reference notation
            ex.forEach(Throwable::printStackTrace);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
