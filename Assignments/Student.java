//********************************************************************
//  Student.java       Author: Lewis/Loftus/Cocking
//
//  Represents a college student.
//********************************************************************

public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   public Double test1, test2, test3;

   //-----------------------------------------------------------------
   //  Sets up this Student object with the specified initial values.
   //-----------------------------------------------------------------
   public Student (String first, String last, Address home)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = new Address(" 440 Aurora Av", "Naperville", "Illinois", 60540);
      test1 = 0.0;
      test2 = 0.0;
      test3 = 0.0;
   }
   
   /**
    * Sets the test score 
    * @param int of test number and int of test score
    */
   
   public void setTestScore (int test, double score)
   {
       if (test == 1)
       {
           test1 = score;
        }
       else if (test == 2)
       {
           test2 = score;
        }
       else if (test == 3)
       {
           test3 = score;
        }
        
       
    }
    
    /**
    * gets the test score 
    * @param int of test number
    * @return int of test score
    */
   
   public double getTestScore (int test)
   {
       if (test == 1)
          return test1;
       else if (test == 2)
          return test2;
       else if (test == 3)
          return test3;
       return 0;
    }
    
    
   /**
    * gets the test score 
    * @param int of test number
    * @return int of test score
    */
   
   public double average ()
   {
       double avg = (test1 + test2 + test3)/3;
       return avg;
    }
   
    
   /**
    * checks to see if two student objects have the same name
    * @param Student object
    * @return boolean value
    */
   
   public boolean equals (Student obj)
   {
       if (lastName.equals(obj.lastName))
       {
            if (firstName.equals(obj.firstName))
                return true;
            else 
                return false;
            }
       else
        return false;
    }
    
   //-----------------------------------------------------------------
   //  Returns this Student object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress;
      
      result+= "test score 1: " + test1 + "\n";
      result += "test score 2: " + test2 + "\n";
      result += "test score 3: " + test3 + "\n";
      
      result += "average: " + ((test1 + test2 + test3)/3);

      return result;
   }
}
