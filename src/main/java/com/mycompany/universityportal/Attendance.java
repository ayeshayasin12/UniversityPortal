/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityportal;

/**
 *
 * @author Al-Rehman COMputers
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.sql.*;
public class Attendance {
    private String enrollment;
    private String offeringID;
    private LocalDate date;
    private char status;
    
    public void setEnrollment(String enrollment){
        this.enrollment= enrollment;
    }
    
    public String getEnrollment(){
        return enrollment;
    }
    
    public void setOfferingID(String offeringID){
        this.offeringID= offeringID;
    }
    
    public String getOfferingID(){
        return offeringID;
    }
    
    public void setDate(LocalDate date){
        this.date= date;
    }
    
    public LocalDate getDate(){
        return date;
    }
    
    public void setStatus(char status){
        this.status= status;
    }
    
    public char getStatus(){
        return status;
    }
    
   
}
