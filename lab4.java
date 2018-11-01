//Kyle Hazell Lab 4 march 18th 2018
import java.util.Scanner;
public class Assignment2 
{    //this method prints output
   public static void main(String[] args) 
   {
      Scanner console = new Scanner
      (System.in);runProgram(console);
      int numDays = 0;
      int year = 0;      
   }
   //this metod helps combine them
   public static void runProgram(Scanner console) 
   {   
      System.out.print("Enter the month number of your choice:  ");
      int number = console.nextInt();
      console.nextLine();
      if(number>=1&&number<13)        
      { 
        System.out.println(getMonthName(number,console));
         
      }
         
      else 
      {
        System.out.println( "Error: your input " + number+  " and that is not in the range 1 to 12 ");
      }
         
     }
      
   //This method finds the month
   public static String getMonthName(int monthNum, Scanner console)
    {
     String month = "";
      if(monthNum == 1)
      {
         month = "Januray";
      } 
       if(monthNum == 2)
      {
         month = "Feburay";
      }
       if(monthNum == 3)
      {
         month = "March";
      }
       if(monthNum == 4)
      {
         month = "April";
      }
       if(monthNum == 5)
      {
         month = "May";
      }
       if(monthNum == 6)
      {
         month = "June";
      } 
       if(monthNum == 7)
      {
         month = "July";
      }
       if(monthNum == 8)
      {
         month = "August";
      } 
       if(monthNum == 9)
      {
         month = "September";
      } 
       if(monthNum == 10)
      {
         month = "October";
      } 
       if(monthNum == 11)
      {
         month = "November";
      } 
       if(monthNum == 12)
      {
         month = "December";
      }
   
      month =  "in the year"+getNumDaysFeb(console)+": "+ "There are " + getNumDays(monthNum,console) + "  days in " + month;
      
      return month;
      }
    // This metod gets the number of days
    public static int getNumDays(int monthNum, Scanner console) 
    {
      int daysOfMonth = 0;
      switch (monthNum) {
      case 1: daysOfMonth = 31;
      break; 
      case 3:daysOfMonth = 31;
      break; 
      case 5:daysOfMonth = 31;
      break; 
      case 7:daysOfMonth = 31;
      break; 
      case 8:daysOfMonth = 31;
      break;  
      case 10:daysOfMonth = 31;
      break;
      case 12:daysOfMonth = 31;
      break;
      case 4:daysOfMonth =30;
      break;
      case 6: daysOfMonth =30;
      break;
      case 9:daysOfMonth =30;
      break;
      case 11:daysOfMonth =30;
      break;     
      case 2:daysOfMonth = getNumDaysFeb(console);
      break ;
      }
      return daysOfMonth;
    }
    // this method computes if its a leap year or not
    public static int getNumDaysFeb(Scanner console) 
    {
      String answer = "";
      int daysOfMonth = 0;
      System.out.print("What year are you interested in ? ");
      int year = console.nextInt();
      if (((year % 4 == 0 ) && ((year % 100 != 0)) || (year % 400 == 0)))
      {
      daysOfMonth = 29;
      }
      else{
      daysOfMonth = 28;
      }
      answer = "In the year"+  ":"+ year + daysOfMonth ;
      
      return daysOfMonth;
   }
    
  
    
 }