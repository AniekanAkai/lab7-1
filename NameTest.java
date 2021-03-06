import junit.framework.*;

public class NameTest extends TestCase {
	
	public void testName(){
		String first = "test", last = "code";
		Name x = new Name(first,last);
		String expected = first + " " + last;
		String actual = x.toString();
		Assert.assertEquals(expected, actual);
	}

	public void testEquals(){
		String first = "test", last = "code";
		Name x = new Name(first,last);
		Name y = new Name(first,"fail");
                Assert.assertEquals(true, x.equals(x));
                Assert.assertEquals(false, x.equals(y));
	}
}
