package pg32;

public class MatrixAddition {

	public static void main(String[] args) {
		int[][] firstmatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] secondmatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] result = new int[firstmatrix.length][secondmatrix.length];

		for (int a = 0; a < firstmatrix.length; a++) {
			for (int b = 0; b < secondmatrix.length; b++) {
				result[a][b] = firstmatrix[a][b] + secondmatrix[a][b];
			}
		}
		// return result ;
		System.out.println("Result : ");
		for (int[] row : result) {
			for (int element : row) {
				System.out.print("" + element + " ");
			}
			System.out.println();
		}
	}

}
