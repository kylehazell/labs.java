public class Countlab3 {

	static void print2D(int[][]A) {
      for (int i =0; i<A.length; i++){
         for (int j=0; j<A[i].length; j++){
         System.out.printf("%5d", A[i][j]);
         }
         System.out.println();
      }
         
	}

	static int[][] add2Ds(int[][]A, int[][]B) {
      int[][] C = new int [A.length][A[0].length];
      for(int i=0;i<A.length; i++){
         for(int j = 0; j<A[0].length; j++){
            C[i][j]= A[i][j]+B[i][j];
         }
      }
      return C;

	}

	static int[][] multiScalar2D(int scalar, int[][]A) {
      int[][] Ans = new int [A.length][A[0].length];
      for(int i=0;i<A.length; i++){
         for(int j = 0; j<A[0].length; j++){
            Ans[i][j]= A[i][j] * scalar;
         }
      }
      return Ans;
	}

	static int[][] transpose2D(int[][]A) {
   int[][] F = new int [A[0].length][A.length];
      for(int i=0;i<A[0].length; i++){
         for(int j = 0; j<A.length; j++){
            F[i][j]= A[j][i];
         }
      }

       return F;
	}

	public static void main(String args[]) {
		int A[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		int B[][] = {{2, 4, 6, 8}, {10, 12, 14, 16}, {18, 20, 22, 24}};
//System.out.println("Instructor's test program\n");
 		System.out.println("A = ");
		print2D(A);
		System.out.println("B = ");
		print2D(B);
		System.out.println("A + B = ");
		print2D(add2Ds(A,B));
		System.out.println("5 X A = ");
		print2D(multiScalar2D(5,A));
		System.out.println("Transpose of A = ");
		print2D(transpose2D(A));
	}

}
