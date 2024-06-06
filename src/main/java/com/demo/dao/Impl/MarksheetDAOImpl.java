package com.demo.dao.Impl;

import com.demo.dao.MarksheetDAO;
import com.demo.dto.MarksheetDto;
import com.demo.util.DbConn;
import com.demo.util.FinalSQLQueries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MarksheetDAOImpl implements MarksheetDAO {
    public void addStudentMarks(MarksheetDto marks) throws SQLException {
        Connection connection = null;
        try {
            DbConn connInstance = DbConn.getInstance();
            connection = connInstance.getConn();
            PreparedStatement ps = connection.prepareStatement(FinalSQLQueries.sql_AddMarksDetail);
            ps.setInt(1, marks.getStud_Id());
            ps.setInt(2, marks.getM_Id());
            ps.setInt(3, marks.getEnglish());
            ps.setInt(4, marks.getHindi());
            ps.setInt(5, marks.getMaths());
            ps.setInt(6, marks.getSem_Id());
            ps.setString(7, marks.getYear());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
    public MarksheetDto getMarksById(int stud_Id) throws SQLException{
        MarksheetDto myNewMark = null;
        Connection connection = null;
        try {
            DbConn connInstance = DbConn.getInstance();
            connection = connInstance.getConn();
            myNewMark = new MarksheetDto();
            PreparedStatement ps = connection.prepareStatement(FinalSQLQueries.sql_GetmarkDetail);
            ps.setInt(1, stud_Id);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                myNewMark.setStud_Id(resultSet.getInt("stud_Id"));
                myNewMark.setM_Id(resultSet.getInt("m_Id"));
                myNewMark.setEnglish(resultSet.getInt("english"));
                myNewMark.setHindi(resultSet.getInt("hindi"));
                myNewMark.setMaths(resultSet.getInt("maths"));
                myNewMark.setSem_Id(resultSet.getInt("sem_Id"));
                myNewMark.setYear(resultSet.getString("year"));

                System.out.println("Student ID:" + myNewMark.getStud_Id());
                System.out.println("Marksheet ID:" + myNewMark.getM_Id());
                System.out.println("English Marks:" + myNewMark.getEnglish());
                System.out.println("Hindi Marks:" + myNewMark.getHindi());
                System.out.println("Maths Marks:" + myNewMark.getMaths());
                System.out.println("Semester ID:" + myNewMark.getSem_Id());
                System.out.println("Studying Year:" + myNewMark.getYear());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return myNewMark;
    }
    public void deleteMarksById(int stud_Id) throws SQLException {
        Connection connection = null;
        try {
            DbConn connInstance = DbConn.getInstance();
            connection = connInstance.getConn();
            PreparedStatement ps = connection.prepareStatement(FinalSQLQueries.sql_DeleteMarkById);
            ps.setInt(1, stud_Id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
    public void updateMarksById(int stud_Id) throws SQLException {
        Connection connection = null;
        try {
            DbConn connInstance = DbConn.getInstance();
            connection = connInstance.getConn();
            PreparedStatement ps = connection.prepareStatement(FinalSQLQueries.sql_UpdateMarksById);
            ps.setInt(1, 86);
            ps.setInt(2, 90);
            ps.setInt(3, 75);
            ps.setInt(4, 7);
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
