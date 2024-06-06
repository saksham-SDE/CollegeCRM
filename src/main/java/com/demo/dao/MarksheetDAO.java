package com.demo.dao;

import com.demo.dto.MarksheetDto;

import java.sql.SQLException;

public interface MarksheetDAO {
    public void addStudentMarks(MarksheetDto marks) throws SQLException;
    public MarksheetDto getMarksById(int stud_Id) throws SQLException;
    public void deleteMarksById(int stud_Id) throws SQLException;
    public void updateMarksById(int stud_Id) throws SQLException;

}
