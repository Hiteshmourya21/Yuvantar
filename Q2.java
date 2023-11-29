//To add two numbers
import java.util.Scanner;
public class Q2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int s = 0;
	    for(int i=1;i<=5;i++){
	        System.out.println("Enter Integer "+i);
	         int a = sc.nextInt();
	        s +=a;
	    }
	    
	    double avg = s/5;
		System.out.println("Average : "+ avg);
	}
}
