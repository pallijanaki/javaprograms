package firstprogram;

import java.util.Scanner;

public class calculator {
	public static void main(String args[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Multiplication");
		System.out.println("3.Subtration");
		System.out.println("4.Division");
		System.out.println("enter your choice");
		int ch;
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
				System.out.println("addition is"+(a+b));
				break;
		case 2:
				System.out.println("multiplication is"+(a*b));
				break;
		case 3:
				System.out.println("subtraction is"+(a-b));
				break;
		case 4:
				System.out.println("Division is"+(a/b));
				break;
		default:
				System.out.println("out of the choice");
		}
	}

}
