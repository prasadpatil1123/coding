package pg19;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Take Input from user: ");
		while ((n = sc.nextInt()) != 0) {
			System.out.println("You entered : " + n);
			System.out.println();
			System.out.println("Take Input from user: ");

		}
		System.out.println("Out of Loop");
		sc.close();
	}

}
