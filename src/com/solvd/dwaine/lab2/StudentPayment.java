package com.solvd.dwaine.lab2;

public class StudentPayment {

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    private String paymentID;
    private String studentID;

    StudentPayment(String paymentID, String studentID){
        paymentID = paymentID;
        studentID = studentID;

    }
}
