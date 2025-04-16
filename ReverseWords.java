import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        // Call the method to reverse the words in the input string
        reverseWords(input);
        
        // Close the scanner
        scanner.close();
    }

    public static void reverseWords(String input) {
        // Split the input string into words using space as delimiter
        String[] words = input.split(" ");
        
        // Iterate over each word
        for (String word : words) {
            // Reverse the word and display it
            String reversedWord = new StringBuilder(word).reverse().toString();
            System.out.print(reversedWord + " ");
        }
    }
}
