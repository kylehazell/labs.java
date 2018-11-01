//Kyle Hazell Lab 5 4/10/2018
import java.util.Scanner;
public class Lab5 
{//max rate is the  rate number that helps control the rate
  
  public static final double MAX_RATE = 25;
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    run(kb);
  }
  //This puts the output all together
  public static void run(Scanner kb)
  { 
//////declares the varible repeat as true
      boolean repeat = true;
     //
      while(repeat)
      { 
         saleAmount(kb);
         System.out.print("Do you want to use this app again? ");
         String input = kb.next();
         
         if(input.equals("yes"))
         {
            repeat = true;
         }
           else if(input.equals("no"))
           {
             repeat = false;
           }
       }
    }
    //This method gets the informantion from the user 
  public static void saleAmount(Scanner kb)
  {
      double salesAmount = 0;
      System.out.print("Enter your Sales goal ? ");
      double salesGoal = getValidDouble(kb, "enter  a valid sales goal");
      System.out.print("Enter your base rate ? ");
      double baseRate = getValidDouble(kb, "enter a valid base rate");
      System.out.print("Enter your percent increase? ");
      double percentIncrement = getValidDouble(kb, "enter valid percent increase");
      System.out.print("Enter your sales Interval ? ");
      double saleInterval = getValidDouble(kb, "enter a valid  sales interval");
       
     double commission = 0;
     while (commission < salesGoal)
     {
         commission = comission(salesAmount, baseRate, percentIncrement,saleInterval); 
         if(commission < salesGoal)
         {
            salesAmount +=.01;
         }
                  
     }
      System.out.printf("\nTo get %.2f commission, you need to have %.2f of sale\n",salesGoal, salesAmount);
                
  }
  //This method calculates the comission
   public static double comission(double saleAmount, double baseRate, double increment, double interval)
   {
        double total = 0;
        double com = 0;
        double count = 0;
        double sale = saleAmount;
     
     
      while(sale>interval)
      {
         sale = sale - interval;
         count = count + increment;
      }
         
      double rate = 0;
      rate = baseRate + count * increment;
      if(rate > MAX_RATE)
      { 
         rate = MAX_RATE;
      }
      while( rate > 0 && saleAmount > interval)  
      {
          com = interval * (rate/100); 
          saleAmount-=interval;
          rate-=increment;      
          total+=com;
        
       }
       if(saleAmount > 0)
       { 
         
         total += saleAmount * baseRate/100;
       }  
          
       return total;
  }
  //This method helps with data validation   
  public static double getValidDouble(Scanner kb, String prompt)
  {
      double num = kb.nextDouble();
      while(num < 0)
      {
         System.out.println(prompt);
         num =kb.nextDouble();
      }
      return num;    
          
  }
}
