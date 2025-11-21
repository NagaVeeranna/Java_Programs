import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] freq = new int[10]; 

        
        System.out.print("Enter a string: ");
        String str = scanner.next();

        
       	 for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                freq[ch - '0']++; 
            }
        }

       
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            System.out.print(freq[i]); 
        }

        scanner.close();
    }
}