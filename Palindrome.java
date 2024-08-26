import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Check if the input string is a palindrome
        boolean result = isPalindrome(input);

        // Print the result
        if (result) {
            System.out.println("TRUE: The given text is a palindrome.");
        } else {
            System.out.println("FALSE: The given text is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    public static boolean isPalindrome(String s) {
        // Create a StringBuilder to filter and reverse the string
        StringBuilder filteredString = new StringBuilder();

        // Filter out non-alphanumeric characters and convert to lowercase
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(Character.toLowerCase(c));
            }
        }

        // Create a reversed version of the filtered string
        String reversed = filteredString.reverse().toString();

        // Compare the original filtered string with its reversed version
        // We need to reverse the filteredString back to its original state for comparison
        return filteredString.reverse().toString().equals(reversed);
    }
}