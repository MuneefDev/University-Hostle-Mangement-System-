/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaassignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author muneefaltamimi
 */
public class User {
    private String name;
    private String id;
    private String email;
    private String phone;
    private String roomId;
    private String issueType;
    private String date;
    private String otherIssue;
    

    public User() {
        
    }

    public User(String name, String id, String email, String phone, String roomId, String issueType, String date, String otherIsseu) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.roomId = roomId;
        this.issueType = issueType;
        this.date = date;
        this.otherIssue = otherIsseu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOtherIssue() {
        return otherIssue;
    }

    public void setOtherIssue(String otherIssue) {
        this.otherIssue = otherIssue;
    }
    
    
    public void FileWriterRegistration() throws IOException {
       
   }
   
   public void FileWriterAppointment() {
       
   }
    @Override
    public String toString() {
        return "User{" + "name=" + name + ", id=" + id + ", email=" + email + ", phone=" + phone + ", roomId=" + roomId + ", issueType=" + issueType + ", date=" + date + ", otherIssue=" + otherIssue + '}';
    }
    
}
