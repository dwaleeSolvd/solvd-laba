package com.solvd.dwaine.lab2;

public class Tutor extends Person {
    private String[] tutorCourses;

    private String[] schedule;

    /*public void startSession(String studentName, String tutorName, String courseName) {
        String session = "Tutor " + tutorName + " started a session start with " + studentName + " for " + courseName; //"for" + courseName);
        System.out.println(session);
    }*/


    Tutor(String name, String[] schedule, String[] tutorCourses) {
        this.schedule = schedule;
        this.tutorCourses = tutorCourses;
        firstName = name.split(" ")[0];
        lastName = name.split(" ")[1];
        setAddress("");
    }

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }

    public String[] getTutorCourses() {
        return tutorCourses;
    }

    public void setTutorCourses(String[] tutorCourses) {
        this.tutorCourses = tutorCourses;
    }

    @Override
    public String toString() {
        return super.toString() + " courses count: " + tutorCourses.length;
    }

    @Override
    protected double salaryExpectation() {
        return 5000;
    }

}