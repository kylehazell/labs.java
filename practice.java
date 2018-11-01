//Kyle Hazell lab 1 09/05/2018
import java.util.Scanner;
public class practice
{
   public static void main(String[] args) 
   {
    Scanner kb = new Scanner(System.in);
      
     equationInput(kb);
	}
   //this method allows the user to enter number and excute the problem
   public static void  equationInput(Scanner kb)
   {
      System.out.println("Input your first number");
      int number1 = kb.nextInt();
      kb.nextLine();
      System.out.println("Input your second  number");
      int number2 = kb.nextInt();
      kb.nextLine();
      int fRound = number2 %10;
      int sRound = number2  /10 %10;
      int tRound = number2 /100 %10;
      
      System.out.printf("%10d\n", number1);
      System.out.printf("X%9d\n", number2);
      line();
      System.out.printf("%10d\n", number1*fRound);
      System.out.printf("%9d\n", number1*sRound);
      System.out.printf("%8d\n", number1*tRound);
      line();
      
      int sum = number1*number2;
      System.out.printf("%10d\n", sum);
   
   }
   //this method creates lines
   public static void line()
   {
      for(int l= 1; l<= 14;l++)
      {
         System.out.print("-");
      }
       
      System.out.println("");
   }
}

      