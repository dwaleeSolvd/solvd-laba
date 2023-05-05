package com.solvd.dwaine.lab2;

public class Course {
    private String startDate;
    private String endDate;
    private String schedule;
    private int enrollmentLimit;
    private String department;
    private String courseName;

   /* public void displayCourses() {
        System.out.println(listOfCourses.toString());
    }*/

    public Course(String courseName, String department, String startDate, String endDate, int enrollmentLimit) {
        this.department = department;
        this.startDate = startDate;
        this.endDate = endDate;
        this.enrollmentLimit = enrollmentLimit;
        this.courseName = courseName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {

        this.startDate = startDate;
    }

    public String getEndDate() {

        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int isEnrollmentLimit() {
        return enrollmentLimit;
    }

    public void setEnrollmentLimit(int enrollmentLimit) {
        this.enrollmentLimit = enrollmentLimit;
    }


    @Override
    public String toString(){
        String s = String.format("%15s%15s%15s%15d%20s%20s\n",startDate,endDate,schedule,enrollmentLimit,department,courseName);
       return s;

    }
    public static String header(){
        return "Start Date          End Date         Schedule         Enrollment Limit         Department        Course Name\n";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
