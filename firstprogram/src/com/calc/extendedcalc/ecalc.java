package com.calc.extendedcalc;
import java.util.Scanner;
import com.calc.maincalc.*;
import com.calc.simplecalc.*;
public class ecalc extends simplec{
	public static void main(String args[])
	{
		int c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();
		 System.out.println("enter third number");
			c=s.nextInt();
		 mainc m=new mainc();
		    m.menu();
		    System.out.println("enter your choice");
	     int ch=s.nextInt();
	     simplec sc=new simplec();
	    if(ch==1)
	    {
	    	sc.add();
	    	System.out.println("addition of 3 numbers is:"+(a+b+c));
	    }
	    else
	    {
	        sc.sub();
	        System.out.println("subtraction of 3 numbers is:"+(a-b-c));
	    }
	    }
}
