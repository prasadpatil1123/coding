package pg13;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		n = sc.nextInt();
		if(n%2 == 0) {
			System.out.println("Given nymber is Even.");
		}else {
			System.out.println("Given Number is Odd.");
		}
		sc.close();
	}

}
