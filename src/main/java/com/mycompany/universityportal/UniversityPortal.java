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
public class UniversityPortal {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
//        boolean noExit =true;
        while(true){
        System.out.println("Select your domain");
        System.out.println("1. Student ");
        System.out.println("2. Faculty");
        System.out.println("3. Admin");
        int choice= sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:{
               System.out.println("1. Sign In");
                int stChoice= sc.nextInt();
                sc.nextLine();
                switch(stChoice){
                    case 1:{
                        Student s= new Student();
                        s.validateStudent();
                        break;
                        
                    }
                }
                break;
            }
            case 2:{
                System.out.println("1. Sign In");
                int facChoice= sc.nextInt();
                sc.nextLine();
                switch(facChoice){
                    case 1:{
                        Faculty f= new Faculty();
                        f.validateFaculty();
                        break;
                    }
                }
                break;
            }
            case 3:{
                Admin admin= new Admin();
                Boolean back= false;
                while(!back){
                System.out.println("1. Register Student");
                System.out.println("2. Update Student Information");
                System.out.println("3. Delete Student");
                System.out.println("4. View All Students");
                System.out.println("5. Search for a Student");
                System.out.println("6. Register Faculty member");
                System.out.println("7. Update Faculty Information");
                System.out.println("8. Delete Faculty Member");
                System.out.println("9. Search for a faculty member");
                System.out.println("10. View All faculty members");
                System.out.println("11. Add course");
                System.out.println("12. Update Course Details");
                System.out.println("13. Delete Course");
                System.out.println("14. View All courses");
                System.out.println("15. Search for a course");
                System.out.println("16. Back");
                int adminChoice= sc.nextInt();
                sc.nextLine();
                switch(adminChoice){
                    case 1:{
                        admin.registerStudent();
                        break;
                    }
                    case 6:{
                        admin.registerFacultyMember();
                        break;
                    }
                    case 11:{
                        admin.AddCourse();
                        break;
                    }
                    case 16:{
                        back=true;
                        break;
                    }
                    default:{
                       System.out.println("Invalid Choice");
                       break;
                    }
                    
                }
                
                }
                
            }
        }
        System.out.println("Press 1 to continue. Press 2 to exit");
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
