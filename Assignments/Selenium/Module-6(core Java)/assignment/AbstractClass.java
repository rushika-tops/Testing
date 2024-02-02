package assignment;

	

abstract class Parent {

	public abstract void message();

}

class FirstSubclass extends Parent {

	public void message() {

		System.out.println("This is first subclass");

	}
}

	class SecondSubclass extends Parent {

		public void message() {

			System.out.println("This is second subclass");

		}
	}

		 class Abc {
			public static  void main(String[] args) {
				FirstSubclass obj1 = new FirstSubclass();
				SecondSubclass obj2 = new SecondSubclass();
				obj1.message();
				obj2.message();
			}
		 }
		
	
	

