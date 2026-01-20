package Oops1;

class MyClas  {
	int n = 100;
}

class MyChildClass extends MyClas {
	int n = 300;
	public void m1()
	{
		int n = 333;
		System.out.println(n);
		System.out.println(this.n);
		System.out.println(super.n);
	}
}

public class OOPS_5_Object {
	public static void main(String[] args) {
		MyChildClass child = new MyChildClass();
		child.m1();
	}
}