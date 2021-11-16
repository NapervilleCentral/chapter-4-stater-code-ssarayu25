/********************************************************************
// These are the notes for ch 4 used in hayes class
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;

public class ch4notes7_08
{

    //static int sum = 987654;

    public static void main (String[] args)
    {
        int y = -99; //local variable: scope is only within main
        mathy solver = new mathy();
    
        System.out.println(solver.abs(-5));
        System.out.println(abs(-8)); //-8 is an argument
        System.out.println(abs(-77.45));
        
        System.out.println(abs(y)); //when you send basic/primitive data types, you are passing a value (x = a copy of y)
        System.out.println(y + "*");
        
        /**/
    }// end of main
    
    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
    */
   //public: this is the scope of the method (accessed/seen)
   //static - object or not (ch 5)
   //int - return type (use function/method as this type)
   //abs() - id of function
   //int x - parameters - info you need to execute function 
   
    public static int abs (int x) //paramaters are local variables
    {
        System.out.println(x + " ?");
        if (x < 0)
            x = -x;
            
        return x; //must be int due to int being return type in header
    
    }//end of abs
    
    /**
        take the absoulute value of the number
        @param double value
        @return absoulute value of number
    */
   // Overload     NO         yes, change the type or number of parameters to overload without redef error
    public static double abs(double x)
    {
        System.out.print("Double ");
        if (x < 0)
            x = -x;
        
            return x;
    }
    
    
    /**
     * prints the word pig
     * @returns void which means nothing
     */
    
    public static void pig()
    {
        System.out.println("pig");
    }
    //public static int add (int x, int y)



}// end of class









