// Header
// Header
// Header

import java.util.Scanner;

public class CardsShell {

   // Main method, do not add anything
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      sum(kb);
   }
   
   // Initialize the deck then loop while
   // the user wants to continue:
   //    ask for a sum using the validation method
   //    loop through every possible selection of 4 cards
   //    if the sum of the 4 chosen equals the sum desired then update your counter and output combination
   //    update the counter for the total number of combinations
   public static void sum(Scanner kb)
   {
      // Initialize Variables (including deck of cards)
      boolean response = true;
      
      
      do{
      
         // Use the validation method to prompt for the sum
         
         // Loop through possible combinations (Hint: Use 4 nested for loops)
         
            // If sum matches then update the counter and output combination
            
            // Update total combination counter
            
         // Output final results and prompt to continue
         
         // If they do not want to continue the set the boolean variable for continuing to false
         
         
         System.out.println("Enter the sum of the combinations that you want: ");
         int numCombos = dataValidation(kb, "Enter the sum of the combinations that you want: ");
         
         //System.out.println("Your number is: " + numCombos);
         
         
         
         
         System.out.println("Would you like to continue?");
         String answer = kb.next();
         if (answer.equals("yes")){
            response = true;
         }
         if (answer.equals ("no")){
            response = false;
 
         }
      }while(response);
   
   }
   
   // Prompt the user to input the sum of combinations desired. Use the hasNextInt() method
   // to ensure that they are entering a number. Also, continue to loop until they have entered
   // a positive number.
   public static int dataValidation(Scanner kb, String prompt){
      
      int num = kb.nextInt();
      while(num < 0){
         System.out.println(prompt);
         num = kb.nextInt();
      }
      
            
      return num; // remove 0 and put your variable for the valid input
   }
  
   // Create and return a 1-dimensional array for all 52 cards. Note that
   // you can don this in one line using the "quick" initialization syntax
   // for arrays. Also, do not worry about the suits, just add the numbers to the array.
   // This means that an Ace of Hearts is the same as an Ace of Spades, they are both 1
   // so you will have 4 of each number in the array.
   public static int[]  initialize( ){
   
      int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
                     1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
                     1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
                     1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,};
     
      return cards;
   }
}