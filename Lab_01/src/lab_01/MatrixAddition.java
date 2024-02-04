package lab_01;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) 
	{
		int p,q,m,n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the No of rows in first matrix: ");
        p = s.nextInt();
        System.out.print("\nEnter the No of coloumns in first matrix: ");
        q = s.nextInt();
        System.out.print("\nEnter the No of rows in second matrix: ");
        m = s.nextInt();
        System.out.print("\nEnter the No of coloumns in second matrix: ");
        n = s.nextInt();       
        if(p == m && q == n)
        {
        	int[][] a = new int[p][q];
        	int[][] b = new int[m][n];
        	int[][] c = new int[m][n];
        	System.out.print("\nEnter the Elements of First matrix :\n");
        	for(int i=0;i<p;i++)
        	{
        		for(int j=0;j<q;j++)
        		{
        			a[i][j] = s.nextInt();
        		}
        	}
        	System.out.print("\nEnter the Elements of Second matrix :\n");
        	for(int i=0;i<m;i++)
        	{
        		for(int j=0;j<n;j++)
        		{
        			b[i][j] = s.nextInt();
        		}
        	}     
        	
        	System.out.print("\nMAtrix A:\n");
        	for(int i=0;i<p;i++)
        	{
        		for(int j=0;j<q;j++)
        		{
        			System.out.print(a[i][j]+"\t");
        		}
        		System.out.println();
        	}  
        	System.out.print("\nMAtrix B:\n");
        	for(int i=0;i<m;i++)
        	{
        		for(int j=0;j<n;j++)
        		{
        			System.out.print(b[i][j]+"\t");
        		}
        		System.out.println();
        	}  
        	for(int i=0;i<p;i++)
        	{
        		for(int j=0;j<n;j++)
        		{
        			for(int k=0;k<q;k++)
        			{
        				c[i][j] = a[i][j] + b[i][j];
        			}
        		}
        	}
        	System.out.print("\nResultant Matrix:\n");
        	for(int i=0;i<m;i++)
        	{
        		for(int j=0;j<n;j++)
        		{
        			System.out.print(c[i][j]+"\t");
        		}
        		System.out.println();
        	} 
        	        	
        }
        else
        {
        	System.out.print("\nCannot Perform the operation since no of elements of Matrix A is not Eqaul with no of elements of Matrix B\n ");
        }
        
	}

}
