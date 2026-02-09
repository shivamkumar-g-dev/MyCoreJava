package Oops1;

class Person8 {
	
//	Instance - Variables
	String name, gender;
	int age;

//	Instance - Methods
	public void run() {
		System.out.println("Person8.run()");
	}

	public void eat() {
		System.out.println("Person8.eat()");
	}

	public void sleep() {
		System.out.println("Person8.sleep()");
	}
	
	public void print()
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Gender is: "+gender.length());
		System.out.println();
	}

}

public class Reference_variable {

	public static void main(String[] args) {
//		Var declaration
		Person8 ansh;//--> Reference variable
		int n;
		
		n = 10;
		ansh = new Person8();
		ansh.name="Ansh Kumar";
		ansh.age=33;
		ansh.gender="Male";
		ansh.print();
		
	}

}