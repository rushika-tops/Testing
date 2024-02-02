package assignment;

public class MultipleCatchBlock {
	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by 0 ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("given value of index is  out of limit");
		} catch (Exception e) {
			System.out.println("Something  went Wrong..");
		}
		System.out.println("furthur code continue..");
	}

}
