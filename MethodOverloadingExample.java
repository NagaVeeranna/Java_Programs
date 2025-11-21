public class MethodOverloadingExample {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();

        // Calling overloaded methods
        System.out.println(obj.add(5, 10)); // Calls add(int, int)
        System.out.println(obj.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println(obj.add(2.5, 3.7)); // Calls add(double, double)
        System.out.println(kobj.add("Hello, ", "World!")); // Calls add(String, String)
    }
}
