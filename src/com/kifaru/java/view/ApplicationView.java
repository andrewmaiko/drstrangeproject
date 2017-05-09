package com.kifaru.java.view;

import com.kifaru.java.view.Components.InsertPrescriptionPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Andrew M.
 */
public class ApplicationView implements ItemListener {

   private JPanel applicationCards;

    public void addComponentToPane(Container pane){

        applicationCards = new JPanel(new CardLayout());
        InsertPrescriptionPanel insertPrescriptionPanel = new InsertPrescriptionPanel();
        applicationCards.add(insertPrescriptionPanel,"Insert Prescription");
        pane.add(applicationCards, BorderLayout.CENTER);

        CardLayout c1 = (CardLayout)(applicationCards.getLayout());
        c1.show(applicationCards,"Insert Prescription");

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    public static void main (String args[]){

        JFrame frame = new JFrame("CardLayoutDemo");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        ApplicationView demo = new ApplicationView();
        demo.addComponentToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);

    }
}
