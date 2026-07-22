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
public class Admin {
    Scanner sc= new Scanner(System.in);
    public void registerStudent(){
        File studentFile= new File("Student.txt");
        while(true){
      Student student= new Student();
      System.out.println("Name: ");
      String name= sc.nextLine();
      student.setName(name);
      
      
      System.out.println("FatherName: ");
      String fatherName= sc.nextLine();
      student.setFatherName(fatherName);
      
      System.out.println("Registration No: ");
      String registrationNo= sc.nextLine();
      student.setRegistrationNo(registrationNo);
      
      System.out.println("Enrollment: ");
      String enrollment= sc.nextLine();
      student.setEnrollment(enrollment);
      
      System.out.println("Program: ");
      String program= sc.nextLine();
      student.setProgram(program);
      
      System.out.println("Intake Semester");
      String intakeSemester= sc.nextLine();
      student.setIntakeSemester(intakeSemester);
      
      System.out.println("Mobile No: ");
      String MobileNo= sc.nextLine();
      student.setMobileNo(MobileNo);
      
      System.out.println("Personal Email");
      String personalEmail= sc.nextLine();
      student.setPersonalEmail(personalEmail);
      
      System.out.println("Address: ");
      String Address= sc.nextLine();
      student.setAddress(Address);
      
      System.out.println("Degree Duration: ");
      String degreeDuration= sc.nextLine();
      student.setDegreeDuration(degreeDuration);
      
      System.out.println("Maximum Semester");
      String MaxSemester= sc.nextLine();
      student.setMaxSemester(MaxSemester);
      
      System.out.println("Password: ");
      String password= sc.nextLine();
      student.setPassword(password);
      
      System.out.println("Current Semester: ");
      String currentSemester= sc.nextLine();
      student.setCurrentSemester(currentSemester);
      
      System.out.println("Department: ");
      String department= sc.nextLine();
      student.setDepartment(department);
      
      System.out.println("Section: ");
      String section= sc.nextLine();
      student.setSection(section);
      
       
        try{
        FileWriter studentWriter= new FileWriter("Student.txt",true);
        studentWriter.write(name+","+fatherName+","+registrationNo+","+enrollment+","
                +program+","+intakeSemester+","+MobileNo+","+personalEmail+","+
                Address+","+degreeDuration+","+MaxSemester+","+password+","+
                currentSemester+","+department+","+section+"\n");
        studentWriter.close();
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Press 1 to register another student.Press 2 to exit.");
        int exitChoice= sc.nextInt();
        sc.nextLine();
        switch(exitChoice){
            case 2:{
                return;
            }
            default:{
                System.out.println("Invalid Choice");
                break;
            }
        }
        } 
  }
    
    public void registerFacultyMember(){
        
        File file= new File("Faculty.txt");
        Faculty facMember= new Faculty();
        while(true){
        int count=0;
        try{
        Scanner reader= new Scanner(new File("Faculty.txt"));
        while(reader.hasNextLine()){
            reader.nextLine();
           count++; 
        }
        reader.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }        
        String facultyID= String.format("F%03d",count + 1);
        facMember.setFacultyID(facultyID);
        
        
        System.out.println("Name: ");
        String name= sc.nextLine();
        facMember.setFacultyName(name);
        
        System.out.println("Father Name: ");
        String fatherName= sc.nextLine();
        facMember.setfatherName(fatherName);
        
        System.out.println("CNIC: ");
        String CNIC= sc.nextLine();
        facMember.setCNIC(CNIC);
        
        System.out.println("Date of Birth: ");
        String dateOfBirth= sc.nextLine();
        facMember.setDateOfBirth(dateOfBirth);
        
        System.out.println("Highest Qualification: ");
        String qualification= sc.nextLine();
        facMember.setQualification(qualification);
        
        System.out.println("Designation: ");
        String designation= sc.nextLine();
        facMember.setDesignation(designation);
        
        System.out.println("Department: ");
        String department= sc.nextLine();
        facMember.setDepartment(department);
        
        System.out.println("Joining Date: ");
        String joiningDate= sc.nextLine();
        facMember.setJoiningDate(joiningDate);
        
        System.out.println("Employment Type: ");
        String employmentType= sc.nextLine();
        facMember.setEmploymentType(employmentType);
        
        System.out.println("Mobile No: ");
        String mobileNo= sc.nextLine();
        facMember.setMobileNo(mobileNo);
        
        System.out.println("University Email: ");
        String universityEmail= sc.nextLine();
        facMember.setUniversityEmail(universityEmail);
        
        System.out.println("Personal Email: ");
        String personalEmail= sc.nextLine();
        facMember.setPersonalemail(personalEmail);
        
        System.out.println("Address: ");
        String address= sc.nextLine();
        facMember.setAddress(address);
        
        System.out.println("Password: ");
        String password= sc.nextLine();
        facMember.setPassword(password);
        
        try{
          FileWriter writer= new FileWriter("Faculty.txt",true);
          writer.write(facultyID+","+name+","+fatherName+","+CNIC+","+
                  dateOfBirth+","+qualification+","+designation+","+department+","+
                  joiningDate+","+employmentType+","+mobileNo+","+universityEmail+","+
                  personalEmail+","+address+","+password+"\n");
        writer.close();
        }
        
        catch(Exception e){
            e.getMessage();
        }
        System.out.println("Press 1 to register another faculty member.Press 2 to exit");
        int exitChoice= sc.nextInt();
        switch(exitChoice){
            case 2:{
                return;
            }
            default:{
                System.out.println("Invalid Choice");
                break;
            }
        }
        }
        
    
    }
    public void AddCourse(){
        while(true){
        System.out.println("Offering Code: ");
        String offeringCode= sc.nextLine();
        System.out.println("Course Code: ");
        String courseCode= sc.nextLine();
        System.out.println("Course Name: ");
        String courseName= sc.nextLine();
        System.out.println("Credit Hours: ");
        String creditHours= sc.nextLine();
        System.out.println("Department: ");
        String department= sc.nextLine();
        System.out.println("Semester: ");
        String semester= sc.nextLine();
        System.out.println("Section: ");
        String section= sc.nextLine();
        System.out.println("Faculty ID: ");
        String facultyID= sc.nextLine();
        File file= new File("Course.txt");
        try{
            FileWriter writer= new FileWriter("Course.txt",true);
            writer.write(offeringCode+","+courseCode+","+courseName+","+creditHours+","+
                    department+","+semester+","+section+","+facultyID+"\n");
            writer.close();
        }
        catch(Exception e){
            e.getMessage();
        }
        System.out.println("Press 1 to register another course.Press 2 to exit");
        int exitChoice= sc.nextInt();
        sc.nextLine();
        switch(exitChoice){
            case 2:
            {
                return;
            }
            default:{
                System.out.println("Invalid Choice");
                break;
            }
            
        }
        }
    }
}
