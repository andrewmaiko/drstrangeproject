package com.kifaru.java.controllers;

import com.kifaru.java.data.DoctorQueries;
import com.kifaru.java.models.DoctorsTableModel;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Andrew
 */
public class DoctorController {

    private DoctorQueries doctorQueries = new DoctorQueries();


    public DoctorsTableModel getAllDoctorsTableModel() {

        try {

            return new DoctorsTableModel(doctorQueries.retrieveAllDoctorsRowSet());

        } catch (SQLException ex) {
            //Using Java 8 forEach lambda and executing print trace on each exception via Java 8 method reference notation
            ex.forEach(Throwable::printStackTrace);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return null;

    }

}
