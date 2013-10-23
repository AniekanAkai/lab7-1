
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AddressTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AddressTest extends TestCase
{
    Address addr1;
    Address addr2;
    Address addr3;
    /**
     * Default constructor for test class AddressTest
     */
    public AddressTest()
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
            addr1 = new Address("1401 Prince of Wales","Ottawa","K2C3J8");
            addr2 = new Address("1401 Prince of Wales","Ottawa","K2C3J8");
            addr3 = new Address(507,"1401 Prince of Wales","Ottawa","K2C3J8");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void testToString_firstConstructor()
    {
        assertEquals("1401 Prince of Wales, Ottawa, K2C3J8",addr1.toString());
    }
    
    public void testToString_secondConstructor()
    {
        assertEquals("507, 1401 Prince of Wales, Ottawa, K2C3J8",addr3.toString());
    }
    
    public void testEquals_nullCase()
    {
        assertFalse(addr1.equals(null));
    }
    
    public void testEquals_true()
    {
        assertTrue(addr1.equals(addr2));
    }
    
    public void testEquals_falseCase()
    {
        assertFalse(addr1.equals(addr3));
    }
}
