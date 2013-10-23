import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NameTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NameTest extends TestCase
{
    Name name1;
    Name name2;
    Name name3;
    
    /**
     * Default constructor for test class NameTest
     */
    public NameTest()
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
        name1 = new Name("Yuan","Sun");
        name2 = new Name("Yuan","Sun");
        name3 = new Name("John","Doe");
    }

    @Test
    public void testToString()
    {
        assertEquals("Yuan Sun",name1.toString());
    }

    public void testEquals_trueCase()
    {
        assertTrue(name1.equals(name2));
    }
    
    public void testEquals_sameCase()
    {
        assertTrue(name1.equals(name1));
    }
    
    public void testEquals_falseCase()
    {
        assertFalse(name1.equals(name3));
    }
    
    public void testEquals_nullCase()
    {
        assertFalse(name2.equals(null));
    }
}
