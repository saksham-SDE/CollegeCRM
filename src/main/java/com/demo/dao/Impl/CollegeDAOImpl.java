package com.demo.dao.Impl;

import com.demo.dao.CollegeDAO;
import com.demo.dto.CollegeDto;
import com.demo.util.DbConn;
import com.demo.util.FinalSQLQueries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CollegeDAOImpl implements CollegeDAO {
    public void addByCollegeId( int clg_Id) throws SQLException {
        Connection connection = null;
        try {
            DbConn connInstance = DbConn.getInstance();
            connection = connInstance.getConn();
            CollegeDto clgAdmin = new CollegeDto();
            clgAdmin.setClg_Id(clg_Id);
            clgAdmin.setClg_Adress("Indore");
            clgAdmin.setCollege_Name("IIT Indore");
            clgAdmin.setClg_ContactNo("8456");
            PreparedStatement ps = connection.prepareStatement(FinalSQLQueries.sql_AddByClgId);
            ps.setInt(1, clg_Id);
            ps.setString(2, clgAdmin.getClg_Adress());
            ps.setString(3, clgAdmin.getCollege_Name());
            ps.setString(4, clgAdmin.getClg_ContactNo());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
    public void deleteByCollegeId(int clg_Id) throws SQLException {
        Connection connection = null;
        try {
            DbConn connInstance = DbConn.getInstance();
            connection = connInstance.getConn();
            PreparedStatement ps = connection.prepareStatement(FinalSQLQueries.sql_DeleteByClgId);
            ps.setInt(1, clg_Id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
    public void getCollegByCollegeId(int clg_Id) throws SQLException {
        Connection connection = null;
        try {
            DbConn connInstance = DbConn.getInstance();
            connection = connInstance.getConn();
            PreparedStatement ps = connection.prepareStatement(FinalSQLQueries.sql_GetCollegeByClgId);
            ps.setInt(1, 47);
            ResultSet resultSet = ps.executeQuery();
            CollegeDto clg = new CollegeDto();
            while (resultSet.next()) {
                clg.setClg_Id(clg_Id);
                clg.setClg_Adress(resultSet.getString("clg_Address"));
                clg.setCollege_Name(resultSet.getString("college_Name"));
                clg.setClg_ContactNo(resultSet.getString("clg_ContactNo"));
                System.out.println("College ID:" + clg.getClg_Id());
                System.out.println("College Name:" + clg.getCollege_Name());
                System.out.println("College Address:" + clg.getClg_Adress());
                System.out.println("College Contact No:" + clg.getClg_ContactNo());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
    public void getAllCollege() throws SQLException {
        Connection connection = null;
        try {
            DbConn connInstance = DbConn.getInstance();
            connection = connInstance.getConn();
            PreparedStatement ps = connection.prepareStatement(FinalSQLQueries.sql_GetAllCollege);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                CollegeDto clg = new CollegeDto();
                clg.setClg_Id(resultSet.getInt("clg_Id"));
                clg.setClg_Adress(resultSet.getString("clg_Address"));
                clg.setCollege_Name(resultSet.getString("college_Name"));
                clg.setClg_ContactNo(resultSet.getString("clg_ContactNo"));
                System.out.println("College ID:" + clg.getClg_Id());
                System.out.println("College Name:" + clg.getCollege_Name());
                System.out.println("College Address:" + clg.getClg_Adress());
                System.out.println("College Contact No:" + clg.getClg_ContactNo());


            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
    public void updateCollegeById(int clg_Id) throws SQLException {
        Connection connection = null;
        try {
            DbConn connInstance = DbConn.getInstance();
            connection = connInstance.getConn();
            String sql_UpdateCollegeById = "update college set clg_ContactNo=? where clg_Id=?";
            PreparedStatement ps = connection.prepareStatement(sql_UpdateCollegeById);
            ps.setString(1, "2525");
            ps.setInt(2, clg_Id);
            ps.executeUpdate();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
}
