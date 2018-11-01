import java.io.*;
import java.util.*;
public class ReadFile
{
   public static void main(String[] args) throws IOException 
   { 
    Scanner kb = new Scanner(System.in);
      //readInfo();
      //readPeople(kb);
      populate();
   }

   public static void readInfo() throws IOException
   {
      File f = new File("data.text");
      Scanner input = new Scanner(f);
      while (input.hasNextLine())
      {
         String name = input.nextLine();
         System.out.println(name); 
       }
    
   }
   
   public static  void text() throws IOException
   {
      readInfo();
   } 
   public static void readPeople(Scanner kb) throws IOException

   {

      String name = "";

      String file = "";

      System.out.println("Enter the file name: ");
      file = kb.nextLine();

      //create a file object

      File f = new File(file);

      //create a pointer to the file

      Scanner input = new Scanner(f);
      int count = 0;
      int sum= 0;

      while(input.hasNextLine())

      {

         String line = input.nextLine();
         Scanner token= new Scanner(line);
          name = token.next();
         int age = token.nextInt();
         int salary = token.nextInt();
         sum = sum+ salary;
         count ++;
      }
      double avg = (double)sum/count;
      System.out.println(avg);  
      }
      public static String[] populate()throws IOException
      {
         int count = 0;
         File f = new File("names.text");
         Scanner input = new Scanner(f);
         while(input.hasNext())
         {
            input.next();
            count++;
          }
          String[] names = new String[count];
          count =0;
          while(input.hasNext())
          {
           names[count]=input.next();
           count++;
          }
          System.out.println(Arrays.toString(names));
          return names;
       }
         

}