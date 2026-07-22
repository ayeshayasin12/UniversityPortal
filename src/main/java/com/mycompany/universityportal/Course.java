/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityportal;

/**
 *
 * @author Al-Rehman COMputers
 */
public class Course {
    private String offeringCode;
    private String courseCode;
    private String courseName;
    private String creditHours;
    private String department;
    private String semester;
    private String section;
    private String facultyID;
    
    
    public void setOfferingCode(String offeringCode){
        this.offeringCode= offeringCode;
    }
    
    public String getOfferingCode(){
        return offeringCode;
    }
    public void setCourseCode(String courseCode){
        this.courseCode= courseCode;
    }
    public String getCourseCode(){
        return courseCode;
    }
    
    public void setCourseName(String courseName){
    
        this.courseName= courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCreditHours(String creditHours){
        this.creditHours= creditHours;
    }
    
    public String getCreditHours(){
        return creditHours;
    }
    
    public void setDepartment(String department){
        this.department= department;
    }
    
    public String getDepartment(){
        return department;
    }
    
    public void setSemester(String semester){
        this.semester= semester;
    }
    
    public String getSemester(){
        return semester;
    }
    
    public void setSection(String section){
        this.section= section;
    }
    
    public String getSection(){
        return section;
    }
    
    public void setFacultyID(String facultyID){
        this.facultyID= facultyID;
    }
    
    public String getFacultyID(){
        return facultyID;
    }
}
