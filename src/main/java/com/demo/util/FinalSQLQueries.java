package com.demo.util;

public final class FinalSQLQueries {
    //STUDENT Query
    public final static String Sql_AddStudent = "insert into student(first_Name,last_Name,stud_Id,contact_No,clg_Id,sem_Id,year,clg_Admissionyear,clg_Passingyear,city_State) values(?,?,?,?,?,?,?,?,?,?)";
    public final static String sql_RemoveStudent = "delete from student where stud_Id=?";
    public final static String sql_UpdateStudent = "update student set first_Name=?,last_Name=? where stud_Id=?";
    public final static String sql_GetStudent = "select * from Student where stud_Id=?";
    //MARKSHEET Query
    public final static String sql_AddMarksDetail = "insert into marksheet(stud_Id,m_Id,english,hindi,maths,sem_Id,year) values(?,?,?,?,?,?,?)";
    public final static String sql_GetmarkDetail = "select * from marksheet where stud_Id=?";
    public final static String sql_DeleteMarkById = "delete from marksheet where stud_Id=?";
    public final static String sql_UpdateMarksById = "update marksheet set english=?,hindi=?,maths=? where stud_Id=?";
    //COLLEGE Query
    public final static String sql_AddByClgId = "insert into college(clg_Id,clg_Address,college_Name,clg_ContactNo) values(?,?,?,?)";
    public final static String sql_DeleteByClgId = "delete from college where clg_Id=?";
    public final static String sql_GetCollegeByClgId = "select * from college where clg_Id=?";
    public final static String sql_GetAllCollege = "select * from college";
    public final static String sql_UpdateCollegeById = "update college set clg_ContactNo=? where clg_Id=?";
}
