package com.demo.dto;

public class StudentDto {
private int stud_Id;
private String first_Name;
private String last_Name;
private String contact_No;
private int clg_Id;
private int sem_Id;
private String year;
private String clg_Admissionyear;
private String clg_Passingyear;
private String city_State;


    public int getStud_Id() {
        return stud_Id;
    }

    public void setStud_Id(int stud_Id) {
        this.stud_Id = stud_Id;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getContact_No() {
        return contact_No;
    }

    public void setContact_No(String contact_No) {
        this.contact_No = contact_No;
    }

    public int getClg_Id() {
        return clg_Id;
    }

    public void setClg_Id(int clg_Id) {
        this.clg_Id = clg_Id;
    }

    public int getSem_Id() {
        return sem_Id;
    }

    public void setSem_Id(int sem_Id) {
        this.sem_Id = sem_Id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getClg_Admissionyear() {
        return clg_Admissionyear;
    }

    public void setClg_Admissionyear(String clg_Admissionyear) {
        this.clg_Admissionyear = clg_Admissionyear;
    }

    public String getClg_Passingyear() {
        return clg_Passingyear;
    }

    public void setClg_Passingyear(String clg_Passingyear) {
        this.clg_Passingyear = clg_Passingyear;
    }

    public String getCity_State() {
        return city_State;
    }

    public void setCity_State(String city_State) {
        this.city_State = city_State;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "stud_Id=" + stud_Id +
                ", first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", contact_No='" + contact_No + '\'' +
                ", clg_Id=" + clg_Id +
                ", sem_Id=" + sem_Id +
                ", year='" + year + '\'' +
                ", clg_Admissionyear='" + clg_Admissionyear + '\'' +
                ", clg_Passingyear='" + clg_Passingyear + '\'' +
                ", city_State='" + city_State + '\'' +
                '}';
    }
}
