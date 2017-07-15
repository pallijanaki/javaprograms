package firstjavaprogram;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,key;
		System.out.println("enter n value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("enter values");
		int a[]=new int [n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter key");
		key=s.nextInt();
		for(i=0;i<n;i++)
		{
		if(key==a[i])
		{
			System.out.println("key is at position"+i);
		}
		else
		{
			System.out.println("not found");
		}
		}
	}

}
