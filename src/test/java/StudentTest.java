import models.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    Student student;

    @Test
    public void studentHasName(){
        student = new Student("Jim");
        assertEquals("Jim", student.getName());
    }


}
