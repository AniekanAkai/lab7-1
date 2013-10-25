import junit.framework.TestCase;
import org.junit.*;

class StudentTest extends TestCase{    

    public void  testStudent() throws Exception{
        String firstName = "Aniekan"; String lastName = "Akai";
        Student testStudent = new Student(firstName,lastName);
        
        //Correct
        Assert.assertEquals(firstName+" "+lastName+"\nStudent Number: "+ "1",testStudent.toString());
          
        //Wrong 
        Assert.assertEquals(firstName+lastName, testStudent.toString());

        //Wrong 
        Assert.assertEquals(firstName+lastName+"1000000", testStudent.toString());
    }
    
    public void testGetNumber() throws Exception{
        String firstName = "Aniekan"; String lastName = "Akai";

        Student testStudent = new Student(firstName,lastName);
        int testNumber = testStudent.getNumber();
        
        
        //Correct
        Assert.assertEquals(1, testNumber);
        
        //Wrong
        Assert.assertEquals(-1, testNumber);
    }
    
    public void testToString() throws Exception
    {
        String firstName = "Aniekan"; String lastName = "Akai";
        Student testStudent = new Student(firstName,lastName);
        
        String actualResult = testStudent.toString();
    
        //Correct
        Assert.assertEquals(firstName+" "+lastName+"\nStudent Number: "+ "1",actualResult);

        //Wrong
        Assert.assertEquals(firstName+" "+lastName+"Student Number: "+ "1", actualResult);
    }
    
    public void testEquals() throws Exception{
        String firstName = "Aniekan"; String lastName = "Akai";
        Student testStudent1 = new Student(firstName,lastName);
        Student testStudent2 = new Student(firstName,lastName);
        
        //Correct
        Assert.assertEquals(true, (testStudent1.equals(testStudent1)));
        
        //Correct
        Assert.assertEquals(false, (testStudent1.equals(testStudent2)));
   
        //Wrong
        Assert.assertEquals(false, (testStudent1.equals(testStudent1)));
        
        //Wrong
        Assert.assertEquals(true, (testStudent1.equals(testStudent2)));

    }
}