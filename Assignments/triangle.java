/*************************************************
Class Triangle

************************************************/

public class triangle
{
    private int side1;
    private int side2;
    private int side3;



    /**
    *Default Constructor
    *Constructor(): takes no parameters sets sides to -1
    */
    public triangle()
    {
        this.side1 = -1;
        this.side2 = -1;
        this.side3 = -1;
    }
    
    /**
     * Constructor: set the private data side 1-3
     * will test if valid and if not sets sides to -1
     * @param int of each side
     */
        public triangle (int x, int y, int z)
        {
            `
    
        }

    
    /**
     * Constructor(triangle): takes a triangle as an agument
     * 
     */

    public triangle(triangle obj2)
    {


    }




    /**
    /* returns true if valid triangle and no side is 0
    */

    private boolean isValid ()
    {
        if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side3 + side1)
        return false;

    }



    /**
     * getSide- will take a side 1-3 and return the value for that side
     * if ! 1-3 returns -1
     */
    
    public int getSide(int side)
    {

        if (side == 1)
            return side1;
        return 0;
    }


    
    /**
     * sets all the sides 
     * checkes isValid and if not will not change any sides
     */

    public void setSides (int side1, int side2, int side3)

    {
        

        


    }
    
    /**
     * 
     */
    public boolean isEquilateral ()
    {

        return true;
    }
    
    /**
     * 
     */
    public boolean isIsoceles()
    {
        return true;
    }

    /**
    /*Returns all three sides with , between
    */
    public String toString()
    {
        String sides;

		sides = "Side 1, " +side1 + "\n";

		return sides;


	}



}//end of class