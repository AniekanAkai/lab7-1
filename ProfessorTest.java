
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProfessorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProfessorTest extends TestCase
{
    Professor prof1;
    /**
     * Default constructor for test class ProfessorTest
     */
    public ProfessorTest()
    {
    }
    
    @Before
    public void setUp()
    {
        prof1 = new Professor("Yuan","Sun");
    }

    public void testGetOffice_nullCase()
    {
        assertEquals(null,prof1.getOffice());
    }
    
    public void testGetOffice_validCase()
    {
        prof1.setOffice("MC 5050");
        assertEquals("MC 5050",prof1.getOffice());
    }
}
