package javapackage;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter the Value : ");
		int n = Input.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}
	}
}
