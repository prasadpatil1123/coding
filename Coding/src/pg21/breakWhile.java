package pg21;

import java.util.Scanner;

public class breakWhile {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		while(true) {
			System.out.println("Enter the number : ");
			n = sc.nextInt();
			if(n == 0) {
				System.out.println("Your game is Over.");
				break;
			}
			System.out.println("Your number is " + n);
			System.out.println();
			}
		sc.close();

	}

}
