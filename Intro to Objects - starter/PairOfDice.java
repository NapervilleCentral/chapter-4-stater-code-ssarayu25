// student outline of Pair of Dice

public class PairOfDice
{
    //private data-- 2 die
   
   
   
   private int total;
   
   Die die1; //= new Die();
   Die die2; // = new Die();


    /**---------- Default Constructor
        Creates two six-sided Die objects, both with an initial
        face value of one.
    */
   
   public PairOfDice ()
   {
       die1 = new Die();
       die2 = new Die();
       
       
    }
   
    

    /**----------- roll()
        Rolls both dice and returns the combined result.
        @return int face value of each die
    */
   
   public int roll()
   {
       die1.roll();
       die2.roll();
       total = die1.getFaceValue()+ die2.getFaceValue(); 
       return total;
    }


    /**-------------- getTotal()
        Returns the current combined dice total.
        @return int total value of dice
    */
    public int getTotal()
    {
        return this.total;
    }



    /**---------------- getDie1()
        Returns the current value of the first die.
        @return int face value of die1
    */

   public int getDie1()
    {
        return this.die1.getFaceValue();
    }

    /**------------- getDie2()
        Returns the current value of the second die.
        @return int face value of die2
    */
   public int getDie2()
    {
        return this.die2.getFaceValue();
    }

    /**------------- toString()
            Returns the current data for each die
            hint: use methods in die to build the String to return
            @return
    */
   /**
        Returns the current die value and number of sides as a String.
        @return a string of current die value and number of sides as String
   */
   public String toString()
   {
      String data ="Die 1: " + die1.toString() + "\n Die 2: "+ die2.toString();

      return data;
   }



}
