package pg8;

import java.math.BigInteger;
import java.util.Scanner;

public class addBignumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String num1, num2;
		System.out.println("Enter the 1st number : ");
		num1 = sc.nextLine();
		System.out.println("Enter the 2nd number : ");
		num2 = sc.nextLine();
		BigInteger first = new BigInteger(num1);
		BigInteger second = new BigInteger(num2);
		BigInteger sum;
		sum = first.add(second);
		System.out.println("Sum is " + sum );
		sc.close();
	}

}
