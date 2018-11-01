//kyle hazell myIntegerdriver class csc15 05/11/2018
public class myIntegerDriver
{

   public static void main(String[]args)
   {
      myInteger num =new myInteger(5);
      //System.out.print(num);
      boolean e= num.isEven();
      boolean p= num.isPrime();
      boolean o= num.isOdd();
      System.out.println(num.getValue()+ " is even ? " + e);
      System.out.println(num.getValue()+ " is prime ? "+ p);
      System.out.println(num.getValue()+ " is odd ? " + o);
      System.out.println();
       
      int a = 12;
      int b = 6;
      int c =41;
      e= myInteger.isEven(a);
      p= myInteger.isPrime(b);
      o= myInteger.isOdd(c);
          
      System.out.println();
      System.out.println(a + " is even ? " + e);
      System.out.println(b + " is prime ? " + p);
      System.out.println(c + " is false ? " + o);
      System.out.println();
        
      myInteger m1 = new myInteger(5);
      System.out.println(m1.getValue() +" is even ? "+myInteger.isEven(m1));
      System.out.println(m1.getValue() +" is odd ? "+ myInteger.isOdd(m1));
      System.out.println(m1.getValue() +" is priime ? "+ myInteger.isPrime(m1));
      System.out.println();
      
      int number=6;
      boolean  equals1 =num.equals(number);
      System.out.println("is " + num.getValue()+ " = " + number +"? "+ equals1 );
      boolean  equals2 =num.equals(m1);
      System.out.println("is " + num.getValue()+ " = " + m1.getValue() +" ? "+ equals2);
      System.out.println();
      char[] chars = {'3', '5', '3', '9'};
      System.out.println("\"" + new String(chars) +"\" " + " = "+ myInteger.parseInt(chars));
      String s = "1234";
      System.out.println("\""+ s +"\""+" = "+ myInteger.parseInt(s));
      
      
      
      
   }



}