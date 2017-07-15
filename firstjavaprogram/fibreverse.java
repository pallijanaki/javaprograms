package firstjavaprogram;

import java.util.Scanner;

public class fibreverse {
	public static void main(String args[])
	{
		int n,n1=0,n2=1,fib;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		n=sc.nextInt();
		System.out.print(n1+" "+n2);
		for(i=n-1;i>=0;i--)
		{
			fib=n1+n2;
			n1=n2;
			n2=fib;
			System.out.print(" "+fib);
		}
		
	}
}
