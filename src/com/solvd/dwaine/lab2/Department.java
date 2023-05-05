package com.solvd.dwaine.lab2;

public class Department {

    String departmentName;
    private Professor [] professor;
    private Course [] courses;

    public Department(String departmentName, Course [] courses) {
        this.departmentName = departmentName;
        this.courses = courses;
    }

    Department(Professor [] professor, String departmentName, String[] courses) {

    }
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Professor [] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor [] professor) {
        this.professor = professor;
    }

    public Course[] getCourses() {
        return courses;
    }
    @Override
    public String toString(){
        String s = "\n"+departmentName+"\n"+"Professors" + "\n";

        try {

            for (Professor p : professor
            ) {
                 s+=p+"\n";
            }
        }catch (NullPointerException e){
            System.out.println("Invalid Professors");
        }
        s+= "\nCourses\n";
        s+= Course.header();
        try{
        for (Course c:courses
             ) {
            s+=c+"\n";
        }
        }catch (NullPointerException e){
            System.out.println("Invalid Professors");
        }
        s+="\n\n";
        return s;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
