package palindrome;

	import java.util.Scanner;

	public class StringReverse {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Reverse the string
	        String reversed = reverseString(input);

	        // Display the reversed string
	        System.out.println("Reversed string: " + reversed);

	        scanner.close();
	    }

	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder();

	        // Loop through the string from end to start
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed.append(str.charAt(i));
	        }

	        return reversed.toString();
	    }
	}
