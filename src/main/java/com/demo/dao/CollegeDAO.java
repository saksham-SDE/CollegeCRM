package com.demo.dao;

import java.sql.SQLException;

public interface CollegeDAO {
    public void addByCollegeId( int clg_Id) throws SQLException;
    public void deleteByCollegeId(int clg_Id) throws SQLException;
    public void getCollegByCollegeId(int clg_Id) throws SQLException;
    public void getAllCollege() throws SQLException;
    public void updateCollegeById(int clg_Id) throws SQLException;

}
