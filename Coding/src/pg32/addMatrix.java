package pg32;

public class addMatrix {

	public static void main(String[] args) {
		int m1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int m2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum[][] = new int[3][3];
		System.out.println("Element of First Matrix : ");
		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Element of Second Matrix : ");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Addition of two Matrix : ");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				sum[i][j] = m1[i][j] + m2[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
//		for (i = 0; i < 3; i++) {
//			for (j = 0; j < 3; j++) {
//			}
//			System.out.println();
//		}

	}

}
