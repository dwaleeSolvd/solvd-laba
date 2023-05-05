package com.solvd.dwaine.lab2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    Administration administration;
    Scanner scanner;


    public Main(Administration administration, Scanner scanner) {
        this.administration = administration;
        this.scanner = scanner;
    }

    public void initializeData() {
        School indianaUniversity = new School("Indiana University", false, true);
        School ballState = new School("Indiana University", false, true);
        School harvard = new School("Harvard University", false, false);
        School notreDame = new School("Notre Dame University", false, false);
        School purdue = new School("Purdue University", false, true);
        School indianaState = new School("Indiana State University", true, true);

        School[] schoolChoices = new School[]{indianaUniversity, indianaState, ballState, harvard, notreDame, purdue};

        //Create Courses
        String[] listOfCompSciCourses = {"Java 100", "Java 200", "Java 300",
                "Python 100", "Python 200", "Python 300",
                "Java 100", "Java 200", "Java 300"};
        String[] listOfBusinessCourses = {"Marketing 101", "Marketing 201", "Marketing 300",
                "Accounting 100", "Accounting 200", "Accounting 300",
                "Econ 100", "Econ 200", "Econ 300"};
        String[] listOfComCourses = {"Creative Writing", "Java 200", "Java 300",
                "Python 100", "Python 200", "Python 300",
                "Java 100", "Java 200", "Java 300"};
        String[] listOfEnglishCourses = {"Java 100", "Java 200", "Java 300",
                "Python 100", "Python 200", "Python 300",
                "Java 100", "Java 200", "Java 300"};
        String[] listOfMathCourses = {"Math 100", "Math 200", "Math 300",
                "Finite 100", "Finite 200", "Finite 300",
                "Proofs 100", "Proofs 200", "Proofs 300"};

        //Create Student
        //Student dwaine = new Student("Dwaine", "Lee", "freshmen","100",dwaineCourses, "1532 long drive");






        //Show school choices
        //System.out.println(dwaine.getName());




        Staff staff = new Staff("Dwaine", "Lee", "1604 walpole Way");
        Staff staff1 = new Staff("Computer Science", "Professor");

        Professor professor1 = new Professor(staff1.getDepartment(), listOfCompSciCourses);
        System.out.println(professor1.toString());
    }


    public static Department []  makeDepartments() {
        //Create Instances of Courses
        Course [] compSciCourses = new Course[4];
        compSciCourses[0] = new Course("Java 101", "Computer Science","08/01/2023", "12/13/23", 10);
        compSciCourses[1] = new Course("Java 102", "Computer Science","08/01/2023", "12/13/23", 10);
        compSciCourses[2] = new Course("Java 103", "Computer Science","08/01/2023", "12/13/23", 10);
        compSciCourses[3] = new Course("Java 104", "Computer Science","08/01/2023", "12/13/23", 10);
        Course [] businessCourses = new Course[4];
        businessCourses [0] = new Course("Econ 101", "Business","08/01/23", "12/13/23", 15);
        businessCourses [1] = new Course("Econ 102", "Business","08/01/2023", "12/13/23",30 );
        businessCourses [2] = new Course("Stats 101", "Business","08/01/2023", "12/13/23", 35);
        businessCourses [3] = new Course("Stats 102", "Business","08/01/2023", "12/13/23", 45);
        Course [] communicationCourses = new Course[4];
        communicationCourses[0] = new Course("Comm 101","Communication", "08/01/2023", "12/13/23", 34);
        communicationCourses[1] = new Course("Comm 102","Communication", "08/01/2023", "12/13/23", 34);
        communicationCourses[2] = new Course("Comm 103","Communication", "08/01/2023", "12/13/23", 34);
        communicationCourses[3] = new Course("Comm 104","Communication", "08/01/2023", "12/13/23", 34);
        Course [] englishCourses = new Course[3];

        englishCourses[0] = new Course("English 101", "English","08/01/2023", "12/13/23", 24);
        englishCourses[1] = new Course("English 102", "English","08/01/2023", "12/13/23", 24);
        englishCourses[2] = new Course("English 103", "English","08/01/2023", "12/13/23", 24);
        Course [] mathCourses = new Course[3];

        mathCourses[0] = new Course("Math 101", "Math", "08/01/2023", "12/13/23", 14);
        mathCourses[1] = new Course("Math 102", "Math", "08/01/2023", "12/13/23", 14);
        mathCourses[2] = new Course("Math 103", "Math", "08/01/2023", "12/13/23", 14);

        Department [] departments = new Department[5];

        departments[0] = new Department("Computer Science",compSciCourses);
        departments[1] = new Department("Business",businessCourses);
        departments[2] = new Department("Communication",communicationCourses);
        departments[3] = new Department("Math",mathCourses);
        departments[4] = new Department("English",englishCourses);
        return departments;
    }

    public static ArrayList<Staff> makeStaff(){
        ArrayList<Staff> staffArrayList = new ArrayList<>();

        staffArrayList.add(new Staff("staff_f1", "staff_l1", "staff_c1", "staff_ad1", "English"));
        staffArrayList.add(new Staff("staff_f2", "staff_l2", "staff_c2", "staff_ad2", "Math"));
        staffArrayList.add(new Staff("staff_f3", "staff_l3", "staff_c3", "staff_ad3", "Financial Aid"));
        staffArrayList.add(new Staff("staff_f4", "staff_l4", "staff_c4", "staff_ad4", "Student Services"));

        return staffArrayList;
    }

    public static Student[] makeStudents() {
        Student[] result = new Student[4];
//        String firstName, String lastName, String classification, String studentID, String[] courses, String address
        String[][] students = new String[][]{
                {"student_f1", "student_l1", "student_c1", "student_ad1"},
                {"student_f2", "student_l2", "student_c2", "student_ad2"},
                {"student_f3", "student_l3", "student_c3", "student_ad3"},
                {"student_f4", "student_l4", "student_c4", "student_ad4"},

        };
        for (int i = 0; i < 4; i++) {
            result[i] = new Student(students[i][0], students[i][1], students[i][2], "", new String[]{}, students[i][3]);
        }
        return result;
    }

    public static Department [] makeDepartment(){
        Department [] result = new Department[4];
//        String firstName, String lastName, String classification, String studentID, String[] courses, String address
        String[][] students = new String[][]{
                {"student_f1", "student_l1", "student_c1", "student_ad1"},
                {"student_f2", "student_l2", "student_c2", "student_ad2"},
                {"student_f3", "student_l3", "student_c3", "student_ad3"},
                {"student_f4", "student_l4", "student_c4", "student_ad4"},

        };
        for (int i = 0; i < 4; i++) {
           // result[i] = new Student(students[i][0], students[i][1], students[i][2], "", new String[]{}, students[i][3]);
        }
        return result;
    }

    public static Tutor[] makeTutors() {
        Tutor[] result;
        //Create Tutors and schedules of Tutors
        String[] tutor1Schedule = {"1pm-2pm", "2pm-3pm", "6pm-7pm"};
        String[] tutor1Courses = {"Java Programming 100", "Java Programming 200", "Java Programming 300"};
        Tutor tutor1 = new Tutor("Sam James", tutor1Schedule, tutor1Courses);

        String[] tutor2Schedule = {"1pm-2pm", "2pm-3pm", "6pm-7pm"};
        String[] tutor2Courses = {"Python Programming 100", "Python Programming 200", "Python Programming 300"};
        Tutor tutor2 = new Tutor("Devin Lloyd", tutor2Schedule, tutor2Courses);

        String[] tutor3Schedule = {"1pm-2pm", "2pm-3pm", "6pm-7pm"};
        String[] tutor3Courses = {"C# Programming 100", "C# Programming 200", "C# Programming 300"};
        Tutor tutor3 = new Tutor("Sarah Beckett", tutor3Schedule, tutor3Courses);


        result = new Tutor[]{tutor1, tutor2, tutor3};
        return result;
    }

    void printMainMenuOptions() {
        String[] mainMenuOptions = new String[]{
                "1: Get list of profiles",
                "2: Get list of departments",
                "3: add course",
                "4: add new student",
                "5: add new tutor",
                "6: add professor",
                "7: add department",
                "8: add department course",
                "9: remove student",
                "10: remove tutor",
                "11: remove professor",
                "12: remove deparment",
                "13: exit",
                "14: get favourite quote of person",
                "15: Submit Paper"
        };

        for (String menuline : mainMenuOptions) {
            System.out.println(menuline);
        }
        System.out.println("What is your input: ");
    }

    void performAction(int choice) {
        switch (choice) {
            case 1 -> {
                //list profiles
                System.out.println("list profiles start ...");

                // check list polymorphism
                int index = 1;
                for (Person person : administration.getProfilesByType("all")) {
                    if(person != null) {
                        System.out.println(String.format("%s %s", index++, person));
                    }
                }

                System.out.println("list profiles end ...");


            }
            case 2 ->{
                for (Department department: administration.getDepartments()
                     ) {
                    System.out.println(department);
                }

            }
            case 14 -> {
                System.out.println("A favourite Quote... ");

                System.out.println(Person.getFavouriteQuote());

            }
            case 15 -> {
                System.out.println("Which of the following students should submit a paper?");

                Person [] students = administration.getStudentInfo();
                for(Person student: students){
                    Student s = (Student) student;
                    System.out.print(s.getStudentName()+", ");
                }
                System.out.println();
                String student;
                student = scanner.nextLine();
                String filename;
                filename = scanner.nextLine();
                boolean isMatch = false;
                for(Person s: students){
                    Student st = (Student) s;

                    if(st.getStudentName().equals(student)){
                        administration.submitPaper(st,filename);
                        isMatch = true;
                    }
                }
                if(!isMatch){
                    System.out.println("Student not found");
                }

            }
        }
    }

    void waitForAttention() {
        System.out.println("Press enter to continue...");
        scanner.nextLine();
    }

    void showMenuLoop() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMainMenuOptions();
            int choice = scanner.nextInt();

            if (choice == 13) {
                //end application
                break;
            }
            if (choice <= 0 || choice > 15) {//invalid input check
                System.out.println("Input invalid, try again....");
                continue;
            }


            //call correction function based on selection
            performAction(choice);
            waitForAttention();
        }
    }

    public static void main(String[] args) {
        //Create Schools
        Main main = new Main(new Administration(makeStudents(), makeTutors(), makeDepartments()), new Scanner(System.in));

        System.out.println("all good");
        String [] dwaineCourses  = {"Finite 100"};
        School indianaUniversity = new School("Indiana University", false, true);
        School ballState = new School("Indiana University", false, true);
        School harvard = new School("Harvard University", false, false);
        School notreDame = new School("Notre Dame University", false, false);
        School purdue = new School("Purdue University", false, true);
        School indianaState = new School("Indiana State University", true, true);

        School[] schoolChoices = {indianaUniversity, indianaState, ballState, harvard, notreDame, purdue};




        Student dwaine = new Student("Dwaine", "Lee", "freshmen","100",dwaineCourses, "1532 long drive");

        dwaine.displaySchools(schoolChoices);
        dwaine.displaySchools(schoolChoices,true);

        //System.out.println("Array created is :: "+ Arrays.toString(array));
        main.showMenuLoop();

    }


}