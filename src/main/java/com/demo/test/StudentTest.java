package com.demo.test;

import com.demo.dao.Impl.StudentDAOImpl;
import com.demo.dto.StudentDto;

import java.sql.SQLException;

public class StudentTest {
    public void addStud(){

        try {
            StudentDAOImpl obj = new StudentDAOImpl();
            StudentDto student = new StudentDto();
            student.setFirst_Name("Shikhar");
            student.setLast_Name("Dhawan");
            student.setStud_Id(6);
            student.setContact_No("84508");
            student.setCity_State("Sydney");
            student.setClg_Id(27);
            student.setSem_Id(85);
            student.setYear("Fourth");
            student.setClg_Admissionyear("2007");
            student.setClg_Passingyear("2014");
            student.setCity_State("Sydney");
            obj.addStudent(student);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void removeStud(){
        StudentDAOImpl obj=new StudentDAOImpl();
        try {
            obj.removeStudentById(2);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void updateStud(){
        StudentDAOImpl obj=new StudentDAOImpl();
        try{
            obj.updateById(3);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void getStud(){
        StudentDAOImpl obj=new StudentDAOImpl();
        try {
            obj.getStudentById(2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        StudentTest stud=new StudentTest();
        stud.addStud();
        stud.removeStud();
        stud.updateStud();
        stud.getStud();
    }
}
