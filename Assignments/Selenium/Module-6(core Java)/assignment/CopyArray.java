package assignment;
                //using clone method :
public class CopyArray {
	public static void main(String[] args) {
		int num1[] = { 10, 20, 30, 40, 50 };
		int num2[] = num1.clone();

		System.out.println("Array num1 [] ");
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");

		}
		System.out.println("\n\nArray num2[] ");

		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
	}
}
