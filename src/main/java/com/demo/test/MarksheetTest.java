package com.demo.test;

import com.demo.dao.Impl.MarksheetDAOImpl;
import com.demo.dto.MarksheetDto;

public class MarksheetTest {
    public void addMarksheet(){
        MarksheetDAOImpl obj=new MarksheetDAOImpl();
        try{
            MarksheetDto mark=new MarksheetDto();
            mark.setStud_Id(7);
            mark.setM_Id(30);
            mark.setEnglish(74);
            mark.setHindi(90);
            mark.setMaths(60);
            mark.setSem_Id(85);
            mark.setYear("Second");
            obj.addStudentMarks(mark);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void removeMarksheet(){
        MarksheetDAOImpl obj=new MarksheetDAOImpl();
        try {
            obj.deleteMarksById(2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void updateMarksheet(){
        MarksheetDAOImpl obj=new MarksheetDAOImpl();
        try{
            obj.updateMarksById(18);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getMarksheet(){
        MarksheetDAOImpl obj=new MarksheetDAOImpl();
        try {
            obj.getMarksById(23);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        MarksheetTest marksheet=new MarksheetTest();
        marksheet.addMarksheet();
        marksheet.removeMarksheet();
        marksheet.getMarksheet();
        marksheet.updateMarksheet();
    }
}
