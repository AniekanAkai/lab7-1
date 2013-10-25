import junit.framework.*;



public class AddressTest extends TestCase {
	
	public void testAddress() throws Exception {
		String street = "123 fake st", city = "Springfield", postalCode ="j2j4j5";
		int unit = 1;
		
		Address x = new Address(street,city,postalCode);
		String expected = street + ", " + city + ". " + postalCode;
		String actual = x.toString();
		Assert.assertEquals(expected, actual);
		
		Address y = new Address(unit,street,city,postalCode);
		actual = y.toString();
		expected = Integer.toString(unit)+ " " + street + ", " + city + ". " + postalCode;
		Assert.assertEquals(expected, actual);
	}
	
	public void testToString() throws Exception{
		
		Address x = new Address("1","2","3");
		String actual = x.toString();
		String expected = "1, 2. 3";
		Assert.assertEquals(expected, actual);
		
		Address y = new Address(2,"5 fake st","City","1q1q1q");
		actual = y.toString();
		expected = "2 5 fake st, City. 1q1q1q";
		Assert.assertEquals(expected, actual);
		
	}
	
	public void testEquals() throws Exception {
		String street = "123 fake st", city = "Springfield", postalCode ="j2j4j5";
		int unit = 1;
		Address x = new Address(unit,street,city,postalCode);
		Address y = new Address(street,city,postalCode);
		Assert.assertFalse(x.equals(y));
		Assert.assertTrue(x.equals(x));
	}
	

}
