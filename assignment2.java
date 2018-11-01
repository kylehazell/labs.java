//Kyle Hazell assignment2  3/28/2018
import java.util.Scanner;
public class assignment2
{
   /*The main method has only one line of code and it calls the process method that prints out
   the final output*/
   public static void main(String[] args)
   {
 
       process();
               
   }
   /*This method ask the required info and calls the appropriate methods based on the user's input to either print
   the calendar for the month or for the year*/
   public static void process()
   {
      Scanner console = new Scanner(System.in);
      
      System.out.print("How many times do you want to use this app? ");
      int numberOfTimes = console.nextInt();
      console.nextLine();
      
      for(int i=1;i<=numberOfTimes;i++){
      int year = 0; 
      System.out.println("To print the calendar choose one of the following options:\n1.  Year\n2.  Month");
      String answer = console.next();
      console.nextLine();
      System.out.println("your choice --> "+ answer);
      
      if(year<1800)
      {
         System.out.print("Enter a valid year  above 1800: ");
         year = console.nextInt();
         console.nextLine();  
      }
 
      if( answer.equalsIgnoreCase("year"))
      { 
         System.out.println(year);
         for(int j=1;j<=12;j++)
         { 
            printMonth(year,j);
            System.out.println();
     
      
         }
      }
         else
         {
            System.out.println("Enter a month number between (1-12): ");
            int month = console.nextInt();
            console.nextLine();
            printMonth(year,month);
            console.nextLine(); 
            
         }
      }
   }
   //this method prints the body of the calender for the given month by calling the  the methods printMonthTable and printMonthBody
   public static void printMonth(int year, int month)
   {
      printMonthTitle(year, month);
      printMonthBody(year, month);
     
   }
   //this method prints the title of the days in each week
      public static void printMonthTitle(int year, int month)
   {     
         System.out.println("\t"+getMonthName( month)+""+year);  
         for(int i=1;i<=30;i++)
         {
            System.out.print("-");
         }
   
         System.out.print("\nSun Mon Tue Wed Thu Fri Sat\n");
         for(int i=1;i<=30;i++)
         {
            System.out.print("-");
         }
      System.out.println("");
   }
   /*this method calls the method getStartday to find out the first day of the month
   then it calls the method print*/
   public static void printMonthBody(int year, int month)
   {
      int startDay = getStartDay(year,month);
      
      print(startDay, year,month);
   }
   public static void print(int startDay, int year, int month)
   {
	   
     for (int i =1; i <= startDay; i++)
        System.out.print("    ");
     for (int i = 1; i<= getNumberOfDaysInMonth(year, month); i++)
     {
          System.out.printf("%-4d", i);
          if ((i + startDay) % 7 ==0)
          System.out.println();
     }
	  if (month ==11)
	  {
	     int thanksGiving = thanks(startDay);
		  System.out.println("\n**Thanks giving day is on the " + thanksGiving + "th");
	  }	                
   }
   /*This method finds out the day of thanksgiving
   */
	public static int thanks(int startDay)
	{ 
      int thanksG =0;
      switch (startDay) 
      {
         case 0:thanksG = 5+21;
         break; 
         case 1:thanksG = 4+21;
         break; 
         case 2:thanksG = 3+21;
         break; 
         case 3:thanksG = 2+21;
         break; 
         case 4:thanksG = 1+21;
         break;  
         case 5:thanksG = 7+21;
         break;
         case 6:thanksG = 6+21;
         break;
         default:thanksG =-1;
         break;
 
     }
          return thanksG; 
	}					 								  		  		  			  		  
	/*This method gets the number of the month and returns the name of the month */    	    
   public static String getMonthName(int monthNum)
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
   
           return month;
      }

   /*this method returns the first day of the month which is a number  */
      public static int getStartDay(int year, int month)
      {
          int totalDay = 2+getTotalNumberOfDays(year, month);
          int startDay = totalDay %7;
          return startDay;   
      }
      /*this method   calculates the total number of the days has passed since 1800*/
       
      public static int getTotalNumberOfDays(int year, int month)
      { 
         int dayCounter=0;
         int counter = 0;
         for(int i=1800;i<= year;i++)
         {
         
         
         for(int j=1;j<=12;j++)
         {
          counter += getNumberOfDaysInMonth(i,j);
         }
       
         }
         for(int k=1;k<month;k++)
         {
          dayCounter+=getNumberOfDaysInMonth(year,k);
         }
   
         return counter+dayCounter;
      }
   
      public static int getNumberOfDaysInMonth(int year, int month)
      {
         int daysOfMonth = 0;
         switch (month) 
         {
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
         case 2:
       if(isLeapYear(year)== true)
       {
          daysOfMonth =29;
               
       }
         else if(isLeapYear(year) == false)
         {
             daysOfMonth =28;
         }
         break ;
         }
         return daysOfMonth;
                      
         
         }
   
}   