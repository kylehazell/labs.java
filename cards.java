import java.util.Scanner;
public class cards
{
   public static void main (String [] args)
   {
      Scanner kb = new Scanner(System.in);
      sum(kb);
   }
   
   public static void sum (Scanner kb)
   {
      int [] deck = new int[52];
      boolean answer = true;
      do    
      {
         System.out.print ("Enter the sum of the combinations that you want: ");
         int userCombin = dataValidation(kb, "Enter the sum of the combinations that you want: ");
         kb.nextLine();
        /* for (int i = 0; i<deck.length; i++)
         {
            deck[i] = i;
            for (int j = 0 ; j < deck.length; j++)
            {
               int randomize = (int)(Math.random() * deck.length);
               
            }
         }*/
      System.out.print ("Do you want to continue: ");
      String ans = kb.next();
      if (ans.equals ("yes"))
      {
         answer = true;
      }
      if (ans.equals ("no"))
      {
         answer = false;
      }
      }
      while (answer);
      
   }
   
   public static int dataValidation (Scanner kb, String prompt)
   {
      int num = kb.nextInt();
      while (num < 0)
      {
        System.out.print (prompt);
        num = kb.nextInt(); 
      }
      return num;
   }  
   
   /*public static int deck[] initialize()
   {
      int[] cards = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
         1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 
         1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 
         1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
      return cards;
   }*/
}