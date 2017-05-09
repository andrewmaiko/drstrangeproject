package com.kifaru.java.view;

import com.kifaru.java.view.Components.DoctorTableFrame;

import javax.swing.*;

/**
 * Created by Andrew M.
 */
public class DoctorTableView {

    public static void main (String args[]) {
        JFrame frame = new DoctorTableFrame();
        frame.setTitle("All Doctors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}
