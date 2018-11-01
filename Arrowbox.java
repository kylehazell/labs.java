//& Jayven Khoonsirivong
public class Arrowbox
{
     public static void main(String[]args) 
     {
       mystery(10,20);                                                                                           

     



   


    }
 
   public static void mystery( int x , int y) 
   {
   
    while( x !=0 && y !=0)
   
    {
   
        if( x< y) {
   
             y = y-x;
   
        }
   
        else  {
   
             x = x-y;
   
        }
   
     }
   
        System.out.println(x+y);
   
   } 

 
}




