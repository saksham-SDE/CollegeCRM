package com.demo.dao;

import com.demo.dto.StudentDto;

import java.sql.SQLException;

public interface StudentDAO {
    public void addStudent(StudentDto student) throws SQLException;
    public void removeStudentById(int stud_Id) throws SQLException;
    public void updateById(int stud_Id) throws SQLException;
    public void getStudentById(int stud_Id) throws SQLException;
}
