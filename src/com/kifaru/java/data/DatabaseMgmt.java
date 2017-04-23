package com.kifaru.java.data;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by Andrew M.
 */
public class DatabaseMgmt {


    /**
     *  Method to get a Connection to database
     * Gets connection details from a file database.properties located in com/kifaru/res/package
     * Uses Mysql driver by default if a driver is not loaded from the config file
     *
     * @return a connection to the database
     */

    public static Connection getConnection() throws SQLException, IOException {

        Properties dbConfig = new Properties();
        //Get this class and use its class loader to get the properties file
        Class currentClass = new Object() {}.getClass().getEnclosingClass();

        //Use classloader to get properties file from given package location
        try (InputStream in = currentClass.getClassLoader().getResourceAsStream("com/kifaru/res/database.properties")) {
            dbConfig.load(in);
        }
        String databaseDriver = dbConfig.getProperty("jdbc_drivers");
        String databaseUrl = dbConfig.getProperty("jdbc.url");
        String dbUserName = dbConfig.getProperty("jdbc.username");
        String dbPassword = dbConfig.getProperty("jdbc.password");

        try {
            if (databaseDriver != null) {
                System.setProperty("jdbc.drivers", databaseDriver);
            } else {//Default set to mysql driver if not loaded from config file
                System.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return DriverManager.getConnection(databaseUrl, dbUserName, dbPassword);

    }
}
