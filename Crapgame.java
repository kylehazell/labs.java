// Kyle Hazell Crap Game csc15 4/14/2018
import java.util.*;
public class Crapgame
{     
     public static void main(String[] args)
     {
         Scanner kb = new Scanner(System.in);
         description();
         play();
     }
     //This method starts the game 
     public static void play()
     {
        Scanner kb = new Scanner(System.in);
        String answer = "yes";
        int losses= 0;
        int wins= 0;
        
        while(answer.equalsIgnoreCase("yes"))
        {
        
          double numOfWin = 0;
          double numOfLoss = 0;
          int thePoint = 0;
          int comeOutRoll = 0;
          int numOfPlays = 0;
          
         for (int i =0; i< 10000; i++)
         {
               Random rand = new Random();
               comeOutRoll= rand.nextInt(7);
               if(winOrLoss(comeOutRoll).equals("win"))
         {
               
                 numOfWin++;
         }
         else if(winOrLoss(comeOutRoll).equals("Loss"))
         {
                  numOfLoss++;
         }
            else
            {
                 thePoint = comeOutRoll;
                 String keepR = keepRolling(thePoint);
         if( keepR.equals("win"))
         {
                 numOfWin++;
                 
         }
               else
               {
                  numOfLoss++;
               }
         }
         }
           
          System.out.println("In the simulation we :\n");
          System.out.printf("won %.0f times\n loss %.0f times",numOfWin,numOfLoss);
          System.out.printf("\nfor a probability of %.4f " , winProability(numOfWin,numOfLoss));
          System.out.println();
          System.out.println(" Hit enter key to continue");
          kb.nextLine();
          kb.nextLine();
          System.out.println("Would you like to play another game yes/no?");
          answer = kb.next();
      
           }
           System.out.println("Have a nice day. GoodBye");
          
           
      }
  
            
      //winOrLoss method determines if user lost or won 
      public static String winOrLoss(int comeOutRoll)
      {
           String result = "";
           if(comeOutRoll == 7 ||comeOutRoll ==  11)
           {
               result="win";
           }
           else if (comeOutRoll == 2 ||comeOutRoll ==  3 ||comeOutRoll ==  12)
           { 
              result="Loss";
           }
           else if (comeOutRoll ==  4 ||comeOutRoll ==  5 ||comeOutRoll == 6 ||comeOutRoll == 8|| comeOutRoll == 9||comeOutRoll == 10)
           {
               result = "the point";
           }
          return result;
      }
          
      //prints how the game works and rules of game
      public static void description()
      {
                  System.out.print("Computer will paly a crap game for you. Here are the\n"
                  +" rules of the game:\n"+
                  "Two six sided dice is rolled\n"+
                  "Come out roll: The first roll of the dice in a craps\n"+
                  "round\n"+
                  "A come out roll of 7 or 11 automatically wins\n"+
                  "A come out roll of 2, 3, or 12 automatically losses\n"+
                                                                            
                  "A come out roll of 4, 5, 6, 8, 9, or 10 becomes The\n"+
                  "PointIf the player gets the point he/she will keep\n"+
                  "playing by rolling the dice until he/she gets a 7 or the\n"+
                   "point.\n"+
                   "If the point is rolled first , then the player wins the\n"+
                        "bet.\n"+
                        "If a 7 is rolled first, then the player loses.\n"+
                        "Lets start playing\n");   
      }
      //KeepRolling method controls if users gets a number that gives them another roll
      public static String keepRolling(int thePoint)
      {
      
         boolean answer = true;
         String result ="";
         while(answer == true)
         {
            Random rand = new Random();
            int newNum = rand.nextInt(7);
            if(newNum == thePoint)
            {
               
                 result = "win";
                 answer = false;
            }
            else if(newNum==7)
            {
                 result = "loss";
                 answer = false; 
            }
               
               
      
          }
        return result;
      }
      
      //This method finds the win the proability
      public static double winProability(double wins, double losses)
      {
      double total = wins+losses;
      double winProability = 0; 
      winProability = wins/total;
      
      return winProability;
      
      
      
      
       }
}
  
