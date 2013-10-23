
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest extends TestCase
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
    {
    }

    @Test
    public void testGetNumber()
    {
        Student stu1 = new Student("Yuan","Sun");
        assertEquals(1,stu1.getNumber());
    }
}

