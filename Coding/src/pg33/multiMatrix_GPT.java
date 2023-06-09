package pg33;

import java.util.Scanner;

public class multiMatrix_GPT {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Read matrix A from user input
		System.out.print("Enter number of rows and columns of matrix A: ");
		int rowsA = scanner.nextInt();
		int colsA = scanner.nextInt();
		int[][] A = readMatrix(scanner, rowsA, colsA);

		// Read matrix B from user input
		System.out.print("Enter number of rows and columns of matrix B: ");
		int rowsB = scanner.nextInt();
		int colsB = scanner.nextInt();
		int[][] B = readMatrix(scanner, rowsB, colsB);

		// Multiply matrices A and B
		int[][] C = multiplyMatrices(A, B);

		// Print result matrix C
		System.out.println("Result matrix:");
		printMatrix(C);

		scanner.close();
	}
	// Reads a matrix from user input
	public static int[][] readMatrix(Scanner scanner, int rows, int cols) {
		int[][] matrix = new int[rows][cols];
		System.out.println("Enter matrix elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		return matrix;
	}
	// Multiplies two matrices and returns the result
	public static int[][] multiplyMatrices(int[][] A, int[][] B) {
		int rowsA = A.length;
		int colsA = A[0].length;
		int rowsB = B.length;
		int colsB = B[0].length;
		if (colsA != rowsB) {
			throw new IllegalArgumentException("Matrices cannot be multiplied");
		}
		int[][] C = new int[rowsA][colsB];
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsB; j++) {
				int sum = 0;
				for (int k = 0; k < colsA; k++) {
					sum += A[i][k] * B[k][j];
				}
				C[i][j] = sum;
			}
		}
		return C;
	}
	// Prints a matrix to standard output
	public static void printMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
