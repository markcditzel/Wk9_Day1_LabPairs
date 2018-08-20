package models;

import java.util.ArrayList;
import java.util.Collections;

public class Cohort {

    //IV:

    private String name;
    private ArrayList<Student> studentsInCohort;

    //Constructor:

    public Cohort(String name) {
        this.name = name;
        this.studentsInCohort = new ArrayList<Student>();
    }

    //Getter

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudentsInCohort() {
        return studentsInCohort;
    }

    //Methods:
    public void addStudentToStudentsArraylist(Student student){
        this.studentsInCohort.add(student);
    }

    public int countStudentsInStudentsArrayList(){
       return this.studentsInCohort.size();
    }

    public Student getRandomStudent(){
        Collections.shuffle(this.studentsInCohort);
        return this.studentsInCohort.get(0);
    }

    public ArrayList<Student> generateTwoNonIdenticalStudentsArrayList(){
        ArrayList<Student> pairedStudents = new ArrayList<Student>();
        Collections.shuffle(this.studentsInCohort);
        Student randomStudent1 = studentsInCohort.get(0);
        Student randomStudent2 = studentsInCohort.get(1);
        pairedStudents.add(randomStudent1);
        pairedStudents.add(randomStudent2);
        return pairedStudents;
    }

}
