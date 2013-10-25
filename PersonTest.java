import junit.framework.TestCase;
import org.junit.*;

class PersonTest extends TestCase{    
    
    public void testPerson() throws Exception{
        String firstName = "Aniekan"; String lastName = "Akai";
        Person testPerson = new Person(firstName,lastName);
        String expectedString = firstName+" "+lastName+"\nAddress: UNKNOWN\nAffiliated courses: None\n";
        
        //Correct
        Assert.assertEquals(expectedString, testPerson.toString());          
    }
    
    public void testSetLastName() throws Exception{
        String firstName = "Aniekan"; String lastName = "Akai";
        Person testPerson = new Person(firstName,lastName);        
    
        testPerson.setLastName("Edwards");
        
        //Correct
        Assert.assertEquals(firstName+" "+"Edwards", testPerson.getFullName());
        
    }
    
    public void testGetFirstName() throws Exception{
        String firstName = "Aniekan"; String lastName = "Akai";
        Person testPerson = new Person(firstName,lastName);        
        
        String actualFirstName = testPerson.getFirstName();
        
        //Correct
        Assert.assertEquals(firstName, actualFirstName);
        
    }
    
    public void testGetLastName() throws Exception{
        String firstName = "Aniekan"; String lastName = "Akai";
        Person testPerson = new Person(firstName,lastName);        
        
        String actualLastName = testPerson.getLastName();
        
        //Correct
        Assert.assertEquals(lastName, actualLastName);
        
    }
   
   public void testGetFullName() throws Exception {
        String firstName = "Aniekan"; String lastName = "Akai";
        Person testPerson = new Person(firstName,lastName);        
        
        String actualFullName = testPerson.getFullName();
        
        //Correct
        Assert.assertEquals(firstName+" "+lastName, actualFullName);
        
    }
   
   
   public void testSetAddress() throws Exception{
        String firstName = "Aniekan"; String lastName = "Akai";
        Person testPerson = new Person(firstName,lastName);        
        Address testAddress = new Address("1156 Colonel By Drive", "Ottawa", "K1S 5B6");
        
        testPerson.setAddress(testAddress);
        
        //Correct
        Assert.assertEquals(testAddress, testPerson.getAddress());
                
    }
  
   public void testGetAddress() throws Exception { 
        String firstName = "Aniekan"; String lastName = "Akai";
        Person testPerson = new Person(firstName,lastName);        
        Address testAddress = new Address("1156 Colonel By Drive", "Ottawa", "K1S 5B6");
        
        Address actualDefaultAddress = testPerson.getAddress();
        
        testPerson.setAddress(testAddress);
        Address actualSetAddress = testPerson.getAddress();
        Address expectedDefaultAddress = null;
        //Correct
        Assert.assertEquals(expectedDefaultAddress, actualDefaultAddress);
        
       //Correct
        Assert.assertEquals( testAddress, actualSetAddress);
        
   }

   public void testGetCourses() throws Exception { 
        String firstName = "Aniekan"; String lastName = "Akai";
        Person testPerson = new Person(firstName,lastName);   
        Course sysc1 = new Course("SYSC3010", "3rd year sysc project");
        Course sysc2 = new Course("SYSC4907", "4th year sysc project");        
        Course [] testDefaultCourses = testPerson.getCourses();
        testPerson.addCourse(sysc1);
        testPerson.addCourse(sysc2);
        Course[] expectedDefaultCourses = new Course[testDefaultCourses.length];
        //Correct
        Assert.assertEquals(expectedDefaultCourses, testDefaultCourses);

   
        //Correct
        Assert.assertEquals(sysc1, testPerson.getCourses()[0]);
        //Correct
        Assert.assertEquals(sysc2, testPerson.getCourses()[1]);
       
   }
   
   public void testAddCourse() throws Exception {
        String firstName = "Aniekan"; String lastName = "Akai";
        Person testPerson = new Person(firstName,lastName);        
        
        Course testCourse = new Course("SYSC 3010A", "Comp. Sys. Project");
        testPerson.addCourse(testCourse);
        Course [] testDefaultCourses = testPerson.getCourses();
        
        //Correct
        Assert.assertEquals(testCourse, testDefaultCourses[0]);

   }
   
   public void testRemove() throws Exception {
        
        String firstName = "Aniekan"; String lastName = "Akai";
        Person testPerson = new Person(firstName,lastName);        
        
        Course testCourse = new Course("SYSC 3010A", "Comp. Sys. Project");
        testPerson.addCourse(testCourse);
        testPerson.remove(testCourse);
        Course [] testDefaultCourses = testPerson.getCourses();
        Course[] expectedEmptyCourse = new Course[testDefaultCourses.length];
        //Correct
        Assert.assertEquals(expectedEmptyCourse, testDefaultCourses);

   };

    public void testToString() throws Exception { 

        String firstName = "Aniekan"; String lastName = "Akai";
        Person testPerson = new Person(firstName,lastName);        

        String actualPerson = testPerson.toString();
        String expectedString = firstName+" "+lastName+"\nAddress: UNKNOWN\nAffiliated courses: None\n";

        //Correct
        Assert.assertEquals(expectedString, actualPerson);
        
    }
    public void testEquals() throws Exception { 
        String firstName = "Aniekan"; String lastName = "Akai";
        Person testPerson1 = new Person(firstName,lastName);        
        Person testPerson2 = new Person(firstName,lastName);
        
        //Correct
        Assert.assertEquals(true, (testPerson1.toString().equals(testPerson1.toString())));
        //Correct
        Assert.assertEquals(true, (testPerson1.toString().equals(testPerson2.toString())));
            
    }
}