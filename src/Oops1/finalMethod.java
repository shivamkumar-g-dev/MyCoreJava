package Oops1;

/*
class MyClass2  {
// without final
//	Java Constants
	public  static  String compName = "HCL";	
}

public class finalMethod {
	public static void main(String[] args) {
		MyClass2 m1 = new MyClass2();	
		System.out.println(m1.compName);
		m1.compName = "TCS";
		System.out.println(m1.compName);
	}
}*/

class MyClass2  {
	// without final
//		Java Constants
		public  static final String compName = "HCL";	
	}

	public class finalMethod {
		public static void main(String[] args) {
			MyClass2 m1 = new MyClass2();	
			System.out.println(m1.compName);
			System.out.println(m1.compName);
		}
	}