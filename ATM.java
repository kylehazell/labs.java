//kyle hazell ATM csc15 05/11/2018
import java.io.*;
import java.util.*;
public class ATM
{

   
   public static void main(String[] args)  throws IOException
   {
      Scanner kb = new Scanner(System.in);
      run(kb);
   }
   //Runs whole program
   public static void run(Scanner kb)throws IOException
   {
    
      String response;
      Account[] accounts = new Account[11];
      populate(accounts,kb);
      boolean moreCustomers= true;
      boolean moreTransactions=true;
      while(moreCustomers == true)
      {
            int id = getID(kb,accounts);
            int index = searchID(id,accounts);
         do
         {   
            
            display2( accounts, index);
            moreTransactions= Transactions(accounts,index,kb);
            display2( accounts, index);
            
           
         }
         while(moreTransactions == true);
         System.out.println("would like to make another order?");//whos in the line
         response = kb.nextLine();

          do
          {
            
               System.out.println( "Please input yes or no:");
               response=kb.nextLine();
          }
               
       
          while(!response.equalsIgnoreCase("no") && !response.equalsIgnoreCase("yes"));
               if(response.equalsIgnoreCase("no"))
               {
                   moreCustomers=false;
                   System.out.println(" have a good day");
                   break;
               }
            
       }
       
    }
           
          
    
     
    //diplays menu
    public static void display()
    {
    
      System.out.println("Main menu\n1: withdraw \n2: \n3: deposit \n4: exit");
    }
    //Displays  account info 
    public static void display2(Account[] accounts,int index)
    {
       System.out.println(accounts[index].getName());
       System.out.println("ID:"+ accounts[index].getId());
       System.out.println(accounts[index].toString());
       System.out.println("Active account, "+accounts[index].getActive());
       for(int i= 1; i<= 15;i++)
      {
         System.out.print("-");
      }
       
      System.out.println("");
      System.out.println();
      


    }
    //This method handles all transactions
    public static boolean Transactions(Account[] accounts,int index, Scanner kb)
    {
         display();
         System.out.println("whats your choice ?");
         int choice = kb.nextInt();
         while(choice <= 0 || choice > 4)
         {
             System.out.println("enter vaild choice ?");
             choice = kb.nextInt();
         
         }
         boolean contin = true;
         switch(choice)
         {
           case 1:
                  accounts[index].getBalance();
                  display2(accounts,index);
                      break;
           case 2:
                   System.out.println("How much?");
                   int amount = kb.nextInt();
                   while(amount <= 0|| amount >accounts[index].getBalance())
                   {
                        System.out.println("Enter a vaild amount?");
                        amount = kb.nextInt();
                   }
                   accounts[index].withdraw(amount);                   
                   System.out.println(" you withdrew "+amount);
                   System.out.println();
                   break;
            case 3:
                   System.out.println("How much?");
                   amount = kb.nextInt();
                   while(amount <= 0|| amount >accounts[index].getBalance())
                   {
                         System.out.println("Enter a vaild amount?");
                         amount = kb.nextInt();
                   }
                   accounts[index].deposit(amount);
                   System.out.println(" you deposited "+amount);
                   System.out.println();                      
                   break;
            case 4:
                   contin= false;
                   System.out.println();
                   break;
             }

             return contin;
      }
         
   //Stores the file into an array
   public static void populate(Account[] a,Scanner kb)throws IOException
   {
   
      int counter = 0;
      File f = getValidFileName(kb);
      Scanner reader = new Scanner(f);
      while(reader.hasNextLine())
      {         
         String line =reader.nextLine();
         Scanner tokenizer= new Scanner(line);
         String name = tokenizer.next()+" "+tokenizer.next();
         int id = tokenizer.nextInt();
         double balance= tokenizer.nextDouble();
         
         a[counter]= new Account(id,balance,name);
         a[counter].setActive(true);
         counter ++;
      }
      
         
   }
   //grabs the id
   public static int getID(Scanner kb,Account[]a )
   {
      int result,id;
      do
      {
         System.out.println("enter your ID:");
         while(!kb.hasNextInt())
         {  
            System.out.println("Invalid ID. Enter ID:");
            kb.nextLine();
         }
            id= kb.nextInt();
            result= searchID(id,a);
      }
            while(result ==-1);
            return id;
   }
   //searches for the right id to meet the user request
   public static int searchID(int id,Account[]a)
   {
         for(int i = 0;i<a.length-1;i++)
         { 
            if(a[i].getId()==id)
            return i;
         }
         return -1;
   } 
   //gets valid files      
   public static File getValidFileName(Scanner kb)throws IOException, FileNotFoundException
   {
         System.out.println("Enter the file name of the accounts:");
         String fname=kb.nextLine();
         boolean valid = false;
         File f=null;

         while(!valid)
         {
            try
            {
          
               f = new File(fname);
               valid = true;
            }
            catch(Exception e)
            {
               System.out.print("File not found. Enter a valid name;");
               fname = kb.nextLine();
            }
         }
         return f;
    }
      
}