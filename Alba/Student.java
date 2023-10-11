package com.myStudy.Inheri.exam03;

public class Student extends Person {
    private String school;
    public Student(String name, String school) {
        super(name);
        this.school = school;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
}