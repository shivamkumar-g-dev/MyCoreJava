package Oops1;

class Overloading{
	
	private String name , address;
	private int age;
	
	public Overloading() {
		System.out.println("Overloading.Overloading()");
	}
	
	public Overloading(String name) {
		this();
		this.name = name;
		System.out.println("Overloading.Overloading(1)");
	}
	
	public Overloading(String name,String address) {
		this(name);
		this.address = address;
		System.out.println("Overloading.Overloading(2)");
	}
	
	public Overloading(String name,String address, int age) {
		this(name,address);
		this.age = age;
		System.out.println("Overloading.Overloading(3)");
	}
	
	public void print() {
		System.out.println("My name is: " + name);
		System.out.println("Address: " + address);
		System.out.println("My age is: " + age);
		System.out.println("-------------Call--------");
	}
}

public class MyOverloading {

	public static void main(String[] args) {
		Overloading c1 = new Overloading("Avya","Noida",22);
		c1.print();
	}

}