// Java program to shift k elements in a 
// matrix. 
import java.io.*; 
import java.util.*; 

public class Main { 
	
	static int N = 3; 
	
	// Function to shift first k elements 
	// of each row of matrix. 
	static void shiftMatrixByK(int [][]mat, 
									int k) 
	{ 
		if (k > N) { 
			System.out.print("Shifting is"
						+ " not possible"); 
			return; 
		} 
		
		int j = 0; 
		while (j < N) { 
			
		
			for (int i = k; i < N; i++) 
				System.out.print(mat[j][i] + " "); 
				
		
			for (int i = 0; i < k; i++) 
				System.out.print(mat[j][i] + " "); 
				
			System.out.println(); 
			j++; 
		} 
	} 
	

	public static void main(String args[]) 
	{ 
		int [][]mat = new int [100][100] ;
		int i,j;
		Scanner s = new Scanner(System.in);
		for(i=0;i<N;i++)
		{
		    for(j=0;j<N;j++)
		    {
		        mat[i][j]=s.nextInt();
		    }
		}
	    int k = s.nextInt(); 
		k=k-1;

		shiftMatrixByK(mat, k); 
	} 
} 


