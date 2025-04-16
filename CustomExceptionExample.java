import java.util.Scanner;

// Custom Exception for Negative Values
class NegativeException extends Exception {
    public NegativeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            try {
                int value = scanner.nextInt();
                if (value < 0) {
                    throw new NegativeException("Negative values are not allowed: " + value);
                }
                arr[i] = value;
            } catch (NegativeException e) {
                System.out.println("Exception: " + e.getMessage());
                i--; // Decrement index to re-enter value
            }
        }
        
        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
