package Oops1;

class Person9 {
	
//	Instance - Variables
	String name, gender;
	int age;

//	Instance - Methods
	public void run() {
		System.out.println("Person9.run()");
	}

	public void eat() {
		System.out.println("Person9.eat()");
	}

	
	public void setter(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void print()
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Gender is: "+gender.length());
		System.out.println();
	}

}

public class setter {

	public static void main(String[] args) {
//		Var declaration
		Person9 ansh = new Person9();//--> Reference variable
		ansh.setter("Ansh Kumar",33,"Male");
		ansh.print();
		
		Person9 vikas = new Person9();//--> Reference variable
		vikas.setter("Vikas Kumar",34,"Male");
		vikas.print();
		
	}

}