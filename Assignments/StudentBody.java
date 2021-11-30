//********************************************************************
//  StudentBody.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an aggregate class.
//********************************************************************

public class StudentBody 
{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {

      Address jHome = new Address ("21 Jump Street", "Lynchburg",
                                   "VA", 24551);
      Student john = new Student ("John", "Gomez", jHome);

      Address mHome = new Address ("123 Main Street", "Euclid", "OH",
                                   44132);
      Student marsha1 = new Student ("Marsha", "Jones", mHome);
      
      Student marsha2 = new Student ("Marsha", "Jones", mHome);
      
      john.setTestScore(1, 10);
      john.setTestScore (2, 5);
      System.out.println(john.getTestScore(2));
      System.out.println(john.average());
      
      System.out.println(marsha1.equals(marsha2));

      System.out.println (john);
      System.out.println ();
      System.out.println (marsha1);
      System.out.println();
      System.out.println (marsha2);
   }
}
