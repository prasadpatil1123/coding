package pg31;

import java.util.Scanner;

public class palinDrome {

	public static void main(String[] args) {

		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string for check it is Palindrome or Not : ");
		original = sc.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		sc.close();
	}

}
