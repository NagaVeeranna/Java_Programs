import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        // Input the elements of the array
        int[] arr = new int[n];
        System.out.println("Enter the elements (sorted in ascending order):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(arr, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found in the list.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }

    // Method to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is smaller, ignore the right half
            if (arr[mid] > target) {
                right = mid - 1;
            } else { // If target is larger, ignore the left half
                left = mid + 1;
            }
        }

        // If we reach here, the element was not found
        return -1;
    }
}
