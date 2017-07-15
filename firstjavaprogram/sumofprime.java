package firstjavaprogram;

import java.util.Scanner;

public class sumofprime {
	public static void main(String args[])
	{
		int n,i,sum=0,j;
		System.out.println("enter n value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=2;i<n;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(n%j!=0)
				{
					sum=sum+n;
				}
			}
			--n;
		}
		System.out.println("sum is:"+sum);
	}
}
