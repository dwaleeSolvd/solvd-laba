package com.solvd.dwaine.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student extends Person {


    //String emailAddress;
    private String studentID;
    private String classification;
    private String[] emptyCourses = new String[5];

    public School[] getAcceptedSchools() {
        return acceptedSchools;
    }

    public void setAcceptedSchools(School[] acceptedSchools) {
        this.acceptedSchools = acceptedSchools;
    }

    private School[] acceptedSchools;
    private School[] choosenSchool;

    private Administration regStudent;


    public Student(String firstName, String lastName, String classification, String studentID, String[] courses, String address) {
        super(firstName, lastName, address);
        this.classification = classification;
        this.studentID = studentID;
        emptyCourses = courses;
    }

    public Student(School[] acceptedSchools) {
        this.acceptedSchools = acceptedSchools;
    }

    String getStudentName() {
        String studentName = getFirstName() + " " + getLastName();
        return studentName;
    }

    //Show list of schools
    void displaySchools(School[] schools) {
        for (int i = 0; i < schools.length; i++) {
            //try (System.out.println(schools[i])) {
                try {
                    String a = null; //null value
                    System.out.println(a.charAt(0));
                } catch (NullPointerException e) {
                    System.out.println("NullPointerException..");
                }
            }
        }



    //Show schools that you have been accepted to
    School [] displaySchools(School[] schools, boolean accepted) {
        for (int i = 0; i < schools.length; i++) {
            if (schools[i].accepted && schools[i].enrollmentLimitReached == false) {
                try {


                    acceptedSchools = new School[schools.length];
                    acceptedSchools[i] = schools[i];
                } catch (NullPointerException e) {
                    System.out.println("Invalid school");
                    continue;
                }
                System.out.println(schools[i]);
            }
        }
        return acceptedSchools;
    }

    @Override
    double salaryExpectation() {
        return 0;
    }

    void chooseSchool(School[] cAcceptedSchools) {
        for (School cSchool : acceptedSchools) {
            System.out.println(acceptedSchools);
        }
        choosenSchool = new School[]{acceptedSchools[(int) Math.random() * acceptedSchools.length - 1]};
       System.out.println(this.getStudentName() + " will go to " + choosenSchool[0].toString());
    }

    void submitPaper(String fileName) throws FileNotFoundException {

        File file = new File("C:\\Users\\dwale\\OneDrive\\Documents\\" + fileName);


        try (FileReader fr = new FileReader(file)) {
            int content;
            try{
                while ((content = fr.read()) != -1) {
                    System.out.print((char) content);
                }
            } finally {
                fr.close();
            }

        } catch (IOException e) {
            System.out.println("File not found");
            //e.printStackTrace();
        }
    }

}
