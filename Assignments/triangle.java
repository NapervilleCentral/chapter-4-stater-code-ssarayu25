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
            this.side1 = x;
            this.side2 = y;
            this.side3 = z;
            if (!this.isValid())
            {
                this.side1 = - 1;
                this.side2 = -1;
                this.side3 = -1;
            }
            
        }

    
    /**
     * Constructor(triangle): takes a triangle as an agument
     * @param triangle object
     */

    public triangle(triangle obj2)
    {
        this.side1 = obj2.side1;
        this.side2 = obj2.side2;
        this.side3 = obj2.side3;

    }




    /**
    /* returns true if valid triangle and no side is 0
     * @returns boolean of whether triangle is valid
     */

    private boolean isValid ()
    {
        if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side3 + side1) > side2 && (side1 > 0) && (side2 > 0) &&(side3 > 0))
        {
            return true;
        }
        return false;

    }



    /**
     * getSide- will take a side 1-3 and return the value for that side
     * if ! 1-3 returns -1
     * 
     * @param int of side number
     * @returns int of length of the side 
     */
    
    public int getSide(int side)
    {

        if (side == 1)
            return side1;
        else if (side == 2)
            return side2;
        else if (side == 3)
            return side3;
        return 0;
    }


    
    /**
     * sets all the sides 
     * checkes isValid and if not will not change any sides
     */

    public void setSides (int side1, int side2, int side3)

    {
        
        if (this.isValid())
        {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        
        
        


    }
    
    /**
     * 
     */
    public boolean isEquilateral ()
    {
        if (side1 == side2 && side2 == side3)
            return true;
        return false;
    }
    
    /**
     * 
     */
    public boolean isIsoceles()
    {
        if ((side1 == side2) || (side2 == side3) || (side3 == side1))
            return true;
        return false;
    }

    
    
    /**
     * 
     */
    public boolean isRight()
    {
        int hyp = 0, leg1 = 0, leg2 = 0;
        if (side1 > side2 && side1 > side3)
        {
            hyp = side1;
            leg1 = side2;
            leg2 = side3;
        }
        else if (side2 > side1 && side2 > side3)
        {
            hyp = side2;
            leg1 = side1;
            leg2 = side3;
        }
        else if (side3 > side1 && side3 > 2)
        {
            hyp = side3;
            leg1 = side1;
            leg2 = side2;
        }
        
        
        if (hyp*hyp == ((leg1*leg1) + (leg2*leg2)))
            return true;
        return false;
    }
    
    /**
    /*Returns all three sides with , between
    */
    public String toString()
    {
        String sides;

        sides = "Side 1: " +side1 + ", ";
        sides += "Side 2: " + side2 + ", ";
        sides += "Side 3: " + side3 + ", ";

        return sides;


    }



}//end of class