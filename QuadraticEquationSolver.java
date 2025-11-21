import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a and b
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        // Quadratic equation is ax^2 + bx = 0
        // Simplify as: x(a*x + b) = 0

        if (a == 0 && b == 0) {
            System.out.println("Infinite number of solutions.");
        } else if (a == 0) {
            System.out.println("Linear equation, single root: x = 0");
        } else {
            // Roots can be x = 0 and x = -b/a
            System.out.println("Root 1: x = 0");

            double root2 = -b / a;
            System.out.println("Root 2: x = " + root2);

            // Describe the nature of the roots
            if (root2 > 0) {
                System.out.println("Roots are real and distinct.");
            } else if (root2 == 0) {
                System.out.println("Roots are real and equal.");
            } else {
                System.out.println("Roots are real (0) and the second root is negative.");
            }
        }

        scanner.close();
    }
}
