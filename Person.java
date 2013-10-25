import java.util.ArrayList;
public class Person
{
   private Name name;
   private Address address;
   private ArrayList<Course> courses;
   
   public Person(String first, String last) throws Exception {
       name = new Name(first, last);
       address = null;
       courses = new ArrayList<Course>();
   }
   
   public void setLastName(String name) {
       this.name =  new Name(this.name.toString().split(" ")[0],name);
   };
   public String getLastName() {return this.name.toString().split(" ")[1];}
   public String getFirstName() { return this.name.toString().split(" ")[0];}
   public String getFullName() { return this.name.toString(); }

   public void setAddress(Address address) {
       this.address = address;
   }
   public Address getAddress() { return address; };

   public Course[] getCourses() { 
       
       Course[] a = new Course[courses.size()]; 
       a = courses.toArray(a);
       return a;
   }
   
   public void addCourse(Course course) {
       courses.add(course);
   };
   
   public void remove(Course course) {
      if(courses.remove(course)){
          System.out.println(course.toString()+" has been removed");
      }else{
          System.out.println(course.toString()+" is not affiliated with "+ name.toString());
      }
   }

    public String toString() {
        String personString = name.toString();
        if(address == null){ personString+="\nAddress: UNKNOWN\n";}
        if(address != null){personString+="\nAddress: " + address.toString()+"\n";}
        if(courses.isEmpty()){personString+="Affiliated courses: None\n";}
        if(!courses.isEmpty()){personString+="Affiliated courses: " + courses.toString();}
        
        return personString;
    
    }
    
    public boolean equals(Person p) { 
        if((name.toString() == p.name.toString())&& (address.toString()== p.address.toString())){
            return true;
        }else{
            return false;
        }
    }

}     

