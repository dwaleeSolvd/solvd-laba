package com.solvd.dwaine.lab2;

import java.io.FileNotFoundException;

public class Administration {

//    private String[] listOfStudents;
//    private Student[] studentInfo;
//    private String[] listOfTutors;

    private Person[] profiles;
    private Department [] departments;
    private int MAX_PROFILES = 15;

    Administration() {

    }

    public Administration(Student[] studentInfo, Tutor[] tutors, Department [] departments) {
        this.profiles = new Person[MAX_PROFILES];
        addProfiles(studentInfo);
        addProfiles(tutors);
        this.departments = departments;


    }

    public Administration(String alert) {

        System.out.println(alert);


    }

    /**
     * @param profileType "student" | "professor" | "staff"
     * @return
     */
    int getProfileTypeCount(String profileType) {
        int count = 0;
        switch (profileType) {
            case "student" -> {
                for (Person profile : profiles) {
                    if (profile instanceof Student) {
                        count++;
                    }
                }
            }
            case "professor" -> {
                for (Person profile : profiles) {
                    if (profile instanceof Professor) {
                        count++;
                    }
                }
            }
            case "staff" -> {
                for (Person profile : profiles) {
                    if (profile instanceof Staff) {
                        count++;
                    }
                }
            }
        }


        return count;
    }

    int getProfilesCount() {
        int count;
        for (count = 0; count < profiles.length; count++) {
            if (profiles[count] == null) {
                break;
            }
        }
        return count;
    }

    public Person[] getProfilesByType(String profileType) {
        if (profileType == "all") {
            return profiles;
        }

        Person[] result = new Person[getProfileTypeCount(profileType)];
        int count = 0;

        for (Person profile : profiles) {
            switch (profileType) {
                case "student" -> {
                    if (profile instanceof Student) {
                        result[count++] = (Student) profile;
                    }
                }
                case "professor" -> {
                    if (profile instanceof Professor) {
                        result[count++] = (Professor) profile;
                    }
                }
                case "staff" -> {
                    if (profile instanceof Staff) {
                        result[count++] = (Staff) profile;
                    }
                }
                case "tutor" -> {
                    if (profile instanceof Tutor) {
                        result[count++] = (Tutor) profile;
                    }
                }
            }

        }
        return result;
    }


    public Person [] getStudentInfo() {
        //casting Person[] to Student[]
        return getProfilesByType("student");
    }
    public void submitPaper(Student student,String filename){
        try {
            System.out.println(student+filename);
            student.submitPaper(filename);
        }catch(FileNotFoundException e){
            System.out.println("File not found:" + filename);
        }
    }

    public boolean addProfiles(Person[] persons) {
        if (getProfilesCount() + persons.length >= MAX_PROFILES) {
            return false;
        }

        for (Person person : persons) {
            addProfile(person);
        }
        return true;
    }

    public boolean setStudentInfo(Student[] studentInfo) {
//        this.studentInfo = studentInfo;
        //the the students to profiles
        return addProfiles(studentInfo);
    }

    boolean isProfilesFull() {
        return getProfilesCount() >= MAX_PROFILES;
    }

    public boolean addProfile(Person person) {
        if (isProfilesFull()) {
            return false;//person cannot be added, no empty spot available
        }

        profiles[getProfilesCount()] = person;
        return true; //person added
    }


    public Tutor[] getListOfTutors() {
//        return listOfTutors;
        return (Tutor[]) getProfilesByType("tutor");
    }


    public boolean setListOfTutors(Person[] listOfTutors) {
//        this.listOfTutors = listOfTutors;
        return addProfiles(listOfTutors);
    }


    public Department[] getDepartments() {
        return departments;
    }

    //Add new student to array of students
    public boolean addStudent(Student student) {
//        profiles
//        Student newStudent = new Student(studentFirstName, studentLastName, "Freshmen", profiles.length, String[],);

//        return studentInfo;
        return addProfile(student);
    }


    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    /*boolean registerStudent(Student studentName) {
        if (studentName.courses == null) {
            System.out.println(studentName.getName() + " " + "is not registered for classes");
            return true;
        } else {
            System.out.println(studentName.getName() + " " + "is registered for classes");
            return false;
        }
    }*/
}