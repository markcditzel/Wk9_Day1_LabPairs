import models.Cohort;
import models.Student;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CohortTest {

    Cohort cohortE23;
    Student student1;
    Student student2;
    Student student3;
    Student student4;
    Student student5;
    Student student6;
    Student student7;
    Student student8;

    @Test
    public void doesCohortHaveName() {
        cohortE23 = new Cohort("E23");
        assertEquals("E23", cohortE23.getName());
    }

    @Test
    public void canAddStudentToStudentsArraylist() {
        student1 = new Student("Mark");
        cohortE23 = new Cohort("E23");
        cohortE23.addStudentToStudentsArraylist(student1);
        assertEquals(21, cohortE23.countStudentsInStudentsArrayList());
    }

    @Test
    public void canGetTwoDifferentStudents(){
        cohortE23 = new Cohort("E23");
        student1 = new Student("Mark");
        student2 = new Student("Jim");
        student3 = new Student("Tom");
        student4 = new Student("Tim");
        student5 = new Student("Tommy");
        student6 = new Student("Tommo");
        student7 = new Student("Tomas");
        student8 = new Student("Tomi");
        cohortE23.addStudentToStudentsArraylist(student1);
        cohortE23.addStudentToStudentsArraylist(student2);
        cohortE23.addStudentToStudentsArraylist(student3);
        ArrayList<Student> test = new ArrayList<Student>();
        test = cohortE23.generateTwoNonIdenticalStudentsArrayList();
        assertEquals(2, test.size());
    }

    @Test // TODO - !!!
    public void canGetTwoDifferentStudentsAndProvideNames(){
        cohortE23 = new Cohort("E23");
        student1 = new Student("Mark");
        student2 = new Student("Jim");
        student3 = new Student("Tom");
        student4 = new Student("Tim");
        student5 = new Student("Tommy");
        student6 = new Student("Tommo");
        student7 = new Student("Tomas");
        student8 = new Student("Tomi");
        cohortE23.addStudentToStudentsArraylist(student1);
        cohortE23.addStudentToStudentsArraylist(student2);
        cohortE23.addStudentToStudentsArraylist(student3);
        String result = cohortE23.generateTwoNonIdenticalStudentsArrayListAndReturnNames();


    }

}

