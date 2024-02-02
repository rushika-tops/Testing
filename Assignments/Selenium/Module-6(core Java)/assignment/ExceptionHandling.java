package assignment;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a, b, c = 0;
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println(" enter the the you want to divide : ");
			int n1 = sc.nextInt();
			System.out.println(" enter the by which you want to divide n1 : ");
			int n2 = sc.nextInt();
			c = n1 / n2;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by 0 ");
			
		}

	}
}
