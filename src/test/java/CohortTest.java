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

}




//        Cohort cohortE23 = new Cohort("E23");
//        Student student1 = new Student("Bob1");
//        Student student2 = new Student("Bob2");
//        Student student3 = new Student("Bob3");
//        Student student4 = new Student("Bob4");
//        Student student5 = new Student("Bob5");
//        Student student6 = new Student("Bob6");
//        Student student7 = new Student("Bob7");
//        Student student8 = new Student("Bob8");
//        Student student9 = new Student("Bob9");
//        Student student10 = new Student("Bob10");
//        Student student11 = new Student("Bob11");
//        Student student12 = new Student("Bob12");
//        Student student13 = new Student("Bob13");
//        Student student14 = new Student("Bob14");
//        Student student15 = new Student("Bob15");
//        Student student16 = new Student("Bob16");
//        Student student17 = new Student("Bob17");
//        Student student18 = new Student("Bob18");
//        Student student19 = new Student("Bob19");
//        Student student20 = new Student("Bob20");


