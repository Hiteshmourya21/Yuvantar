//To add two numbers
import java.util.Scanner;
public class Q3
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
        System.out.println("Enter Two Integer : ");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
		System.out.println("Before Swapping : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	    int c = a;
	    a=b;
	    b=c;
	    System.out.println("After Swapping : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
