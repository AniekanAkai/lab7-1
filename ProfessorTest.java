import junit.framework.TestCase;
import org.junit.*;

class ProfessorTest extends TestCase{    
    
    public void testProfessor() throws Exception{
        String firstName = "Aniekan"; String lastName = "Akai";
        Professor testProf = new Professor(firstName,lastName);
        
        //Correct
        Assert.assertEquals(firstName+" "+lastName+" "+"UNKNOWN\n",testProf.toString());
          
        //Wrong 
        Assert.assertEquals(firstName+lastName, testProf.toString());

        //Wrong 
        Assert.assertEquals(firstName+lastName+"1000000", testProf.toString());

    }
 
    public void testGetOffice() throws Exception{
        String firstName = "Aniekan"; String lastName = "Akai";
        Professor testProf = new Professor(firstName,lastName);
        
        String actualDefaultOffice = testProf.getOffice();
        testProf.setOffice("Engineering");
        String actualSetOffice = testProf.getOffice();
        
        //Correct
        Assert.assertEquals("UNKNOWN", actualDefaultOffice);

        //Wrong
        Assert.assertEquals(null, actualDefaultOffice);        
        
        //Wrong
        Assert.assertEquals("Engineering", actualDefaultOffice);

        //Correct
        Assert.assertEquals("Engineering", actualSetOffice);

        //Wrong
        Assert.assertEquals("UNKNOWN", actualSetOffice);
        
        //Wrong
        Assert.assertEquals(null, actualSetOffice);

    }
    
    public void testSetOffice() throws Exception{
        String firstName = "Aniekan"; String lastName = "Akai";
        Professor testProf = new Professor(firstName,lastName);
        
        testProf.setOffice("Engieering");
        
        //Correct
        Assert.assertEquals("Engineering", testProf.getOffice());

        //Wrong
        Assert.assertEquals("Unknown", testProf.getOffice());
        
        //Correct
        Assert.assertEquals("Eng", testProf.getOffice());
    }
    
    public void testEquals() throws Exception{
        String firstName = "Aniekan"; String lastName = "Akai";
        Professor testProf = new Professor(firstName,lastName);
        Professor testProf1 = new Professor("Carl",lastName);
        
        
        Assert.assertEquals(false, testProf.equals(testProf1));
        Assert.assertEquals(true, testProf.equals(testProf));
    }   
}