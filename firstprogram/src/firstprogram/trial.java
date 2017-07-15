package firstprogram;
import java.util.Scanner;
public class trial {
		
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string");
        String s=scan.next();
        
        System.out.println("enter double");
        double d=scan.nextDouble();
        System.out.println("enter number");
        int i = scan.nextInt();
        
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
