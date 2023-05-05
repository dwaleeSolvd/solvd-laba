package com.solvd.dwaine.lab2;

public class School {
    private String schoolNames;
    boolean enrollmentLimitReached;
    boolean accepted;

    School() {

    }

    public School(String schoolName, boolean enrollmentLimitReached, boolean accepted) {
        this.schoolNames = schoolName;
        this.enrollmentLimitReached = enrollmentLimitReached;
        this.accepted = accepted;
    }

    //Get school name of the student
    public String getSchoolName() {

        return this.schoolNames;
    }

   /* public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }*/

}