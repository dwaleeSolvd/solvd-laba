package com.solvd.dwaine.lab2;

public class StudentPayment extends StudentLoan {
    private String paymentID;
    private String studentID;
    private int tuitionOwed = 20000;
    private int tuitionPayed = 0;


    public StudentPayment(String paymentID, String studentID, int tuitionOwed, int tuitionPayed) {
        this.paymentID = paymentID;
        this.studentID = studentID;
        this.tuitionOwed = tuitionOwed;
        this.tuitionPayed = tuitionPayed;
    }

    void useLoan(Student student) {
        System.out.println(student + " " + "used loan to pay tuition");
    }

    StudentPayment(String paymentID, int tuitionPayed) {
        this.paymentID = paymentID;
        this.tuitionPayed = tuitionPayed;
    }

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

    public int getTuitionOwed() {
        return tuitionOwed;
    }

    public void setTuitionOwed(int tuitionOwed) {
        this.tuitionOwed = tuitionOwed;
    }

    public int getTuitionPayed() {
        return tuitionPayed;
    }

    public void setTuitionPayed(int tuitionPayed) {
        this.tuitionPayed = tuitionPayed;
    }

    //UsePayTuition to get tuition owed to 0
    public int payTuition(int outOfPocket) {
        useLoan();
        int cashAmount = outOfPocket;
        tuitionPayed = outOfPocket + cashAmount;
        tuitionOwed = -tuitionPayed;

        return tuitionPayed;

    }

    @Override
    void useLoan() {
        int tuitionOwed = -studentLoanAmount;

    }

}