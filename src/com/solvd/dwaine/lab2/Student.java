package com.solvd.dwaine.lab2;

public class Student {

    String firstName;
    String lastName;
    String emailAddress;
    String studentID;
    String classification;
    private String studentAddress;
    private int tuitionOwed;

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public int getTuitionOwed() {
        return tuitionOwed;
    }

    public void setTuitionOwed(int tuitionOwed) {
        this.tuitionOwed = tuitionOwed;
    }

    Student(String firstName, String lastName, String classification){
        firstName = firstName;
        lastName = lastName;
        classification = classification;

    }
}
