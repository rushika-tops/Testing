package assignment;

import java.util.Scanner;

public class IndexFind {
	public static void main(String[] args) {
		int a[] = new int[3];
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of array : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter one of any element from array: ");
		int value = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				index = i;
			}
		}
		{
			System.out.print(index);

		}

	}
}
