// Kyle Hazell Lab7 4/18/18

import java.util.Scanner;

public class Lab7 
{

   
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      sum(kb);
   }
   //This method combines all the outcomes together to print 
   public static void sum(Scanner kb)
   {      
      int[] deck= initialize();
      boolean result= true;
      while( result )
      {
         int win = 0;
         int count = 0;
         System.out.println("Enter the sum of the combinations that you want:"); 
         int input = dataValidation(kb, "Enter a valid integer");
         System.out.println("Here is the list of all the combinations: ");
         for(int i = 0; i <deck.length; i++)
         {
            for(int j= i+1; j <deck.length; j++)
            {
               for(int k=j+1;k<deck.length;k++)
               {
                  for(int p =k+1;p<deck.length;p++)
                  {
                     if(deck[i] + deck[j]+deck[k]+deck[p]==input)
                     {
                         win++;
                         System.out.println(deck[i]+" "+ deck[j] +" "+ deck[k] +" "+ deck[p]);
                         count++;
                     }
                         else
                         {
                             count++;
                         }
                  }
                }
             }
          }
          System.out.println("Total number of combinations: " + count);
          System.out.println("The number of picks that yields the sum of "+input+" is "+ win);  
      
          System.out.println("Do you want to continue:");
          String ans = kb.next();
          while(!ans.equalsIgnoreCase("no")&&!ans.equalsIgnoreCase("yes"))
         
          {
          System.out.println("Do you want to continue:");
           ans = kb.next();

          }
          if (ans.equals ("yes"))
          {
             result = true;
          }
          if (ans.equals ("no"))
          {
             result = false;
          }
      }           
           
   }
  //This method makes sure the user enters the right data
   public static int dataValidation(Scanner kb, String prompt)
   {
      
      int input = 0;
      boolean isNumber;

     do
      {
         if(kb.hasNextInt())
         {
         
            input = kb.nextInt();
            isNumber = true;
         }  
            else
            {
                System.out.println("Enter the sum of the combinations that you want:");
                isNumber = false;
                kb.next();
            }
       }
       while(!(isNumber));
   
       while(input < 0)
       {
            System.out.println(prompt);
            input =kb.nextInt();

       }
     
       return input;
   }  
   //This holds the array of card options 
   public static int[]  initialize( )
   {
      int[] cards = {1,2,3,4,5,6,7,8,9,12,13,
      1,2,3,4,5,6,7,8,9,12,13,
      1,2,3,4,5,6,7,8,9,12,13,
      1,2,3,4,5,6,7,8,9,12,13};

      return cards;
   }
}