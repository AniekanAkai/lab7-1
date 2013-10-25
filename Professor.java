
public class Professor extends Person
{
   private String office;

   public Professor(String firstName, String lastName) throws Exception {
       super(firstName,lastName);
       office  = "UNKNOWN";
   }
   public void setOffice(String office) {
       this.office = office;
   }
   public String getOffice() {return office;}
   
   public String toString(){
       return this.getFullName()+" "+office+"\n";
   }
   
   public boolean equals(Professor p){
       if(this.toString().equals(p.toString())){
           return true;
       }else{
           return false;
       }
   }
}

