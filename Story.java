// Kyle Hazell Lab 3 part 2  3/05/2018

import java.util.Scanner;
public class Story
 {
   public static void main (String[]args)
   {
      Scanner kb = new Scanner(System.in);
      String backStory =  background(kb);
      System.out.println(backStory);
   
   }
   /* this method  gets all the info from the user.Then 
   makes up the story and store it in a String*/
   public static String background(Scanner kb)
   {
      
      System.out.println("enter your name ");
      String name = kb.next();
      kb.nextLine();
      System.out.println("Are you a she or he?");
      String gender = kb.next();
      kb.nextLine();
      System.out.println("enter age");
      int age = kb.nextInt();
      kb.nextLine();
      System.out.println("The name of a city of the college attending");
      String city = kb.next();
      kb.nextLine();
      System.out.println("Name of college");
      String college = kb.next();
      kb.nextLine();
      System.out.println("A profession ");
      String job = kb.next();
      kb.nextLine();
      System.out.println("A type of animal");
      String animal = kb.next();
      kb.nextLine(); 
      System.out.println("A pet’s name");
      String pet = kb.next();
      kb.nextLine();
      System.out.println("Ages for three siblings");
      int youngest = kb.nextInt();
      kb.nextLine();
      int middle = kb.nextInt();
      kb.nextLine();
      int oldest = kb.nextInt();
      kb.nextLine();
      System.out.println("favorite site ?");
      String website = kb.next();
      kb.nextLine();
      System.out.println("whats your GPA");
      double gpa = kb.nextDouble();
      kb.nextLine();
      String backStory = "here is a story for you " 
                          + "\nOnce up on a time there was someone named "+ reverse(name)+
                          gender +" was " + age + " years old.\n"+gender + "was attending "+ college +","+
                          "college."+ gender + "became a "+ job + " after college."+
                          "\nOne day on the way home "+capital(name)+" saw a "+animal+" wondering the streets of "+
                          city+".\n"+ capital(name)+ " adopted the "+ animal+ " and named the" +animal + pet+"."+ capital(name)+  "had 3 siblings and the youngest sibling is\n"+
                          min(youngest,middle,oldest)+" years old and the oldest sibling is "+ max(youngest,middle,oldest)+"years old."+capital(gender)+
                          " spent a lot of time on the computer visiting the\n"+" website with the domain name "+
                          domain( website)+"." +capital(name) + " and " + pet+ " lived happily ever after!";      
                                             
      return backStory;  
   }
   /*this method gets a String as its parameter, creates a new String in the reverse order, and returns the new string*/
 
   public static String reverse(String s)
   {  
        String name = "";
        int length =s.length();
        for(int i=length-1;i >=0;i--){
        name+= "" +  s.charAt(i);
        }
        return name;
    }
    /* this method pulls out the domain name from the website info. use methods from the String class to do this*/
    public static String domain(String s)
    {
        int beginnig = s.indexOf('.');
        int end = s.lastIndexOf('.');
        String middle = s.substring(beginnig +1,end);
        return middle;
     }
     
     /*This method gets a string and then capitalized the first letter of the String and returns it*/
     public static String capital(String s)
     {
        String cap = s.substring(0,1).toUpperCase();
        cap = cap + s.substring(1);
        return cap;
     }
     /*this method finds the max value of three numbers. use the min method from the math class*/
     public static int max(int a, int b, int c)
     {
        int oldest =Math.max(a, Math.max(b,c));
        return oldest;
     }
     /*This method returns the min value of the given three  values*/
     public static int min(int a, int b, int c)
     {
        int youngest = Math.min(a,Math.min(b,c));
        return youngest;
     }
 }