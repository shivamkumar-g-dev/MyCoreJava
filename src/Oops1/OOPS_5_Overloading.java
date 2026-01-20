package Oops1;

class OverLoading {

	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public void add(int a, double b) {
		System.out.println(a + b);
	}

	public void add(double a, double b) {
		System.out.println(a + b);
	}

	public void add(double a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void add(int a, char b, int c) {
		System.out.println(a + b + c);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
public class OOPS_5_Overloading {
	public static void main(String[] args) {
		OverLoading o1 = new OverLoading();
		o1.add(2, 3.30);
		o1.add(2.2, 3.30);
		o1.add(2.2, 3, 30);
		o1.add(2, 2, 330);
		o1.add(22, 3.30);
		o1.add(22, 3, 30);
		o1.add(2.2, 4, 330);
	}
}