package firstprogram;

import java.util.Scanner;

public class swap {
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		a=s.nextInt();
		System.out.println("enter b value");
		b=s.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping a="+a+" b="+b);
	}
}
