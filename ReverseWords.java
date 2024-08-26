import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

 
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        String result = reversedString.toString().trim();

       
        System.out.println("Oringinal String: " + input);
        
        System.out.println("Reversed String: " + result);


        scanner.close();
    }
}
