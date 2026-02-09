package Oops1;

class Person1 {

	private String name, gender;
	private int age;

//	No-arg constructor
	public Person1() {
		System.out.println("Person.Person(0)");
	}

//	Parameterized constructor
	public Person1(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("Person.Person(3)");
	}

	public void print() {
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Gender is: " + gender);
		System.out.println();
	}

}

public class constructor_example {

	public static void main(String[] args) {

		Person1 ansh = new Person1("Ansh Kumar", 20, "male");
		ansh.print();
		
		Person1 vikas = new Person1("vikas Kumar", 20, "male");
		vikas.print();

		Person1 anoop = new Person1("Anoop", 30, "male");
		anoop.print();

		Person1 anurag = new Person1("Anoop", 30, "male");
		anurag.print();

		Person1 vinay = new Person1("Vinay", 32, "male");
		vinay.print();

		System.out.println("constructor_example.main()");

	}

}