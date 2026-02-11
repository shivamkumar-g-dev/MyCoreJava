package Constructor;

class Persons {

	private String name, gender;
	private int age;

//	No-arg constructor
	public Persons() {
		System.out.println("Person.Person(0)");
	}

//	Parameterized constructor
	public Persons(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("Persons.Person(3)");
	}

	public void print() {
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Gender is: " + gender);
		System.out.println();
	}

}

public class arg_nonArg {

	public static void main(String[] args) {

		Persons ansh = new Persons("Ansh Kumar", 20, "male");
		ansh.print();

		Persons anoop = new Persons();
		anoop.print();

		System.out.println("OOPS_1.main()");

	}

}