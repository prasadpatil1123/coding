package pg6;

import java.util.Scanner;

public class swapNumber {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b value respectively : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Before swapping \n a = " + a + "\n b = " + b );
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping \n a = " + a + "\n b = " + b );
		sc.close();
	}

}
