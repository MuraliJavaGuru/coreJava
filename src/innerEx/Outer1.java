package innerEx;

//Member inner class

public class Outer1 {
	private int data = 30;

	public void print(){
		System.out.println(data);
	}
	
	class Inner {
		int age;
		void msg() {
			System.out.println("data is " + data);
		}
	}
}