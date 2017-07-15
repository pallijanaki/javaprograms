package firstprogram;

import java.util.Scanner;

public class five {
	public static void main(String args[])
	{
		int a,b,c,d,e,sum;
		Scanner s=new Scanner(System.in);
		System.out.println("enter 5 numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		e=s.nextInt();
		sum=a+b+c+d+e;
		System.out.println("sum is "+sum);
	}
}
