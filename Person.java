import java.util.ArrayList;
public class Person
{
   private Name name;
   private Address address;
   private ArrayList<Course> courses;
   
   public Person( String first, String last) {
	   this.name = new Name(first,last);
   }
   
   public void setLastName( String name) {
	  String old = this.name.toString();
	  String[] x = old.split(" ");
	  this.name = new Name(x[0],name.toString());
   }
   public String getLastName() {
	   String old = this.name.toString();
	   String[] x = old.split(" ");
	   return x[1];
   
   }
   public String getFirstName() {
	   String old = this.name.toString();
	   String[] x = old.split(" ");
	   return x[0];
   }
   public String getFullName() { return this.name.toString(); }

   public void setAddress(Address address) throws Exception {
	   String old = address.toString();
	   String[] x = old.split(" ");
	   if (x.length <4) { this.address = new Address(x[0],x[1],x[2]); }
	   else { this.address =  new Address(Integer.parseInt(x[0]),x[1],x[2],x[3]);}
	   
   }
   public Address getAddress() { return this.address; };

   public Course[] getCourses() {
	   Course[] a = null;
	   return this.courses.toArray(a);
	   }
   public void addCourse( Course course ) {this.courses.add(course);}
   public void remove(Course course) {this.courses.remove(course);}

    public String toString() { return null; }
    public boolean equals(Object o) { return false; }

}     

