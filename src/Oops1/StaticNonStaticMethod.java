package Oops1;

class Practice {
//	Instance Var
	int id;
//	Static var
	static String name;

	public void m1() {
		s2();
		m2();
		System.out.println(id);
		System.out.println(name);
		System.out.println("Practice.m1()");
	}

	public void m2() {
		System.out.println("Practice.m2()");
	}

	public static void s1() {
		s2();
		//m2();
		//System.out.println(id);
		System.out.println(name);
		System.out.println("Practice.s1()");
	}

	public static void s2() {
		System.out.println("Practice.s2()");
	}

}

public class StaticNonStaticMethod {

	public static void main(String[] args) {

	}

}