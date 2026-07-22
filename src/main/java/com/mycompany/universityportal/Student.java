
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityportal;

/**
 *
 * @author Al-Rehman COMputers
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
public class Student {
   Scanner sc= new Scanner(System.in); 
    
  private  String name;
  private  String fatherName;
  private  String registrationNo;
  private  String enrollment;
  private  String program;
  private  String intakeSemester;
  private  String MobileNo;
  private  String personalEmail;
  private  String Address;
  private  String degreeDuration;
  private  String MaxSemester;
  private String password;
  private String currentSemester;
  private String department;
  private String section;
  
  public void setName(String name){
      this.name=name;
  }
  public String getName(){
      return name;
  }
  public void setFatherName(String fatherName){
      this.fatherName= fatherName;
  }
  public String getFatherName(){
     return fatherName;
  }
  
  public void setRegistrationNo(String registrationNo){
      this.registrationNo= registrationNo;
  }
  public String getRegistrationNo(){
      return registrationNo;
  }
  public void setEnrollment(String enrollment){
      this.enrollment= enrollment;
  }
  
  public String getEnrollment(){
      return enrollment;
  }
  
  public void setProgram(String program){
      this.program=program;
  }
  public String getProgram(){
      return program;
  }
  
  public void setIntakeSemester(String intakeSemester){
      this.intakeSemester= intakeSemester;
  }
  
  public String getIntakeSemester(){
      return intakeSemester;
  }
  
  public void setMobileNo(String mobileNo){
      this.MobileNo= mobileNo;
  }
  public String getMobileNo(){
      return MobileNo;
  }
  
  public void setPersonalEmail(String email){
      this.personalEmail=email;
  }
  
  public String getPersonalEmail(){
      return personalEmail;
  }
  
  public void setAddress(String address){
      this.Address= address;
  }
  public String getAddress(){
      return Address;
  }
  public void setDegreeDuration(String degreeDuration){
      this.degreeDuration= degreeDuration;
  }
  public String getDegreeDuration(){
      return degreeDuration;
  } 
  
  public void setMaxSemester(String maxSemester){
      this.MaxSemester= maxSemester;
  }
  public String getMaxSemester(){
      return MaxSemester;
  }
  
  public void setPassword(String password){
      this.password= password;
  }
  public String getPassword(){
      return password;
  }
  public void setCurrentSemester(String semester){
      this.currentSemester=semester;
  }
  public String getCuurentSemester(){
      return currentSemester;
  }
  public void setDepartment(String department){
      this.department= department;
  }
  public String getDepartment(){
      return department;
  }
  public void setSection(String section){
      this.section=section;
  }
  public String getSection(){
      return section;
  }
  
  public void showStudentDashboard(Student student){
      int dbChoice=0;
      while(dbChoice!=6){
      System.out.println("======Student Dashboard======");
      System.out.println();
      System.out.println("Welcome"+ student.getName());
      System.out.println("1. View Profile");
      System.out.println("2. Register Courses");
      System.out.println("3. View Attendance");
      System.out.println("4. View Marks");
      System.out.println("5. View GPA");
      System.out.println("6. Logout");
      dbChoice= sc.nextInt();
      sc.nextLine();
      switch(dbChoice){
          case 1:{
              viewProfile(student);
              break;
          }
          case 2:{
              registerCourses(student);
              break;
          }
          case 3:{
              viewAttendance(student);
              break;
          }
          case 4:{
              viewMarks(student);
              break;
          }
          case 5:{
              viewGPA(student);
              break;
          }
          case 6:{
              Logout(student);
              break;
          }
          default:{
              System.out.println("Invalid Choice");
          }
      }
      }
  }
  
  public void viewProfile(Student student){
      System.out.println("==========Student Profile==========");
      System.out.println("Name: "+student.getName());
      System.out.println("Father Name: "+student.getFatherName());
      System.out.println("Registration No: "+student.getRegistrationNo());
      System.out.println("Enrollment: "+student.getEnrollment());
      System.out.println("Program: "+student.getProgram());
      System.out.println("Intake Semester: "+student.getIntakeSemester());
      System.out.println("Mobile No: "+student.getMobileNo());
      System.out.println("Personal Email: "+student.getPersonalEmail());
      System.out.println("Address: "+student.getAddress());
      System.out.println("Degree Duration: "+student.getDegreeDuration());
      System.out.println("Maximum Semester: "+student.getMaxSemester());
      System.out.println("Password: "+student.getPassword());
      System.out.println("Current Semester: "+student.getCuurentSemester());
      System.out.println("Department: "+student.getDepartment());
      System.out.println("Section: "+student.getSection());
  }
  
  public void registerCourses(Student student){
      int count=0;
      String[] data=null;
      File file= new File("Course.txt");
      try{
          Scanner reader= new Scanner(file);
          while(reader.hasNextLine()){
              String line= reader.nextLine().trim();
              if(line.isEmpty()){
                  continue;
              }
              
              data= line.split(",",-1);
              String department= data[4];
              String semester= data[5];
              String section= data[6];
              
              if(department.equals(student.department)&&
                      semester.equals(student.currentSemester)&&section.equals(student.section)){
                  count++;
                  String offeringID= data[0];
                  String courseCode= data[1];
                  String courseName= data[2];
                  String creditHours= data[3];
                  String facultyID= data[7];
                  System.out.println(offeringID+"\t"+courseCode+"\t"+courseName+
                          "\t"+creditHours+"\t"+department+"\t"+semester+"\t"+section+"\t"+facultyID);
              }
              
              
              
          }
          if(count==0){
                  System.out.println("Courses not available for registration");
                  
              }
          else{
          while(true){
          System.out.println("Enter Offering ID: ");
          String offerID= sc.nextLine();
          File regCourseFile= new File("RegisteredCourses.txt");
          try{
          FileWriter writer= new FileWriter(regCourseFile,true);
                 writer.write(student.enrollment+","+offerID+"\n");
                 writer.close();
                 System.out.println("Course Registered");
          }
          catch(Exception e){
              e.printStackTrace();
             
          }
          System.out.println("Do you want to register another course? Enter 1 to continue.Enter 2 to exit");
          int exitChoice= sc.nextInt();
          sc.nextLine();
          switch(exitChoice){
              case 2:{
                  return;
              }
          }
          }
          }
          
      }
      catch(Exception e){
          e.printStackTrace();
      }
  }
  
  public void viewAttendance(Student student){
      
  }
  
  public void viewMarks(Student student){
      
  }
  
  public void viewGPA(Student student){
      
  }
  
  public void Logout(Student student){
        return;                    
  }
 
  public void validateStudent(){
      String[] data=null;
      while(true){
          System.out.println("Enter enrollment: ");
          String rollNo= sc.nextLine();
          
          System.out.println("Enter password: ");
          String password= sc.nextLine();
          
          boolean found= false;
          
          try{
              Scanner reader= new Scanner(new File("Student.txt"));
//              while(reader.hasNextLine()){
//                  String line= reader.nextLine();
//                  data= line.split(",");
//                  String RollNo= data[3];
//                  String Password= data[11];
//                  
//                  if(rollNo.equals(RollNo)&&password.equals(Password)){
//                      found= true;
//                      break;
//                  }
//              }
while(reader.hasNextLine()){
    String line = reader.nextLine().trim();

    if(line.isEmpty()){
        continue;
    }

    data = line.split(",", -1);

    String RollNo = data[3];
    String Password = data[11];

    if(rollNo.equals(RollNo) && password.equals(Password)){
        found = true;
        break;
    }
}
              reader.close();
          }
          catch(Exception e){
              e.printStackTrace();
          }
          if(found){
              Student loggedInStudent = new Student();
              loggedInStudent.setName(data[0]);
              loggedInStudent.setFatherName(data[1]);
              loggedInStudent.setRegistrationNo(data[2]);
              loggedInStudent.setEnrollment(data[3]);
              loggedInStudent.setProgram(data[4]);
              loggedInStudent.setIntakeSemester(data[5]);
              loggedInStudent.setMobileNo(data[6]);
              loggedInStudent.setPersonalEmail(data[7]);
              loggedInStudent.setAddress(data[8]);
              loggedInStudent.setDegreeDuration(data[9]);
              loggedInStudent.setMaxSemester(data[10]);
              loggedInStudent.setPassword(data[11]);
              loggedInStudent.setCurrentSemester(data[12]);
              loggedInStudent.setDepartment(data[13]);
              loggedInStudent.setSection(data[14]);
              
              showStudentDashboard(loggedInStudent);
              
              return;
              
          }
          else{
              System.out.println("Invalid credentials.Press 1 to try again.Press 2 to exit");
             int stChoice= sc.nextInt();
             sc.nextLine();
             switch(stChoice){
                 case 2:{
                     return;
                 }
             }
          }
      }
      
      
      
  }
  
  
}

