
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PersonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonTest extends TestCase
{
    Person person1;
    Address addr;
    Course course;
    /**
     * Default constructor for test class PersonTest
     */
    public PersonTest()
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
        try {
            person1 = new Person("Yuan","Sun");
            addr = new Address(507,"1401 Prince of Wales","Ottawa","K2C3J8");
            course = new Course("3010","SYSC");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void testGetLastName()
    {
        assertEquals("Sun",person1.getLastName());
    }
    
    public void testGetFirstName()
    {
        assertEquals("Yuan",person1.getFirstName());
    }
    
    public void testGetFullName()
    {
        assertEquals("Yuan Sun",person1.getFullName());
    }
    
    public void testGetAddress()
    {
        person1.setAddress(addr);
        assertEquals(addr,person1.getAddress());
    }
    
    public void testGetCourse_validCase()
    {
        person1.addCourse(course);
        assertEquals(course,person1.getCourses()[0]);
    }
    
    public void testGetCourse_invalidCase()
    {
        person1.remove(course);
        assertEquals(null,person1.getCourses()[0]);
    }
}
