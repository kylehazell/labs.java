//Kyle Hazell Lab2  section 1 csc 20 09/12/2018
import java.util.Scanner;
import java.io.PrintStream;
public class Labs2 {
	public static void main(String[] paramArrayOfString) 
   { java.util.Scanner localScanner = new java.util.Scanner(System.in);
    
      System.out.print("Year: ");
      int i = localScanner.nextInt();


    JulianDate localJulianDate = new JulianDate();
    int m = JulianDate.toJulian(i, 1, 1);
    int n = (m + 1) % 7;
    System.out.printf("\n\n");
    System.out.printf("%13d\n\n",  Integer.valueOf(i));
    int i1 = 0;
    int i3 = i % 4 == 0 & i % 100 == 0 || i % 400 == 0 ? 0 : 1;
    for (int i4 = 1; i4 <= 12; i4++) {
      switch (i4) {
      case 1:  System.out.printf("%14s\n", "January" );
        i1 = 31; break;
      case 2:  System.out.printf("%15s\n", "February");
        i1 = i3 != 0 ? 29 : 28; break;
      case 3:  System.out.printf("%13s\n", "March" );
        i1 = 31; break;
      case 4:  System.out.printf("%13s\n", "April" );
        i1 = 30; break;
      case 5:  System.out.printf("%12s\n",   "May" );
        i1 = 31; break;
      case 6:  System.out.printf("%13s\n", "June" );
        i1 = 30; break;
      case 7:  System.out.printf("%13s\n",  "July" );
        i1 = 31; break;
      case 8:  System.out.printf("%14s\n",  "August" );
        i1 = 31; break;
      case 9:  System.out.printf("%15s\n", "September" );
        i1 = 30; break;
      case 10:  System.out.printf("%14s\n",  "October" );
        i1 = 31; break;
      case 11:  System.out.printf("%15s\n",  "November" );
        i1 = 30; break;
      case 12:  System.out.printf("%15s\n",  "December" );
        i1 = 31;
      }
      
      System.out.printf("\n Su Mn Tu We Th Fr Sa\n");
      

      if (n > 0) { System.out.printf("%" + 3 * n + "c", Character.valueOf(' ') );
      }
      for (int i2 = 1; i2 <= i1; i2++) {
        System.out.printf("%3d",  Integer.valueOf(i2) );
        n++; if (n == 7) {
          if (i2 != i1) System.out.printf("\n");
          n = 0;
        }
      }
      System.out.printf("\n\n");
    }
  }

}

