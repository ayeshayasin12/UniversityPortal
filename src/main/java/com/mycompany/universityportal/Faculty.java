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
public class Faculty {
    Scanner sc= new Scanner(System.in);
   private String facultyID;
   private String facName;
   private String fatherName;
  private String CNIC;
  private String dateOfBirth;
  private String qualification;
  private String designation;
  private String department;
  private String joiningDate;
  private String employmentType;
  private String mobileNo;
  private String universityEmail;
  private String personalEmail;
  private String address;
  private String password;
  
  public void setFacultyID(String facultyID){
      this.facultyID= facultyID;
  }
  
  public String getFacultyID(){
      return facultyID;
  }
  
  public void setFacultyName(String name){
      this.facName=name;
  }
  
  public String getFacultyName(){
      return facName;
  }
  
  public void setfatherName(String fatherName){
      this.fatherName= fatherName;
  }
  
  public String getFatherName(){
      return fatherName;
  }
  
  public void setCNIC(String CNIC){
      this.CNIC= CNIC;
  }
  
  public String getCNIC(){
      return CNIC;
  }
  
  public void setDateOfBirth(String dateOfBirth){
      this.dateOfBirth= dateOfBirth;
  }
  public String getDateOfBirth(){
      return dateOfBirth;
  }
  
  public void setQualification(String qualification){
      this.qualification= qualification;
  }
  
  public String getQualification(){
      return qualification;
  }
  
  public void setDesignation(String designation){
      this.designation= designation;
  }
  
  public String getDesignation(){
      return designation;
  }
  
  public void setDepartment(String department){
      this.department= department;
  }
  
  public String getDepartment(){
      return department;
  }
  
  public void setJoiningDate(String joiningDate){
      this.joiningDate= joiningDate;
  }
  
  public String getJoiningDate(){
      return joiningDate;
  }
  
  public void setEmploymentType(String employmentType){
      this.employmentType= employmentType;
  }
   
  public String getEmploymentType(){
      return employmentType;
  }
  
  public void setMobileNo(String mobileNo){
      this.mobileNo= mobileNo;
  }
  
  public String getMobileNo(){
      return mobileNo;
  }
  
  public void setUniversityEmail(String universityEmail){
      this.universityEmail= universityEmail;
  }
  
  public String getUniversityEmail(){
      return universityEmail;
  }
  
  public void setPersonalemail(String personalEmail){
      this.personalEmail=personalEmail;
  }
  public String getPersonalEmail(){
      return personalEmail;
  }
  public void setAddress(String address){
      this.address= address;
  }
  public String getAddress(){
      return address;
  }
  public void setPassword(String password){
      this.password= password;
  }
  public String getPassword(){
      return password;
  }
  
  public void showFacultyDashboard(Faculty faculty){
      int facChoice;
      do{
      System.out.println("======Faculty Dashboard=====");
      System.out.println("1. View Profile");
      System.out.println("2. View Assigned Courses");
      System.out.println("3. View Enrolled students");
      System.out.println("4. Mark Attendance");
      System.out.println("5. View Attendance Record");
      System.out.println("6. Enter Marks");
      System.out.println("7. Update Marks");
      System.out.println("8. View Marks Sheet");
      System.out.println("9. Calculate Grades");
      System.out.println("10. Logout");
      
       facChoice= sc.nextInt();
      sc.nextLine();
      switch(facChoice){
          case 1:{
              viewProfile(faculty);
              break;
          }
          case 2:{
              viewAssignedCourses(faculty);
              break;
          }
          case 3:{
              viewEnrolledStudents(faculty);
              break;
          }
          case 4:{
              markAttendance(faculty);
              break;
          }
          case 5:{
              viewAttendanceRecord(faculty);
              break;
          }
          case 6:{
              enterMarks(faculty);
              break;
          }
          case 7:{
              updateMarks(faculty);
              break;
          }
          case 8:{
              viewMarksSheet(faculty);
              break;
          }
          case 9:{
              calculateGrades(faculty);
              break;
          }
          case 10:{
              logOut(faculty);
              break;
          }
          default:{
              System.out.println("Invalid Choice");
          }
          
      }
//      System.out.println("Press 1 to continue.Press 2 to exit");
//      int exitChoice= sc.nextInt();
//      sc.nextLine();
//      switch(exitChoice){
//          case 2:{
//              return;
//          }
//      }
//      
      }
      while(facChoice!=10);
      
  }
  
  public void viewProfile(Faculty faculty){
      System.out.println("Profile Information");
      System.out.println("ID: "+faculty.getFacultyID());
      System.out.println("Name: "+faculty.getFacultyName());
      System.out.println("Father Name: "+faculty.getFatherName());
      System.out.println("CNIC: "+faculty.getCNIC());
      System.out.println("Date Of Birth: "+faculty.getDateOfBirth());
      System.out.println("Qualification: "+faculty.getQualification());
      System.out.println("Designation: "+faculty.getDesignation());
      System.out.println("Department: "+faculty.getDepartment());
      System.out.println("Joining Date: "+faculty.getJoiningDate());
      System.out.println("Employment Type: "+faculty.getEmploymentType());
      System.out.println("Mobile No: "+faculty.getMobileNo());
      System.out.println("University Email: "+faculty.getUniversityEmail());
      System.out.println("Personal Email: "+faculty.getPersonalEmail());
      System.out.println("Address: "+faculty.getAddress());
      
  }
  
  public void viewAssignedCourses(Faculty faculty){
      
  }
  public void viewEnrolledStudents(Faculty faculty){
      
  }
  
  public void markAttendance(Faculty faculty){
      File AttendanceFile= new File("Attendance.txt");
      String enrollment="";
      LocalDate date=null;
      int stCount=0;
      String selectedID="";
      int count=0;
      String[] data= null;
      File file= new File("Course.txt");
      try{
          Scanner reader= new Scanner(file);
          while(reader.hasNextLine()){
            String line = reader.nextLine().trim();

    if(line.isEmpty()){
        continue;
    }

    data = line.split(",", -1);
    String facultyID= data[7];
    if(faculty.getFacultyID().equals(facultyID)){
        
        String offeringId= data[0];
        String courseName= data[2];
        if(count==0){
        System.out.println("OfferID-Course Name");
        }
        System.out.println(offeringId+"-"+courseName);
        
       
        count++;
    }
          }
      if(count==0){
            System.out.println("No courses offered.");
            return;
            
        }
      System.out.println("Enter offering ID: ");
       selectedID= sc.nextLine();
       System.out.println("Enter Date(yyyy-MM-dd): ");
       String input= sc.nextLine();
       date= LocalDate.parse(input);       
          
      }
      catch(Exception e){
          e.getMessage();
      }
      
      
          File registeredCourses= new File("RegisteredCourses.txt");
          try{
              Scanner reader= new Scanner(registeredCourses);
              while(reader.hasNextLine()){
                  String line= reader.nextLine();
                  if(line.isEmpty()){
                      continue;
                  }
                  data= line.split(",",-1);
                  String regOfferId= data[1];
                  if(selectedID.equals(regOfferId)){
                      enrollment= data[0];
                      if(stCount==0){
                      System.out.println("Enter Attendance: ");
                      }
                      System.out.print(enrollment+": ");
                      char status= sc.nextLine().charAt(0);
                      
                      stCount++;
                      try{
                      FileWriter writer= new FileWriter(AttendanceFile,true);
                      writer.write(enrollment+","+selectedID+","+date+","+status+"\n");
                      writer.close();
                      }
                      catch(Exception e){
                          e.getMessage();
                      }
                  }
              }
              reader.close();
          }
          catch(Exception e){
              e.getMessage();
          }
      
  }
  public void viewAttendanceRecord(Faculty faculty){
      
  }
  public void enterMarks(Faculty faculty){
      int courseCount=0;
      String[] data= null;
      String regCourseData[]= null;
      File marksFile= new File("Marks.txt");
      File courseFile= new File("Course.txt");
      
      try{
          Scanner reader= new Scanner(courseFile);
          while(reader.hasNextLine()){
              String line= reader.nextLine().trim();
              if(line.isEmpty()){
                  continue;
              }
              data= line.split(",",-1);
              String facultyID= data[7];
              if(faculty.getFacultyID().equals(facultyID)){
                  courseCount++;
                  String offeringID= data[0];
                  String courseName= data[2];
                  if(courseCount==0){
                     System.out.println("Offering ID-courseName");
                  }
                  System.out.println(offeringID+"-"+courseName);
                  
              }
                      
          }
          
          
          while(true){
          System.out.println("Enter Offering ID: ");
          String selOffId= sc.nextLine();
          File regCourseFile= new File("RegisteredCourses.txt");
          try{
              Scanner regCourseReader= new Scanner(regCourseFile);
              while(regCourseReader.hasNextLine()){
                  String line= regCourseReader.nextLine().trim();
                  regCourseData= line.split(",",-1);
                  String storedID= regCourseData[1];
                  if(selOffId.equals(storedID)){
                      System.out.println(regCourseData[0]);
                      System.out.print("Quiz1: ");
                      double quiz1= sc.nextDouble();
                      sc.nextLine();
                      System.out.print("Quiz2: ");
                      double quiz2= sc.nextDouble();
                      sc.nextLine();
                      System.out.print("Assignment1: ");
                      double assignment1= sc.nextDouble();
                      sc.nextLine();
                      System.out.print("Assignment2:");
                      double assignment2= sc.nextDouble();
                      sc.nextLine();
                      System.out.println("Midterm: ");
                      double midterm= sc.nextDouble();
                      sc.nextLine();
                      System.out.print("Final: ");
                      double Final= sc.nextDouble();
                      sc.nextLine();
                      
                     try{
                          FileWriter writer= new FileWriter(marksFile,true);
                          writer.write(regCourseData[0]+","+storedID+","+quiz1+","+quiz2+","+assignment1+","+assignment2+","+midterm+","+Final+"\n");
                          writer.close();
                      }
                      catch(Exception e){
                          e.getMessage();
                      }
                  }
              }
          }
          catch(Exception e){
              e.getMessage();
          }
          System.out.println("Do you want to enter marks for further courses or no?"
   + "Enter 1 if yes Enter 2 if no");
         int exitChoice= sc.nextInt();
         sc.nextLine();
         switch(exitChoice){
             case 2:{
                 return;
             }
             
         }
          }
      }
      catch(Exception e){
          e.getMessage();
      }
  }
  public void updateMarks(Faculty faculty){
      
  }
  
  public void viewMarksSheet(Faculty faculty){
      
  }
  
  public void calculateGrades(Faculty faculty){
      
  }
  
  public void logOut(Faculty faculty){
      return;
  }
  
public void validateFaculty(){
    while(true){
        String[] data=null;
        System.out.println("Enter ID: ");
        String id= sc.nextLine();
        
        System.out.println("Enter Password: ");
        String password= sc.nextLine();
        
        boolean found= false;
    
    try{
        Scanner reader= new Scanner(new File("Faculty.txt"));
        while(reader.hasNextLine()){
            String line= reader.nextLine().trim();
            if(line.isEmpty()){
                continue;
            }
             data= line.split(",",-1);
            
            String ID= data[0];
            String Password= data[14];
            
            if(id.equals(ID)&&password.equals(Password)){
                found= true;
                break;
            }
            
        }

        reader.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    if(found){
//        System.out.println("Login Successful");
          Faculty loggedInFaculty= new Faculty();
          loggedInFaculty.setFacultyID(data[0]);
          loggedInFaculty.setFacultyName(data[1]);
          loggedInFaculty.setfatherName(data[2]);
          loggedInFaculty.setCNIC(data[3]);
          loggedInFaculty.setDateOfBirth(data[4]);
          loggedInFaculty.setQualification(data[5]);
          loggedInFaculty.setDesignation(data[6]);
          loggedInFaculty.setDepartment(data[7]);
          loggedInFaculty.setJoiningDate(data[8]);
          loggedInFaculty.setEmploymentType(data[9]);
          loggedInFaculty.setMobileNo(data[10]);
          loggedInFaculty.setUniversityEmail(data[11]);
          loggedInFaculty.setPersonalemail(data[12]);
          loggedInFaculty.setAddress(data[13]);
          loggedInFaculty.setPassword(data[14]);
          
          showFacultyDashboard(loggedInFaculty);
        return;
    }
    else{
        System.out.println("Invalid credentials.Press 1 to try again.Press 2 to exit");
        int choice= sc.nextInt();
        sc.nextLine();
        
        if(choice==2){
            return;
        }
    }
    }
    
}
}