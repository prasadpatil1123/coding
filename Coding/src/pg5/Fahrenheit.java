package pg5;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		
		float temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fahrenheit Temp : ");
		float f = sc.nextFloat();
		
		temp = ((f - 32)*5)/9;
		System.out.println("Given Temp is : " + temp );
		
		sc.close();
	}

}
