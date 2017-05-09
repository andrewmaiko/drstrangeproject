package com.kifaru.java.data;

import com.kifaru.java.models.Prescription;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Andrew M
 */
public class InsertPrescription {

    private static final String insertPrescriptionSQL = "INSERT INTO prescription (type, name) VALUES(?, ?)";
    public void InsertDbPrescription(Prescription prescription) throws SQLException,IOException {

        try(Connection connection = DatabaseMgmt.getConnection();
            PreparedStatement statement = connection.prepareStatement(insertPrescriptionSQL)){
            statement.setString(1,prescription.getType());
            statement.setString(2,prescription.getName());
            System.out.println(prescription.getName());
            statement.executeUpdate();
        }

    }
}
