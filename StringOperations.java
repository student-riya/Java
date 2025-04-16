public class StringOperations {

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Method to convert all lowercase letters to uppercase
    public static String convertToUppercase(String str) {
        return str.toUpperCase();
    }

    // Method to find the length of the string
    public static int findLength(String str) {
        return str.length();
    }

    // Method to print the first and last characters of the string
    public static void printFirstAndLastCharacter(String str) {
        if (str.length() > 0) {
            System.out.println("First character: " + str.charAt(0));
            System.out.println("Last character: " + str.charAt(str.length() - 1));
        }
    }

    // Method to print the initial characters of each word in the string
    public static void printInitialCharacters(String str) {
        String[] words = str.split("\\s+");
        StringBuilder initials = new StringBuilder();
        for (String word : words) {
            initials.append(word.charAt(0));
        }
        System.out.println("Initials: " + initials.toString());
    }

    // Method to check whether the string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        String inputString = "Amit Kumar";

        // Reverse the string
        System.out.println("Reversed String: " + reverseString(inputString));

        // Convert all lowercase letters to uppercase
        System.out.println("Uppercase String: " + convertToUppercase(inputString));

        // Find the length of the string
        System.out.println("Length of String: " + findLength(inputString));

        // Print the first and last characters of the string
        printFirstAndLastCharacter(inputString);

        // Print the initial characters of the words
        printInitialCharacters(inputString);

        // Check if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }
}
