package Oops1;

class A {

	public void m1() {
		System.out.println("A.m1()");
	}

	public void m2() {
		System.out.println("A.m2()");
	}

	public void m3() {
		System.out.println("A.m3()");
	}

	public void m4() {
		System.out.println("A.m4()");
	}

}

class B extends A {
	
	public void m5()
	{
		System.out.println("B.m5()");
	}
	public void m6()
	{
		System.out.println("B.m6()");
	}

}

public class inheritance_exampled {

	public static void main(String[] args) {

		A a = new A();
		a.m1();
		a.m2();
		a.m3();
		a.m4();

		System.out.println("----------------");
		B b = new B();

		b.m1();
		b.m2();
		b.m3();
		b.m4();
		b.m5();
		b.m6();
	}

}