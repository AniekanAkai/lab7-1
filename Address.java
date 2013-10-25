
public class Address
{
    private int unit;
    private String street;
    private String city;
    private String postalCode;

    public Address (String street, String city, String postalCode) throws Exception
    { 
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        unit = -1;
    }
    
    public Address (int unit, String street, String city, String postalCode) throws Exception
    {
        this.unit = unit;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

     public String toString() { 
         String addressString = "";
         if(unit == -1){
             addressString += street+", "+city+". "+postalCode;
         }else{
             addressString += Integer.toString(unit)+" "+street+", "+city+". "+postalCode;         
         }
         
         return addressString;
     }
     public boolean equals(Address a) { 
         return this.toString().equals(a.toString());
                 
     }
     
     private boolean isValidPostalCode( String postalCode ) { return false; }
 
} 
