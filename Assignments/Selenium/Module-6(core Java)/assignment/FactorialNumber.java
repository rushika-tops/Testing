package assignment;

import java.util.Scanner;

public class FactorialNumber {
	public static void main (String[] args) {
		int n , fact =1;
		System.out.println("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		for (int i=1; i<=n; i++)
		{
			fact = fact*i;
			
		}
		System.out.print("factorial of given number is "   +  fact);
	}

}
