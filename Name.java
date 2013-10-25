public class Name
{
   private String first, last;
   
   public Name(String first, String last) {
       this.first = first;
       this.last = last;
   }
   
   public String toString() { 
       
       return first + " " + last;
   }
   
   public boolean equals(Name n) { 
       if((first + " " + last).equals(n.toString())){
           return true;
       }else{
           return false;
       }
   }
}
