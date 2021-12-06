import java.util.Scanner;
//********************************************************************
//  Banking.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************

public class Banking
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
    Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
    Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
    Account acct3 = new Account ("Sanchit Reddy", 93757, 759.32);
    int control = 1;
      
      
    Scanner scan = new Scanner(System.in);
      
      while (control == 1)
    {
          System.out.println("Enter corresponding number on menu");
          System.out.println("1 - deposit ");
          System.out.println("2 - withdraw");
          System.out.println("3 - transfer");
          System.out.println("4 - exit");
          int choice = scan.nextInt();
          if (choice == 1)
          {
              System.out.print("Which account do you want to access(Enter Account Number)? ");
              int acc = scan.nextInt();
              if (acc == 72354)
              {
                  System.out.print("How much do you want to enter? ");
                  double deposit = scan.nextDouble();
                  acct1.deposit(deposit);
                }
              else if (acc == 69713)
              {
                  System.out.print("How much do you want to enter? ");
                  double deposit = scan.nextDouble();
                  acct2.deposit(deposit);
                }
              else if (acc == 93757)
              {
                  System.out.print("How much do you want to enter? ");
                  double deposit = scan.nextDouble();
                  acct3.deposit(deposit);
                }
          }
          else if (choice == 2)
          {
              System.out.print("Which account do you want to access(Enter Account Number)? ");
              int acc = scan.nextInt();
              if (acc == 72354)
              {
                  System.out.print("How much do you want to withdraw? ");
                  double withdrawal = scan.nextDouble();
                  acct1.withdraw(withdrawal, 10);
                }
              else if (acc == 69713)
              {
                  System.out.print("How much do you want to withdraw? ");
                  double withdrawal = scan.nextDouble();
                  acct2.withdraw(withdrawal, 10);
                }
              else if (acc == 93757)
              {
                  System.out.print("How much do you want to withdraw? ");
                  double withdrawal = scan.nextDouble();
                  acct3.withdraw(withdrawal, 10);
                }
              
            }
          else if (choice == 3)
          {
              System.out.print("Which account do you want to transfer to? ");
              int acc = scan.nextInt();
              System.out.print("How much do you want to transfer? ");
              double transfer = scan.nextDouble();
              if (acc == 69713)
              {
                  acct1.transfer(acct2,transfer);
                }
              else if (acc == 93757)
              {
                  acct1.transfer(acct3,transfer);
                }
            }
          else if (choice == 4)
          {
             control = 0;
            }
          
    }
      
      
 
    System.out.println (acct1);
    System.out.println (acct2);
    System.out.println (acct3);
   }
}
