// Kyle Hazell Lab 1 how to spell mississippi 1/30/2018

public class Spellmississippi 
{  
   // The main method calls all of the methods to spell mississippi
   public static void main(String[] args) 
   { 
      mississippiSpeller();
     
   
    
   
    }  
   // This method spells out M   
   public static void letterM()
   {
      System.out.println("M     M");
      System.out.println("MM   MM");
      System.out.println("M M M M");
      System.out.println("M  M  M");
      System.out.println("M     M");
      System.out.println("M     M");
      System.out.println("M     M");
   }     
   
   //spells out I
   public static void letterI()
   
   {
      System.out.println(" IIIII ");
      System.out.println("   I ");
      System.out.println("   I ");
      System.out.println("   I ");
      System.out.println("   I ");
      System.out.println("   I ");
      System.out.println(" IIIII "); 
   }
   //spells out S
   public static void letterS()
   {  
   
      System.out.println(" SSSSS ");
      System.out.println("S     S");
      System.out.println("S     ");
      System.out.println(" SSSSS ");
      System.out.println("      S"); 
      System.out.println("S     S");
      System.out.println("SSSSS ");
    }
   //spells out P
   public static void letterP()
   {
      System.out.println("PPPPPP ");
      System.out.println("P     P ");
      System.out.println("P     P ");
      System.out.println("PPPPPP ");
      System.out.println("P "); 
      System.out.println("P ");
      System.out.println("P ");
   }
   // this  draws  the ISS twice
   public static void letterIss()
    
   { 
      letterI();
      System.out.println();
      letterS();
      System.out.println();
      letterS();
   }
   // This combines all the structures together
   public static void mississippiSpeller()
   { 
      letterM();
      letterIss();
      letterIss();
      letterI();
      letterP();
      letterP();
      letterI();
   }  
    
 }    
 
