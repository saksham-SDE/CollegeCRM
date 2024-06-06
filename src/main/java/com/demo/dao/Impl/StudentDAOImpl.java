package com.demo.dao.Impl;

import com.demo.dao.StudentDAO;
import com.demo.dto.StudentDto;
import com.demo.util.DbConn;
import com.demo.util.FinalSQLQueries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentDAOImpl implements StudentDAO {
public void addStudent(StudentDto student) throws SQLException {
    Connection connection = null;
    try {


        DbConn connInstance = DbConn.getInstance();
        connection = connInstance.getConn();
        PreparedStatement preparedStatement = connection.prepareStatement(FinalSQLQueries.Sql_AddStudent);
        preparedStatement.setString(1, student.getFirst_Name());
        preparedStatement.setString(2, student.getLast_Name());
        preparedStatement.setInt(3, student.getStud_Id());
        preparedStatement.setString(4, student.getContact_No());
        preparedStatement.setInt(5, student.getClg_Id());
        preparedStatement.setInt(6, student.getSem_Id());
        preparedStatement.setString(7, student.getYear());
        preparedStatement.setString(8, student.getClg_Admissionyear());
        preparedStatement.setString(9, student.getClg_Passingyear());
        preparedStatement.setString(10, student.getCity_State());
        preparedStatement.executeUpdate();

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (connection != null) {
            connection.close();
        }
    }
}
public void removeStudentById(int stud_Id) throws SQLException {
    Connection connection=null;
    try {

        DbConn connInstance = DbConn.getInstance();
        connection = connInstance.getConn();
        PreparedStatement ps = connection.prepareStatement(FinalSQLQueries.sql_RemoveStudent);
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
    public void updateById (int stud_Id ) throws SQLException{
        Connection connection = null;
        try {
            DbConn connInstance = DbConn.getInstance();
            connection = connInstance.getConn();
            PreparedStatement ps = connection.prepareStatement(FinalSQLQueries.sql_UpdateStudent);
            ps.setString(1, "Dinesh");
            ps.setString(2, "karthik");
            ps.setInt(3, stud_Id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    public void getStudentById(int stud_Id) throws SQLException {
        Connection connection = null;
        try {

            DbConn connInstance = DbConn.getInstance();
            connection = connInstance.getConn();
            PreparedStatement ps = connection.prepareStatement(FinalSQLQueries.sql_GetStudent);
            ps.setInt(1, stud_Id);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                StudentDto stud = new StudentDto();
                stud.setStud_Id(resultSet.getInt("stud_Id"));
                stud.setFirst_Name(resultSet.getString("first_Name"));
                stud.setLast_Name(resultSet.getString("last_Name"));
                stud.setContact_No(resultSet.getString("contact_No"));
                stud.setClg_Id(resultSet.getInt("clg_Id"));
                stud.setSem_Id(resultSet.getInt("sem_Id"));
                stud.setYear(resultSet.getString("year"));
                stud.setClg_Admissionyear(resultSet.getString("clg_Admissionyear"));
                stud.setClg_Passingyear(resultSet.getString("clg_Passingyear"));
                stud.setCity_State(resultSet.getString("city_State"));
                if (stud != null) {
                    System.out.println("Student ID:" + stud_Id);
                    System.out.println("First Name:" + stud.getFirst_Name());
                    System.out.println("Last Name:" + stud.getLast_Name());
                    System.out.println("Contact No:" + stud.getContact_No());
                    System.out.println("College Id:" + stud.getClg_Id());
                    System.out.println("Sem Id:" + stud.getSem_Id());
                    System.out.println(" Current Year:" + stud.getYear());
                    System.out.println("College Admission Year:" + stud.getClg_Admissionyear());
                    System.out.println("College Passing Year:" + stud.getClg_Passingyear());
                    System.out.println("City_State:" + stud.getCity_State());
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

}
