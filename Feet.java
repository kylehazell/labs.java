// Kyle Hazell Lab 3 part 1  2/15/2018
public class Feet
{   //This prints the combineds final output
   public static void main(String[] args)
   {
     print();
   }
   //This method combines all the converison methods
   public static void print()
   {
      line();
      double feet = 1;
      System.out.println("Feet\t Inches\t Meters\t Centimeters\tMillimeters");
      for(int i= 0;i<=20;i++)
       {
           System.out.printf(" %.2f\t",feet);
           double f = feetToInches(feet);
           System.out.printf("  %.2f\t",f);
           double m = feetToMeter(feet);
           System.out.printf(" %.2f\t",m);
           double c = meterToCenti(m);
           System.out.printf("    %.2f\t",c);
           double mill = centiToMilli(c);
           System.out.printf("     %.2f\t",mill);
           System.out.println("");
            feet++;
       }
      line();
   }
   //This method coverts feet to meters
   public static double feetToMeter(double feet)
   {
      double meter = feet * .305;
      return meter;
   }
   //This method converts meters to centimeters
   public static double meterToCenti(double meter)
   {
       double centi = meter * 100;
       return centi;
   }
   //This method converts centimeters to millimeters
   public static double centiToMilli(double centi)
   {
      double milli = centi * 10;
      return milli;
   }
   //This method coverts feet to inches
   public static double feetToInches(double feet)
   {
      double inches = feet * 12;
      return inches;
   }
   //This method creates the lines around the output
   public static void line()
   {
      for(int l= 1; l<= 50;l++)
      {
         System.out.print("-");
      }
       
      System.out.println("");
   }
}