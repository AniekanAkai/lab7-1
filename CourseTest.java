
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CourseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CourseTest extends TestCase
{
    Course course1;
    Course course2;
    Course course3;
    Professor prof;
    Student stu1;
    /**
     * Default constructor for test class CourseTest
     */
    public CourseTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        stu1 = new Student("Yuan","Sun");
        prof = new Professor("James","Green");
        course1 = new Course("3010","SYSC");
        course2 = new Course("3010","SYSC");
        course3 = new Course("2001","SYSC");
    }
    
    public void testGetId()
    {
        assertEquals("3010",course1.getId());
    }
    
    public void testGetName()
    {
        assertEquals("SYSC",course1.getName());
    }
    
    public void testToString()
    {
        assertEquals("SYSC 3010",course1.toString());
    }
    
    public void testEquals_falseCase()
    {
        assertFalse(course3.equals(course1));
    }
    
    public void testEquals_nullCase()
    {
        assertFalse(course3.equals(null));
    }
    
    public void testEquals_trueCase()
    {
        assertTrue(course1.equals(course2));
    }
    
    public void testGetProfessor()
    {
        course3.setProfessor(prof);
        assertEquals(prof,course3.getProfessor());
    }
    
    public void testAddStudent()
    {
        course1.addStudent(stu1);
        assertEquals(stu1,course1.getStudents()[0]);
    }
    
    public void testRemoveStudent()
    {
        course1.removeStudent(stu1);
        assertEquals(null,course1.getStudents()[0]);
    }
}
