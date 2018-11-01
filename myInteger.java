//kyle hazell myInteger class csc15 05/11/2018
public class myInteger
{ 
   //gets the value
   private int value;
   public myInteger(int value)
   {
      this.value= value;
   
   }
   //gets value and returns it
   public int getValue()
   {
      return value;
   }
    //check if the boolean is even 
   public  boolean isEven()
   {
      return value %2==0;  
   }
   //check if the boolean is odd
   public boolean isOdd()
   {
      return value %2==1;  
   }
    //check if the boolean is prime
   public boolean isPrime()
   {
      for(int i=2; i<value;i++)
      {
         if(value%i==0)
         {
            return false;
         }
      }
      return true;
    }
      //check if the boolean is even by pass by value
   public static boolean isEven(int num)
   {
      return num %2==0;  
   }
   //check if the boolean is odd by pass by value

   public static boolean isOdd(int num)
   {
      return num %2==1;  
   }
   //check if the boolean is prime by pass by value

   public static boolean isPrime(int num)
   {
      for(int i=2; i<num;i++)
      {
         if(num%i==0)
         {
            return false;
         }
      }
      return true; 
 
        
   }
   //returns boolean  that are even
   public static boolean isEven(myInteger other)
   {
      return other.value % 2==0;  
   }
   //returns boolean  that are odd
   public static boolean isOdd(myInteger other)
   {
      return other.value %2==1;  
   }
   //returns boolean  that are prime
   public static boolean isPrime(myInteger other)
   {
      for(int i=2; i<other.value;i++)
      {
         if(other.value%i==0)
         {
            return false;
         }
      }
      return true; 
 
        
   }

 //checkes if integers are equal
   public boolean equals(int num)
    {
     
       return num==value;
    }
    
      //checkes if integers are equal
    public boolean equals(myInteger num)
    {
   
      if (num.value ==this.value)
       {
       
         return true;
       }
        return false;
     }
     //turns string into interger
     public static int parseInt(String s) 
     {
        return Integer.parseInt(s);
    }
    //turns list into a numbers
    public static int parseInt(char[] s) {
        String num ="";
        for(int i = 0; i < s.length; i++)  
        {
           num = num + s[i];
        }
        
        return Integer.parseInt(num);
    }     






}