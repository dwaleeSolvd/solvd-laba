package com.solvd.dwaine.lab2;

import java.util.ArrayList;

public class Staff extends Person {
    private String title;
    private String department;

    private ArrayList<Integer> age = new ArrayList<Integer>();

    public Staff(String firstName, String lastName, String title, String address, String department) {
        super(firstName, lastName, address);
        this.title = title;
        this.department = department;
    }
    Staff(String firstName, String lastName, String address) {
        super(firstName, lastName, address);
    }

    public Staff(String department, String title) {
        this.department = department;
        this.title = title;
    }

    @Override
    protected double salaryExpectation() {
        return 60000;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    @Override
    public String toString(){
        String s = String.format("%15s%15s%15s%15d%20s%20s\n" ,firstName,lastName,title,department,address);

        return s;
    }
}
