package firstjavaprogram;

import java.util.Scanner;

public class biggestdigitinanumber {
	public static void main(String args[])
	{
		int n,ln,sn,b;
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		ln=sn=n%10;
		while(n!=0)
		{
			b=n%10;
			n=n/10;
			if(b>ln)
				ln=b;
			if(b<sn)
				sn=b;
		}
		System.out.println("largest number is:"+ln+"smallest number is:"+sn);
	}

}
