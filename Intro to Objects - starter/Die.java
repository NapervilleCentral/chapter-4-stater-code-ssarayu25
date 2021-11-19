//********************************************************************
//  Die.java
//********************************************************************

import java.util.Random;
public class Die
{
   public final int MIN_FACES = 4;


   private static Random generator = new Random();
   private int numFaces;   // number of sides on the die
   private int faceValue;  // current value showing on the die

   /**
     Defaults to a six-sided die. Initial face value is 1.
   */
   public Die ()
   {
      numFaces = 6;
      faceValue = 1;
   }

   /**
     constructor
     Explicitly sets the size of the die. Defaults to a size of
     six if the parameter is invalid < MIN_FACES.
     Initial face value is random.
     @parm int number of sides of the die
   */

   public Die(int sides)
   {
       if (sides >= MIN_FACES)
        numFaces = sides;
       else
        numFaces = 6;
       faceValue = generator.nextInt(numFaces) + 1;
       
    }
   
    /**
     * Copy constructor - copy info from another object
     * @param - die object
     */
    public Die (Die otherObj)
    {
        this.numFaces = otherObj.numFaces;
        this.faceValue = otherObj.faceValue;
    }    
    
    
   /**
        Rolls the die and returns the result.
        @return the int faceValue
   */
   public int roll ()
   {
      
      faceValue = generator.nextInt(numFaces) + 1; // you put the correct  code here
      
      return faceValue;
   }

   /**
        Returns the current die value.
        @return the int faceValue
   */
   public int getFaceValue ()
   {
       return faceValue;
   }


  /**
        Returns the current number of faces the die has.
        @return _________________
  */
  public int getNumFaces()
  {
      return numFaces;
  }

  /**
        Sets the number of faces of the Die
        @param _________________
  */
  public int setNumFaces(int sides)
  {
      if (sides >= MIN_FACES)
        numFaces = sides;
       else
        numFaces = 6;
       return numFaces;
    }
    
   /**
        Returns the current die value and number of sides as a String.
        @return a string of current die value and number of sides as String
   */
   public String toString()
   {
      String data ="Faces: " + numFaces + "\n Face Value: "+ faceValue;

      return data;
   }




}//end of calss Die
