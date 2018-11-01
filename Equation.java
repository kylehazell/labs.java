//Kyle Hazell equationlab 5/02/2018
public class Equation
{
   private double a;
   private double b;
   private double c;
   //constructor must be the same name as your class name
   public Equation(double aa, double bb, double cc)
   {
      a = aa;
      b = bb;
      c = cc;
      counter++;
   
   
   }
   //these mathod sets new set of elements
      public void setA(double newA)
   {
      a=newA;
   }
      public void setB(double newB)
   {
      b=newB;
   }
      public void setC(double newC)
   {
      c=newC;
   }
   //These methods grab new sets
   public double getB()
   {
      return b;
   }
   public double getC()
   {
      return c;
   }
   public double getA()
   {
      return a;
   }



   //prints out the equation
   public String toString()
   {
      String s =a + "+ x^2 "+ b + "+ x "+ c;
      return s;
      
   }
   //this method had the discriminit
   public double getDis()
   {
      double d = b*b-4*a*c;
      if(d<0)
   {
   return 0;
   }
   return Math.sqrt(d);
   
   
   }
   //Positive root
   public double getRoot1()
   {
      return (-b + getDis())/2 * a;
    
   
   }
   //Negative root
   public double getRoot2()
   {
    return (-b - getDis())/2 * a;
   }
   //adds to the equation
   public Equation add(Equation e)
   {
      double a1 = e.a +this.a;
      double b1 = e.b +this.b;
      double c1 = e.c +this.c; 
    return new Equation(a1,b1,c1);
   }
    //subtract from the equation
   public Equation subtract(Equation e)
   {
      double a1 = e.a -this.a;
      double b1 = e.b -this.b;
      double c1 = e.c -this.c;
      
      return new Equation(a1,b1,c1);
    }
    //controls what e equals
    public boolean equals(Equation e)
    {
   
      return this.a==e.a && this.b==e.b && this.c==e.c;
    }

     private static int counter = 0;
     //this method gets the count
     public static int getCount()
     {
       return counter;
     }
     

      

   
}
   
   
                       