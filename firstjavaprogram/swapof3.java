package firstjavaprogram;

import java.util.Scanner;

public class swapof3 {
	public static void main(String args[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		a=s.nextInt();
		System.out.println("enter b value");
		b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping a="+a+",b="+b);
	}
}
