/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Al-Rehman COMputers
 */
public class Student {
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
  
  public void setName(String name){
      this.name=name;
  }
  public String getName(){
      return name;
  }
  public void setFatherName(String fatherName){
      this.fatherName= fatherName;
  }
  public String getFatherName(String fatherName){
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
  public String getDegreeduration(){
      return degreeDuration;
  }   
}
