package firstprogram;

import java.util.Scanner;

public class matrix {
	public static void main(String args[])
	{
		int[][] a= new int[2][2];
		int[][] b= new int[2][2];
		int[][] c= new int[2][2];
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first matrix");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("enter second matrix");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		System.out.println("matrix addition is:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]);
			}
		}
		
	}

}
