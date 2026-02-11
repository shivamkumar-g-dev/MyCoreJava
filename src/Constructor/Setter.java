package Constructor;

class Persons11 {

	private String name, gender;
	private int age;

//	No-arg constructor
	public Persons11() {
		System.out.println("Person11.Person(0)");
	}

//	Parameterized constructor
	public Persons11(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("Persons11.Person(3)");
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age=age;	
	}
	
	public void print() {
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Gender is: " + gender);
		System.out.println();
	}

}

public class Setter {
	public static void main(String[] args) {

		Persons11 ansh = new Persons11("Ansh Kumar", 20, "male");
		ansh.print();

		Persons11 anoop = new Persons11("Anoop",41,"male");
		anoop.print();
		
		anoop.setName("Anoop Singh");
		ansh.setAge(22);
		
		anoop.print();
		ansh.print();

		System.out.println("OOPS_1.main()");

	}

}