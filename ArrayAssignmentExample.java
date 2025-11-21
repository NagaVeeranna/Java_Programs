public class ArrayAssignmentExample {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Assigning the reference of originalArray to newArray
        int[] newArray = originalArray;

        // Printing both arrays before modification
        System.out.println("Original Array before modification: ");
        printArray(originalArray);

        System.out.println("New Array before modification: ");
        printArray(newArray);

        // Modifying newArray
        newArray[0] = 99;

        // Printing both arrays after modification
        System.out.println("\nOriginal Array after modification: ");
        printArray(originalArray);

        System.out.println("New Array after modification: ");
        printArray(newArray);
    }

    // Method to print the array elements
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
