package com.kifaru.java.view.Frames;

import com.kifaru.java.controllers.DoctorController;

import javax.swing.*;
import javax.swing.table.TableModel;

/**
 * Created by Andrew M.
 */
public class DoctorTableFrame extends JFrame {
    private DoctorController doctorController = new DoctorController();

    public DoctorTableFrame(){
        TableModel doctorTableModel = doctorController.getAllDoctorsTableModel();
        JTable doctorTable = new JTable(doctorTableModel);
        add(new JScrollPane(doctorTable));
        pack();
    }
}
