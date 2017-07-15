package firstjavaprogram;

import java.util.Scanner;

public class bignsmallnoinarray {

	public static void main(String args[])
	{
		int n,i,max,min;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter values");
		for(i=0;i<n;i++)
		{
			a[n]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>a[i+1])
			{
				max=a[i];
			}
			else
				min=a[i];
		}
		System.out.println("max is:"+max+"min is:"+min);
	}
}
