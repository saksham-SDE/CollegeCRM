package com.demo.test;

import com.demo.dao.Impl.CollegeDAOImpl;

public class CollegeTest {
    public void addClg(){
        CollegeDAOImpl obj=new CollegeDAOImpl();
        try{
            obj.addByCollegeId(23);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void removeClg(){
        CollegeDAOImpl obj=new CollegeDAOImpl();
        try {
            obj.deleteByCollegeId(47);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getClg(){
        CollegeDAOImpl obj=new CollegeDAOImpl();
        try {
            obj.getCollegByCollegeId(18);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void updateClg(){
        CollegeDAOImpl obj=new CollegeDAOImpl();
        try {

            obj.updateCollegeById(18);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getAllClg(){
        CollegeDAOImpl obj=new CollegeDAOImpl();
        try {
            obj.getAllCollege();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        CollegeTest clg=new CollegeTest();
        clg.addClg();
        clg.removeClg();
        clg.getAllClg();
        clg.getClg();
        clg.updateClg();
    }
}
