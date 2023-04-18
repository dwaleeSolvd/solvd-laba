package com.solvd.dwaine.lab2;

public class Tutor {

    private String schedule;
    String firstName;
    String lastName;
    private String studentsAssigned;

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setStudentsAssigned(String studentsAssigned) {
        this.studentsAssigned = studentsAssigned;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getStudentsAssigned() {
        return studentsAssigned;
    }

    Tutor(String firstName, String lastName, String schedule){
        firstName = firstName;
        lastName = lastName;
        schedule = schedule;

    }
}
