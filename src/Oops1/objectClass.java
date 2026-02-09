package Oops1;

class MyClass  {

	public String m1() {
		System.out.println("MyClass.m1()");
		return "Guest";
	}

}

public class objectClass {

	public static void main(String[] args) {
		MyClass m = new MyClass();

		System.out.println(m.m1());
		System.out.println("m : " + m);
		System.out.println("m.toString() : "+m.toString());
	}

}