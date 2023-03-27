package pg33;

import java.util.Scanner;

public class matrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, p, q;
		System.out.println("Enter the num of rows & column of first matrix : ");
		m = sc.nextInt();
		n = sc.nextInt();
		int c, d, k, sum = 0;
		int first[][] = new int[m][n];
		System.out.println("Enter the element of first matrix : ");
		for (c = 0; c < m; c++) {
			for (d = 0; d < n; d++) {
				first[c][d] = sc.nextInt();
			}
		}
		System.out.println("Enter the num of rows & column of second matrix : ");
		p = sc.nextInt();
		q = sc.nextInt();
		if (n != p) {
			System.out.println("Matrices with entered order can't be multiplied with each other. ");
		} else {
			int second[][] = new int[p][q];
			int multiply[][] = new int[m][q];
			System.out.println("Enter the element of second matrix : ");
			for (c = 0; c < p; c++) {
				for (d = 0; d < q; d++) {
					second[c][d] = sc.nextInt();
				}
			}
			for (c = 0; c < m; c++) {
				for (d = 0; d < q; d++) {
					for (k = 0; k < p; k++) {
						sum = sum + first[c][k] * second[k][d];
					}
					multiply[c][d] = sum;
					sum = 0;
				}
			}
			System.out.println("Product of Enteted Matrices - ");
			for (c = 0; c < m; c++) {
				for (d = 0; d < q; d++) {
					System.out.print(multiply[c][d] + "\t");
					System.out.print("\n");
				}
			}
		}
	}

}
