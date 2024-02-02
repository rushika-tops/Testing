package assignment;
import java.util.*;

public class InsertionInArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		
		int n =sc.nextInt();
		System.out.println("Enter the elements of array : ");
		int a[] = new int [n+1];
		for (int i=0; i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter the new  element you want to insert: ");
		int z = sc.nextInt();
		System.out.println("Enter the position in which  you want to insert element : ");
		int pos = sc.nextInt();
		for(int i=n;i>=pos;i--)
		{
		a[i]=a[i-1];
		}
		a[pos-1]=z;
		for(int i=0;i<=n;i++)
		{
			System.out.println( a[i]);
		}

}
}