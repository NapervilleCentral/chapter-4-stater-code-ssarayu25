/**
*   Name
*   Date
    Class name
    Description
******************************************************************* */

public class Rational
{
   private int numerator, denominator;

   /**----------------------------------------------------------------
   *  Sets up the rational number by ensuring a nonzero denominator
   *  and making only the numerator signed.
   *  ----------------------------------------------------------------
   */
   public Rational (int numer, int denom)
   {
      if (denom == 0)
         denom = 1;

      // Make the numerator "store" the sign
      if (denom < 0)
      {
         numer = numer * -1;
         denom = denom * -1;
      }

      numerator = numer;
      denominator = denom;

      reduce();
   }

   /**----------------------------------------------------------------
   *  Returns the numerator of this rational number.
   *  ----------------------------------------------------------------
   */
   public int getNumerator ()
   {
      return numerator;
   }

   /**----------------------------------------------------------------
   *  Returns the denominator of this rational number.
   *  ----------------------------------------------------------------
   */
   public int getDenominator ()
   {
      return denominator;
   }

   /**----------------------------------------------------------------
   *  Returns the reciprocal of this rational number.
   *  ----------------------------------------------------------------
   */
  
   public Rational reciprocal ()
   {
      return new Rational (denominator, numerator);
   }

   /**----------------------------------------------------------------
   *  Adds this rational number to the one passed as a parameter.
   *  A common denominator is found by multiplying the individual
   *  denominators.
   *  ----------------------------------------------------------------
   */
   public Rational add (Rational op2)
   {
       int num = (this.numerator * op2.denominator) + (op2.numerator * this.denominator);
       int den = (this.denominator * op2.denominator);
       Rational answer = new Rational(num,den);
       answer.reduce();
       return answer;
    }
       
   

   /**----------------------------------------------------------------
   *  Subtracts the rational number passed as a parameter from this
   *  rational number.
   *  ----------------------------------------------------------------
   */
   public Rational subtract (Rational op2)
   {
       int num = (this.numerator * op2.denominator) - (op2.numerator * this.denominator);
       int den = (this.denominator * op2.denominator);
       Rational answer = new Rational(num,den);
       answer.reduce();
       return answer;
   }

   /**----------------------------------------------------------------
   *  Multiplies this rational number by the one passed as a
   *  parameter.
   *  ----------------------------------------------------------------
   */
   public Rational multiply (Rational op2)
   {
        int num = this.numerator * op2.numerator;
        int den = this.denominator * op2.denominator;
        Rational answer = new Rational(num, den);
        answer.reduce();
        return answer;
   }

   /**----------------------------------------------------------------
   *  Divides this rational number by the one passed as a parameter
   *  by multiplying by the reciprocal of the second rational.
   *  ----------------------------------------------------------------
   */
   public Rational divide (Rational op2)
   {
       int num = this.numerator * op2.denominator;
       int den = this.denominator * op2.numerator;
       Rational answer = new Rational(num, den);
        answer.reduce();
        return answer;
   }

   /**----------------------------------------------------------------
   *  Determines if this rational number is equal to the one passed
   *  as a parameter.  Assumes they are both reduced.
   *  ----------------------------------------------------------------
   */
   public boolean equals (Rational op2)
   {
        this.reduce();
        op2.reduce();
        if (this.numerator == op2.numerator && this.denominator == op2.denominator)
            return true;
        return false;
   }

   /**----------------------------------------------------------------
   *  Returns this rational number as a string.
   *  ----------------------------------------------------------------
   */
   public String toString ()
   {
      String result = "";
      result += numerator + "/" + denominator;

      return result;
   }

   /**----------------------------------------------------------------
   *  Reduces this rational number by dividing both the numerator
   *  and the denominator by their greatest common divisor.
   *  ----------------------------------------------------------------
   */
   private void reduce ()
   {
      if (numerator != 0)
      {
         int common = gcd (Math.abs(numerator), denominator);

         numerator = numerator / common;
         denominator = denominator / common;
      }
   }

   /**----------------------------------------------------------------
   *  Computes and returns the greatest common divisor of the two
   *  positive parameters. Uses Euclid's algorithm.
   *  ----------------------------------------------------------------
   */
   private int gcd (int num1, int num2)
   {
      while (num1 != num2)
         if (num1 > num2)
            num1 = num1 - num2;
         else
            num2 = num2 - num1;

      return num1;
   }
}
