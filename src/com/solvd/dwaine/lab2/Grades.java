package com.solvd.dwaine.lab2;

public class Grades {
    private Student student;
    private String enrollmentID;
    private int gradeGPA;

    public Grades(Student student, String enrollmentID, int gradeGPA) {
        this.enrollmentID = enrollmentID;
        this.gradeGPA = gradeGPA;

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(String enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public int getGradeGPA() {
        return gradeGPA;
    }

    public void setGradeGPA(int gradeGPA) {
        this.gradeGPA = gradeGPA;
    }
}
