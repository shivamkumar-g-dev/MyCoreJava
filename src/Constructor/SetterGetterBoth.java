package Constructor;

class Person12 {

	private String name, gender;
	private int age, salary;

//	No-arg constructor
	public Person12() {
		System.out.println("Person12.Person(0)");
	}

//	Parameterized constructor
	public Person12(String name, int age, String gender, int salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		System.out.println("Person.Person(3)");
	}
	
	
	public int getSalary()
	{
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void print() {
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Gender is: " + gender);
		System.out.println("Salary is: " + salary);
		System.out.println();
	}

	public String getName() {
		return name;
	}

}

public class SetterGetterBoth{

	public static void main(String[] args) {

		Person12 ansh = new Person12("Ansh Kumar", 20, "male", 50000);
		System.out.println("Name is: "+ ansh.getName());
		System.out.println("--------------------------------------");

		Person12 vikas = new Person12("vikas Kumar", 20, "male", 70000);
		System.out.println("Name is: "+ vikas.getName());
		System.out.println("--------------------------------------");

		
		Person12 anoop = new Person12("Anoop", 30, "male", 50000);
		System.out.println("Name is: "+ anoop.getName());

		System.out.println("--------------------------------------");

		
		int sal = vikas.getSalary();
		
		System.out.println("Congrats!! You won 20% bonus of your salary....."+sal*.20);


	}

}