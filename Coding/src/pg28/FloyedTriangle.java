package pg28;

public class FloyedTriangle {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 4; i++) {
			for (int c = 1; c <= i; c++) {
				count = count + 1;
				System.out.print(count + " ");
			}
			System.out.println();
		}

	}

}
