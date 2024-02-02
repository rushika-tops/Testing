package assignment;

public class MaximumAndMinimumOfArray {
	public static void main (String[] args) {
/*	int a[] = { 23, 26, 89, 84, 65 };
int max = a[0];

	for(
	int i = 1;i<a.length;i++)
	{
		if (a[i] > max) {
			max = a[i];
		}

	}System.out.println("maximum value of array is:" +max);*/
		int a[] = {30,20,10,40,50};
		int min= a[0];
		for (int i=1;i<a.length;i++)
			{ 
			if (a[i] < min) {
				min =a[i];
			}
			
		}
		System.out.println("Minimum value  of array is :" +min);
		
}
}
