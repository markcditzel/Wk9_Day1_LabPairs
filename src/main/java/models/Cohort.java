package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cohort {

    //IV:

    private String name;
    private ArrayList<Student> studentsInCohort;

    //Constructor:

    public Cohort(String name) {
        this.name = name;
        this.studentsInCohort = new ArrayList<Student>();
        studentsInCohort.add(new Student("Mark1"));
        studentsInCohort.add(new Student("Mark2"));
        studentsInCohort.add(new Student("Mark3"));
        studentsInCohort.add(new Student("Mark4"));
        studentsInCohort.add(new Student("Mark5"));
        studentsInCohort.add(new Student("Mark6"));
        studentsInCohort.add(new Student("Mark7"));
        studentsInCohort.add(new Student("Mark8"));
        studentsInCohort.add(new Student("Mark9"));
        studentsInCohort.add(new Student("Mark10"));
        studentsInCohort.add(new Student("Mark11"));
        studentsInCohort.add(new Student("Mark12"));
        studentsInCohort.add(new Student("Mark13"));
        studentsInCohort.add(new Student("Mark14"));
        studentsInCohort.add(new Student("Mark15"));
        studentsInCohort.add(new Student("Mark16"));
        studentsInCohort.add(new Student("Mark17"));
        studentsInCohort.add(new Student("Mark18"));
        studentsInCohort.add(new Student("Mark19"));
        studentsInCohort.add(new Student("Mark20"));
    }

    // List<String> examples = List.of("one", "two", "three");

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
