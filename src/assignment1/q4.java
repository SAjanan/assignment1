package assignment1;

import java.util.*;

public class q4 {

	public static void main(String[] args) {
		String original,reverse = " ";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String/Number to check if it is a palindrome");
		
		original = in.nextLine();
		int length = original.length();
		for (int i = length- 1 ; i>=0; i--) 
			
			reverse = reverse + original.charAt(i);
		if 
		(original.equals(reverse))
			System.out.println("Entered String/Number is a palindrome");
		else
			System.out.println("Entered String/Number is not a palindrome");
			
		
		

	}

}
