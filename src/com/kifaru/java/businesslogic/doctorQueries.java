package com.kifaru.java.businesslogic;

import com.kifaru.java.data.DatabaseMgmt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Andrew M.
 */
public class doctorQueries {


    public static void showAllDoctors() throws SQLException,IOException
    {
        //Using try-with-resources to ensure connection and statement get closed
        try(Connection connection = DatabaseMgmt.getConnection();
            Statement statement = connection.createStatement())
        {
            //try-with-resources to ensure Resultset gets closed
            try(ResultSet allDoctors = statement.executeQuery("select * from doctor"))
            {
                while(allDoctors.next()){
                    System.out.println(allDoctors.getString("first_name") + " " + allDoctors.getString("second_name"));
                }
            }

        }


    }

    public static void main (String args[]) throws IOException
    {

        try {
            showAllDoctors();
        }catch (SQLException ex){
            //Using Java 8 forEach lambda and executing print trace on each exception via Java 8 method reference notation
            ex.forEach(Throwable::printStackTrace);
        }
    }



}
