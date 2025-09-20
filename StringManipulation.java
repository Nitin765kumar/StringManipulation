import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String lowerInput = input.toLowerCase();

        // Step 2: Reverse string using StringBuilder
        StringBuilder sb = new StringBuilder(lowerInput);
        String reversed = sb.reverse().toString();

        // Step 3: Count vowels and consonants
        int vowels = 0, consonants = 0;
        for (char ch : lowerInput.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Step 4: Check palindrome
        boolean isPalindrome = lowerInput.equals(new StringBuilder(lowerInput).reverse().toString());

        // Step 5: Print results
        System.out.println("\n===== Results =====");
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Palindrome: " + (isPalindrome ? "Yes" : "No"));

        sc.close();
    }
}
