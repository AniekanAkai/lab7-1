import junit.framework.*;

public class CourseTest extends TestCase {
	
	public void testCourse() throws Exception{
		String id = "23", name = "test";
		Course x = new Course(id, name);
		String expected = id + " " + name + "\n" 
                        + "Professor: "+ x.getProfessor().toString();
		String actual = x.toString();
                
                Assert.assertEquals(expected, actual);	
	}
	
	public void testGetId() throws Exception {
		String id = "23", name = "test";
		Course x = new Course(id,name);
		
                Assert.assertEquals(id, x.getId());
	}
	
	public void testGetName() throws Exception {
		String id = "23", name = "test";
		Course x = new Course(id,name);
                
		Assert.assertEquals(name, x.getName());
	}
	
	public void testToString() throws Exception {
		String id = "23", name = "test";
		Course x = new Course(id,name);
		String actual = x.toString();
		String expected = id + " " + name + "\n" 
                        + "Professor: "+ x.getProfessor().toString()+"\n";
		Assert.assertEquals(expected, actual);
	}
	
	public void testEquals() throws Exception {
		String id = "23", name = "test";
		Course x = new Course(id,name);
		Course y = new Course("24",name);
		Assert.assertFalse(x.equals(y));
		Assert.assertTrue(x.equals(x));
		
	}
	
	public void testGetProfessor() throws Exception {
		String id = "23", name = "test";
		Course x = new Course(id,name);
                Professor actual = x.getProfessor();
                Professor expected = new Professor("John","Doe");
                Assert.assertEquals(expected,actual);
	}
        
        public void testSetProfessor() throws Exception{
                String id = "23", name = "test";
		Professor professor = new Professor("some","one");
		Course x = new Course(id,name);
		x.setProfessor(professor);
                
                Assert.assertEquals(professor, x.getProfessor());
        }
	
	public void testStudent() throws Exception {
		String id = "23", name = "test";
		Student student = new Student("some","one");
		Course x = new Course(id,name);
		x.addStudent(student);
		Assert.assertSame(x.getStudents(),student);
		
		x.removeStudent(student);
		Assert.assertNull(x.getStudents());
	}
	

}
