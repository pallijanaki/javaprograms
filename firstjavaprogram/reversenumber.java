package firstjavaprogram;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n,rev=0;
			System.out.println("enter a number");
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			while(n>0)
			{
				rev=rev*10;
				rev=rev+(n%10);
				n=n/10;
			}
			System.out.println("reverse is"+rev);
	}

}
