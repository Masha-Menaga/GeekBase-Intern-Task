import java.util.Scanner;

public class RemoveDuplicateChar {
    public static void main(String[] args){ 
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);

        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Check if current character is already in result
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
