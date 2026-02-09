package Oops1;

class Test {
	static int id =101;
	String name = "Guest";
	
	public void m1() {
		m2();
		s1();
		System.out.println("name: " + name);
		System.out.println("id: " + id);
	}

	public static void m2() {
		
	}

	public void s1() {
		s2();
		m2();
		System.out.println("name: " + name);
		System.out.println("id: " + id);
	}

	public static void s2() {
		System.out.println("Animal.sleep()");
	}
}


public class staticMethod {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}