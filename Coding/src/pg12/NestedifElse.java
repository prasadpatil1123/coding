package pg12;

import java.util.Scanner;

public class NestedifElse {

	public static void main(String[] args) {
	int passingmarks,marksobtained;
	passingmarks = 40;
	char grade;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your marks : ");
	marksobtained = sc.nextInt();
	if(marksobtained > passingmarks) {
		if(marksobtained > 90) {
			grade = 'A';
			System.out.println("You are passed and your grade is " + grade);
			
		} else if(marksobtained > 75) {
			grade = 'B';
			System.out.println("You are passed and your grade is " + grade);
		} else if(marksobtained > 60) {
			grade = 'C';
			System.out.println("You are passed and your grade is " + grade);
		} else {
			grade = 'D';
			System.out.println("You are passed and your grade is " + grade);
		}
	}
	else {
		grade = 'F';
		System.out.println("You are failed and your grade is " + grade);
	}
	sc.close();
	}

}
