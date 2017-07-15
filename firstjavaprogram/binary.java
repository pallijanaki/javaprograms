package firstjavaprogram;
import java.util.*;
public class binary {
	public static void main(String args[])
	{
		int a,cof=0,rem=0;
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		
		while(a>0)
		{
			if(a%10==0 || a%10==1)
				cof++;
				rem++;
				a=a/10;
		}
		if(rem==cof)
			System.out.println("binary number");
		else
			System.out.println("not a binary number");
			
	}
}
