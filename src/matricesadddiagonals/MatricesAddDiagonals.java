/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricesadddiagonals;


  import java.io.*; 
class MatricesAddDiagonals { 

	public static void print2D(int mat[][]) 
	{ 
      int n = 0;
	for (int i = 0; i <= 3; i++) 
        {
          int k = i;
	for (int j = k; j <= i; j++) 
            {
              n = n + mat[k][j];
               k = k - 1;
             
            }
       System.out.println(n); 
        } 
      int m = 0;
      for(int z = 1; z<=3; z++){
        int x = z;
        for(int y = 3; y>=z; y--){
          m = m + mat[y][x];
          x = x + 1;
        }
         System.out.println(m); 
        m = 0;
      }
   
} 

	public static void main(String args[]) throws IOException 
	{ 
		int mat[][] = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 },
                                {13, 14, 15, 16 }}; 
		print2D(mat); 
	} 
} 