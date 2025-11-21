import java.util.Scanner;
class Sample 
{ 
 public static void main(String[] args) 
 { 
  	Scanner sc = new Scanner(System.in);  
  	System.out.println("Enter the coefficient of a: "); 
  	double a = sc.nextInt(); 
  	System.out.println("Enter the coefficient of b: "); 
  	double b = sc.nextInt(); 
  	System.out.println("Enter the coefficient of c: "); 
  	double c = sc.nextInt(); 
  	double d = b * b - 4 * a *c; 
 		if (d == 0) 
 		{ 
  			double root1 = -b / (2 * a); 
  			System.out.println("Real and equal roots are :"+ root1); 
		} 
 else if(d > 0) 
 { 
  double root2 = (-b + Math.sqrt(d)) / (2*a); 
  double root3 = (-b - Math.sqrt(d)) / (2*a); 
  System.out.println("Real root is:" + root2); 
  System.out.println("Distinct root is:" + root3); 
 } 
 else 
 { 
  double realPart = -b /(2 * a); 
  double imaginaryPart = Math.sqrt(-d) / (2*a); 
  System.out.println("Real part is:" +"+i" + realPart); 
  System.out.println("Imaginary part is:" +"+i" + 
imaginaryPart); 
 } 
 } 
} 
 
