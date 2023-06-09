package pg26;

import java.util.Scanner;

public class primeNum {

	public static void main(String[] args) {
		int n, count, num = 3;

		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the number : ");
			n = s.nextInt();
			if (n >= 1) {
				System.out.println("First " + n + "prime numbers are :");
				System.out.println(2);
			}

			for (count = 2; count <= n;) {
				boolean isPrime = true;
				for (int j = 2; j <= Math.sqrt(num); j++) {
					if (num % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.println(num);
					count++;
				}
				num++;
			}
			s.close();
		}
	}

}
