 //Kyle Hazell & Jayven Khoonsirivong csc15
 //02/09/2018 Arrow box lab

public class Arrowboxlab
{  
   //This controls the SIZE of the figure
   public static int SIZE = 3; 
  
   //This creates the final output
   public static void main(String[] args)
   {
      draw();
   }
   //This creates the lines in the output
   public static void line()
   {
      System.out.print("+");
      for (int dash = 1; dash <= 2 * SIZE; dash++){     
         System.out.print("-");
      }   
      System.out.println("+");
   }
   //This method creates the top half of the output
   public static void top() 
   {
      for(int line =1; line <= SIZE; line++){
         System.out.print("|");
               
         for(int space = 1; space <= (SIZE - line); space++){   
            System.out.print(" ");
         }
         System.out.print("^");
         for (int space = 1; space <= 2 * (line-1); space++){ 
            System.out.print(" ");
         }
         System.out.print("^");
         for(int space = 1;space <= (SIZE - line); space++){ 
            System.out.print(" ");
         }
         System.out.println("|");
      }
   }
   //This creates the bottom half of the output 
   public static void bottom()
   {
       for (int line =1; line <= SIZE; line++){
         System.out.print("|");
         for (int space = 1; space <= (line-1); space++){
            System.out.print(" ");
         }
         System.out.print("v");
         for (int space = 1; space <=2*SIZE-2 * line; space++){
            System.out.print(" ");
         }
         System.out.print("v");
      
         for (int space =1; space <=(line-1); space++){
            System.out.print(" ");
         }
         System.out.println("|");
      }
   }
    //Metod combines all the other methods together
   public static void draw()
   {
      line();
      top();
      top();
      line();
      bottom();
      bottom();
      line();
    }
}
