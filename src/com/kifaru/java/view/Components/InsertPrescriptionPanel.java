package com.kifaru.java.view.Components;

import com.kifaru.java.controllers.PrescriptionController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Andrew M.
 */
public class InsertPrescriptionPanel extends JPanel {



    public InsertPrescriptionPanel(){
        super();
        initialize();
    }

   private void initialize(){

       JLabel  typeLabel;
       JLabel  nameLabel;
       final JTextField prescriptionName = new JTextField(20);
       final JTextField prescriptionType  = new JTextField(20);
       PrescriptionController prescriptionController = new PrescriptionController();
       typeLabel = new JLabel("Type: ", JLabel.RIGHT);
       nameLabel = new JLabel("Name: ", JLabel.CENTER);
       JButton enterButton = new JButton("Enter into Db");

       add(typeLabel);
       add(prescriptionType);
       add(nameLabel);
       add(prescriptionName);
       add(enterButton);
       enterButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if (prescriptionName.getText().isEmpty() || prescriptionType.getText().isEmpty()) {
                   return;
               }
               prescriptionController.InsertPrescriptionInDb(prescriptionType.getText(), prescriptionName.getText());
           }
       });

   }


}
