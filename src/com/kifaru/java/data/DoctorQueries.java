package com.kifaru.java.data;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Andrew M.
 */
public class DoctorQueries {


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

    public RowSet retrieveAllDoctorsRowSet()throws SQLException,IOException{

            RowSetFactory rowSetFactory = RowSetProvider.newFactory();
            CachedRowSet cachedRowSet = rowSetFactory.createCachedRowSet();
            cachedRowSet.setCommand("select * from doctor");
            cachedRowSet.execute(DatabaseMgmt.getConnection());
            return cachedRowSet;

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
