package evision;

import java.util.Scanner;

public class FactorialOfGivenNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("Factorial is not efined for negative numbers.");
		} else {

			System.out.println("Factorial of given number is = " + calculateFactorial(num));
		}
	}

	private static int calculateFactorial(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		return fact;
	}
}
