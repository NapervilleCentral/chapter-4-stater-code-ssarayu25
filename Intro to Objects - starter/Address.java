//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************

public class Address
{
   private String streetAddress, city, state;
   private int zipCode;

   //-----------------------------------------------------------------
   //  Sets up this Address object with the specified data.
   //-----------------------------------------------------------------

   public Address(){}

   public Address (String street, String town, String st, int zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   }


   /**
    * setStreet - will change the streetAdress
    * @param String of new Adress
    */
   public void setStreet (String streetAdress)
   {
       this.streetAddress = streetAddress;
    }

        /**
     * Copy constructor - copy info from given adress
     * @param - Address object
     */
    public Address (Address obj)
    {
        this.streetAddress = obj.streetAddress;
        this.city = obj.city;
        state = obj.state;
        zipCode = obj.zipCode;
    }  
    
    /**
     * equals - will compare to other adress and return true if they are equal
     * @param Adress object
     * @return boolean value
     */
    
    public boolean equals(Address obj)
    {
        if (this.zipCode == obj.zipCode)
        {
            return (this.streetAddress.equals(obj.streetAddress)); //kills method so no need for else statement
        }
        return false;
    }
    
   //-----------------------------------------------------------------
   //  Returns this Address object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
}
