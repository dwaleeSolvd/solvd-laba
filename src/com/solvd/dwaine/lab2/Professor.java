package com.solvd.dwaine.lab2;

public class Professor extends Person {
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    private String department;
    private String[] courses;


    public Professor(String department, String[] courses) {
        this.department = department;
        this.courses = courses;
    }

    @Override
    protected double salaryExpectation() {
        return 100000;
    }
}