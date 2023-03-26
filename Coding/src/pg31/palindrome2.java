package pg31;

import java.util.Scanner;

public class palindrome2 {

	public static void main(String[] args) {

		try (Scanner var = new Scanner(System.in)) {
			System.out.println("Enter the string for check it is Palindrome or Not : ");
			String input = var.nextLine();
			int i;
			int length = input.length();
			int begin = 0;
			int end = length - 1;
			int middle = (begin + end) / 2;

			for (i = begin; i < end; i++) {
				if (input.charAt(begin) == input.charAt(end)) {
					begin++;
					end--;
				} else {
					break;
				}
			}
			
			if (i == middle-1 ) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not a Palindrome");

			}
			var.close();
		}
	}

}
