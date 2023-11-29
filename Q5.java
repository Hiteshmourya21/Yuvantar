//To add two numbers
import java.util.Scanner;
public class Q5
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
        System.out.println("Enter Principle AMount : ");
	    int p = sc.nextInt();
	    System.out.println("Enter Rate of interest in %: ");
	    int r = sc.nextInt();
	    System.out.println("Enter time in years : ");
	    double t = sc.nextDouble();
	    
	    double si =(p*r*t)/100 ;
	    System.out.println("Simple interest : "+ si);
		
	}
}
