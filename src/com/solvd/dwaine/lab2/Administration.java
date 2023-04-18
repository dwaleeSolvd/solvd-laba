package com.solvd.dwaine.lab2;

import java.util.Dictionary;

public class Administration {

    private Dictionary studentDormAssignments;
    String studentFirstName;
    String studentLastName;
    String studentID;

    public String getStudentBillID() {
        return studentBillID;
    }

    public void setStudentBillID(String studentBillID) {
        this.studentBillID = studentBillID;
    }

    private String studentBillID;

    public Dictionary getStudentDormAssignments() {
        return studentDormAssignments;
    }

    public void setStudentDormAssignments(Dictionary studentDormAssignments) {
        this.studentDormAssignments = studentDormAssignments;
    }

    Administration(String studentFirstName, String studentLastName, String studentID){
        studentFirstName = studentFirstName;
        studentLastName = studentLastName;
        studentID = studentID;

    }
}
