package pg4;

import java.util.Scanner;

public class getInputFromUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			int a;
			float b;
			String str;
			
			System.out.println("Enter Int number : ");
			a = sc.nextInt();
			System.out.println("Integer value is "+a);
			
			System.out.println("Enter Float Number : ");
			b = sc.nextFloat();
			System.out.println("Float Value is : "+ b);

			System.out.println("Entet the String : ");

			while(sc.hasNext()) {
				str = sc.nextLine();
			System.out.print(str);
			}
			sc.close();
		
		
	}

}
