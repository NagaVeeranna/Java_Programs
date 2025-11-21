public class GCD {
    // Recursive function to calculate GCD
    public static int gcd(int a, int b) {
        // Base case: if b is 0, the GCD is a
        if (b == 0) {
            return a;
        }
        // Recursive case: call the gcd function with b and a % b
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 98;

        // Compute and print GCD of num1 and num2
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}
