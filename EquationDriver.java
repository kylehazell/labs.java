//Kyle Hazell equationlab 5/02/2018
import java.io.*;
import java.util.*;
public class EquationDriver
{
   public static void main(String[] args)  throws IOException
   {
       // Create a scanner for the keyboard
       Scanner kb = new Scanner(System.in);
       // Fill the array and pass the array to getResult
       getResult(fillArray());  
      
   }
   //this method gets the file from the users computer
   public static Equation[] fillArray() throws FileNotFoundException
   {
      // Initialize an array of Equations
      Equation[] nums= new Equation[10];
      
      File f = new File("input.txt");
      Scanner file = new Scanner(f);

      int index =0;
      while(file.hasNextLine())
      {
         String line = file.nextLine();
         Scanner token = new Scanner(line);
         // These three lines of code represent cofficient 
         int a = token.nextInt();
         int b = token.nextInt();
         int c = token.nextInt();
         //
         Equation e1 = new Equation(a,b,c);
         nums[index]= e1;
         index++;
      }
      return nums;
   }
   // This method uses the quadratitc formula with numbers from file 
   public static void getResult(Equation[] input)throws IOException
   {
      for(int i =0;i<input.length;i++)
      {
         String sum = input[i].toString();
         System.out.println(sum);
         
         //Equation sum2 = Equation.subtract(e2);
         //System.out.println(sum2);

         double d =input[i].getRoot1();
         double e =input[i].getRoot2();
         System.out.println(d);
         System.out.println(e);
         System.out.println(Equation.getCount());
         System.out.println();
     }
    
   }
   
}