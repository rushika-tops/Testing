package assignment;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first Number : ");
		int n1 = scan.nextInt();

		System.out.print("Enter second Number : ");
		int n2 = scan.nextInt();

		System.out.print("Enter third Number : ");
		int n3 = scan.nextInt();

		if (n1 > n2)
			if (n1 > n3)
				System.out.print(" The largest number is " + n1);
		if (n2 > n1)
			if (n2 > n3)
				System.out.print(" The largest number is " + n2);

		if (n3 > n1)
			if (n3 > n2)
				System.out.print(" The largest number is " + n3);

	}
}
