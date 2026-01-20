package Oops1;



class ConstructorOverloading1 {
	
	private int id;
	private String name, Address;
	
	public ConstructorOverloading1() {
		System.out.println("ConstructorOverloading.-ConstructorOverloading()");
		
	}
	
	public ConstructorOverloading1(String name) {
		this();
		this.name = name;
		System.out.println("ConstructorOverloading.-ConstructorOverloading(1)");
		
	}
	
	public ConstructorOverloading1(String name,String Address) {
		this(name);
		this.Address = Address;
		System.out.println("ConstructorOverloading.-ConstructorOverloading(2)");
		
	}
	
	public ConstructorOverloading1(String name,String Address,int id) {
		this(name, Address);
		this.id = id;
		System.out.println("ConstructorOverloading.-ConstructorOverloading(3)");
		
	}

	public void print() {
		System.out.println("Name is:" + name);
		System.out.println("Address is:" + Address);
		System.out.println("id is:" + id);
		
		System.out.println("----------------------------------------------------------------------");



	}

}

public class ConstructorOverloading {
	public static void main(String[] args) {
		ConstructorOverloading1 c1 = new ConstructorOverloading1("Shivam", "Noida", 220);
		c1.print();
	}
}