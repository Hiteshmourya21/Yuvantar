//To add two numbers
import java.util.Scanner;
import java.lang.Math;

public class Q7
{
    
    public void Triangle(int a ,int b,int c){
         double s  = (a+b+c)/2;
         double ar = s*(s-a)*(s-b)*(s-c);
         System.out.println("Area of Triangle : "+ Math.pow(ar,0.5));
    }
    public void Circle(int r ){
        
         System.out.println("Area of Circle : "+ (3.14*r*r));
    }
    
    public void Rectangle(int a ,int b){

         System.out.println("Area of Rectagle : "+ (a*b));
    }
    
    
    public void Square(int r ){
        
         System.out.println("Area of Square : "+ (r*r));
    }
    
    public void Parallelogram(int a ,int b){

         System.out.println("Area of Parallelogram : "+ (a*b));
    }
    
    public void Ellipse(int a ,int b){

         System.out.println("Area of Ellipse : "+ (3.14*a*b));
    }
    
	public static void main(String[] args) {
	    Q7 ob = new Q7(); 
	    Scanner sc = new Scanner(System.in);
	    int x;
	    do{
        System.out.println("\nEnter choice : ");
        System.out.println("1. Triangle ");
        System.out.println("2. Circle ");
        System.out.println("3. Rectangle ");
        System.out.println("4. Square ");
        System.out.println("5. Parallelogram ");
        System.out.println("6. Ellipse ");
        System.out.println("7. Exit ");
        
	    x = sc.nextInt();
	    
	    switch(x){
	        case 1:
	            System.out.println("\nEnter side of Triangle : ");
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            int c = sc.nextInt();
	            ob.Triangle(a,b,c);
	            break;
	       case 2:
	            System.out.println("\nEnter radius of cicle : ");
	            int r = sc.nextInt();
	            ob.Circle(r);
	            break;
	        case 3:
	             System.out.println("\nEnter side of Rectangle : ");
	             a = sc.nextInt();
	             b = sc.nextInt();
	            ob.Rectangle(a,b);
	            break;
	       case 4:
	           System.out.println("\nEnter side of Square : ");
	             a = sc.nextInt();
	            ob.Square(a);
	            break;
	       case 5:
	             System.out.println("\nEnter base  of Parallelogram : ");
	             a = sc.nextInt();
	             System.out.println("\nEnter height  of Parallelogram : ");
	             b = sc.nextInt();
	            ob.Parallelogram(a,b);
	            break;
	       case 6:
	             System.out.println("\nEnter Major axis  of Ellipse : ");
	             a = sc.nextInt();
	             System.out.println("\nEnter Minor axis  of Ellipse : ");
	             b = sc.nextInt();
	            ob.Ellipse(a,b);
	            break;
	       case 7:
	            System.out.println("\nExiting.....");
	            break;
	       default:
	            System.out.println("\nInvalid ");
	    }
	    }while(x!=7);
	}
}
