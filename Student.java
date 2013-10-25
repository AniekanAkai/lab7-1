
public class Student extends Person
{
   private static int nextFreeNumber = 0;
   private int number;

   public Student(String first, String last) throws Exception {
       super(first,last);
       number = 1;// Student.nextFreeNumber;
     //  Student.nextFreeNumber++;
   }

   public int getNumber() { return number; }

   public String toString(){
   
       return super.getFullName() + "\nStudent Number: " + Integer.toString(number);
   }
   
   public boolean equals(Student compare){
       if(this.getNumber() == compare.getNumber()){
           return true;
       }else{
           return false;
       }
   }
}

