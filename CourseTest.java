import junit.framework.*;

public class CourseTest extends TestCase {
	
	public void testCourse()  {
		String id = "23", name = "test";
		Course x = new Course(id,name);
		String expected = id + " " + name;
		String actual = x.getId() + " " + x.getName();
		Assert.assertEquals(expected, actual);
		
	}
	
	public void testGetId() {
		String id = "23", name = "test";
		Course x = new Course(id,name);
		Assert.assertEquals(id, x.getId());
	}
	
	public void testGetName() {
		String id = "23", name = "test";
		Course x = new Course(id,name);
		Assert.assertEquals(name, x.getName());
	}
	
	public void testToString() {
		String id = "23", name = "test";
		Course x = new Course(id,name);
		String actual = x.toString();
		String expected = id + " " + name;
		Assert.assertEquals(expected, actual);
	}
	
	public void testEquals() {
		String id = "23", name = "test";
		Course x = new Course(id,name);
		Course y = new Course("24",name);
		Assert.assertFalse(x.equals(y));
		Assert.assertTrue(x.equals(x));
		
	}
	
	public void testProfessor() {
		String id = "23", name = "test";
		Professor professor = new Professor("some","one");
		Course x = new Course(id,name);
		x.setProfessor(professor);
		Assert.assertSame(professor, x.getProfessor());
		
	}
	
	public void testStudent() {
		String id = "23", name = "test";
		Student student = new Student("some","one");
		Course x = new Course(id,name);
		x.addStudent(student);
		Assert.assertSame(x.getStudents(),student);
		
		x.removeStudent(student);
		Assert.assertNull(x.getStudents());
	}
	

}
