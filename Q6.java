//To add two numbers
import java.util.Scanner;
public class Q6
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
        System.out.println("Enter Two Integers : ");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	  
	    double  q = a/b;
	    
	    int r =a%b ;
	    System.out.println("Quotient : "+ q);
	    System.out.println("Remainder : "+ r);
		
	}
}
