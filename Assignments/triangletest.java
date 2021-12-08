public class triangletest
{
   //-----------------------------------------------------------------
   //  Test the triangel class that we made in class
   //  and test a few methods
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
	   triangle tri = new triangle(6,6,9);

	   triangle tri1 = new triangle(7,9,25);

	   triangle tri2 = new triangle(tri);

		System.out.println("Tri1 is " +tri1);
		System.out.println("Tri is  " + tri);

		System.out.println("Side 2 of Tri is " + tri.getSide(2));


		System.out.println("Tri is a iso triangle = " +tri.isIsoceles());


   }//end of main


}//end of class