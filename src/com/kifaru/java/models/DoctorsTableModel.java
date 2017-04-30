package com.kifaru.java.models;

import javax.sql.RowSet;
import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;

/**
 * Created by Andrew M
 */
public class DoctorsTableModel extends AbstractTableModel {


    private final static int NUMBER_OF_COLUMNS = 3;

    private RowSet allDoctorsRowSet;


    public DoctorsTableModel(RowSet allDoctorsRowSet) {

        this.allDoctorsRowSet = allDoctorsRowSet;

    }

    @Override
    public int getRowCount() {

        try {
            allDoctorsRowSet.last();
            int rows = allDoctorsRowSet.getRow();
            allDoctorsRowSet.beforeFirst();
            return rows;

        } catch (SQLException ex) {
            //Using Java 8 forEach lambda and executing print trace on each exception via Java 8 method reference notation
            ex.forEach(Throwable::printStackTrace);
            return 0;
        }

    }

    @Override
    public int getColumnCount() {
        return NUMBER_OF_COLUMNS;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {

            //First Navigagte to row in rowset correspoinding to model table row representation
            allDoctorsRowSet.absolute(rowIndex + 1);

            //After getting to desired row in Row set retrieve column from row set corresponding to model table row representation
            return allDoctorsRowSet.getObject(columnIndex + 1);

        } catch (SQLException ex) {
            //Using Java 8 forEach lambda and executing print trace on each exception via Java 8 method reference notation
            ex.forEach(Throwable::printStackTrace);
            return null;

        }

    }

    public void setAllDoctorsRowSet(RowSet allDoctorsRowSet) {
        this.allDoctorsRowSet = allDoctorsRowSet;
    }


}
