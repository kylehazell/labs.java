//kyle hazell Account class csc15 05/11/2018
import java .util.*;
public class Account 
{
  private int id;
  private double balance;
  private double annualInterestRate;
  private String name;
  private boolean active;
  private Date dateCreated;
  
  public Account(int id, double balance, String name)
  {
      this.id =id;
      this.balance =balance;
      this.annualInterestRate =annualInterestRate;
      this.name = name;
      balance = 0;
     
  }
  //holds the id
  public void setId(int id)
  {
      id=id;
  }
    //sets the annualIntereatRate
   public void setannualInterestRate(double rate)
   {
     if(rate>0)
     {
      //not in use
     }
     
   }
   //holds account it being active
   public void setActive(boolean b)
   {
      active = b;
       
   }
   

    //sets the name
    public void setName(String name)
    {
      name = name;
    }
    //reset the balance to the given amount 
   public void setBalance(double b)
   {
      if(b>0)
      {
         b = balance;
      }
   }

     // returns the Id
    public int getId()
   {
   
      return id;
   }
   // returns the balance
   public double getBalance()
   {
      return balance;
   }
   //returns annual
   public double getannualInterestRate()
   {
      return annualInterestRate;
   }
   //returns the name
   public String getName()
   {
   
      return name;
   }
   // activates account
   public boolean getActive()
   {
      
      return active; 
      
   
   }
   //deactivates account
   public void  deactiveAccount()
   {
      active = false;
      System.out.println("deactive account");
   }
   //gets the rate
   public double  getRate()
   {
     return annualInterestRate;

   }
   //returns the Date
   public Date getDate()
   { 
     return dateCreated;
   }
    //returns the annual interestRate

   public double getMonthlyIntrestRate()
   {
      return annualInterestRate/12;
   }
   //closes account if no money
   public  String  close()
   {
     withdraw(balance);
     deactiveAccount(); 
     String response= "account empty"; 
     return response;  
   } 
   //Withdraw the amount of money  from balance 
   public void withdraw(double amount)
   {  
      if(amount <= balance && balance !=0)
      {
         balance-=amount;
      }
      
      
   
   }
   //adds money to the balance
   public void deposit(double amount)
   {
   
      balance+=amount;
   
   }
   //compares id numbers 
   public boolean equals(Account a)
   {
     if(a.id==this.id)
     {
       return true;
     }
     return false;
    
   }
   // Strings the final account balance in output
   public String toString() 
   {
      String s = "your current amount "+balance;
   
   return s;
   }
} 


  
      