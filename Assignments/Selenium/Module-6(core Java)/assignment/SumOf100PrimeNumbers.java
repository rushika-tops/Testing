package assignment;

public class SumOf100PrimeNumbers {
	public static void main(String[] args) {
		int n=100;
		int sum=0;
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=1; j<=n;j++) {
				if(i%j==0) {
					count++;
					
				}
				
			}
			if(count==2) {
				sum+=i;
			}
		}
		System.out.println("sum of 100 prime number is : "+sum);
	}

}
