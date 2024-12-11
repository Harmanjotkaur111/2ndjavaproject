package palindrome;

 import java.util.Scanner;

	public class PalindromeChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter a word
	        System.out.print("Enter a word: ");
	        String word = scanner.nextLine();
	        
	        // Check if the word is a palindrome
	        if (isPalindrome(word)) {
	            System.out.println(word + " is a palindrome!");
	        } else {
	            System.out.println(word + " is not a palindrome.");
	        }
	        
	        scanner.close();
	    }

	    public static boolean isPalindrome(String word) {
	        // Remove spaces and convert to lowercase for uniformity
	        word = word.replaceAll("\\s+", "").toLowerCase();
	        
	        // Initialize pointers
	        int left = 0;
	        int right = word.length() - 1;
	        
	        // Check characters from both ends
	        while (left < right) {
	            if (word.charAt(left) != word.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        
	        return true;
	    }
	}
