/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaassignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.jfr.Period;

/**
 *
 * @author muneefaltamimi
 */
public class Student extends User {
    

    public Student() {
    }

    
    public Student(String name, String id, String email, String phone, String roomId, String issueType, String date, String otherIsseu) {
        super(name, id, email, phone, roomId, issueType, date, otherIsseu);
    }
    
    @Override
    public void FileWriterRegistration() throws IOException {
     
       try {
           
       BufferedWriter bw = new BufferedWriter(new FileWriter("Registration.txt",true));
       bw.write(getName()+"::"+getId()+"::"+getPhone()+"::"+getEmail()+"::"+getRoomId()+"\n");
       JOptionPane.showMessageDialog(null, "Registred Sucssfully!");
       bw.close();             
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error");
       }    
   }
   
    @Override
    public void FileWriterAppointment() {
       try {
           BufferedWriter bw = new BufferedWriter(new FileWriter("Appointment.txt",true));
           bw.write(getId()+"::"+getRoomId()+"::"+getIssueType()+"::"+getOtherIssue()+"::"+getDate());
           bw.close();
           
       } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, "Error");
       }       
   }
   
}
