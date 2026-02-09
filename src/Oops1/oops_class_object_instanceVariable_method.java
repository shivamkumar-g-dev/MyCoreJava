package Oops1;

class Person7 {
	
//	Instance - Variables
	String name, gender;
	int age;

//	Instance - Methods
	public void run() {
		System.out.println("Person7.run()");
	}

	public void eat() {
		System.out.println("Person7.eat()");
	}

	public void sleep() {
		System.out.println("Person7.sleep()");
	}
	
	public void print()
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Gender is: "+gender.length());
		System.out.println();
	}

}

public class oops_class_object_instanceVariable_method {

	public static void main(String[] args) {
//		ClassName objName = new ClassName();
		Person7 ansh = new Person7();   //1st-->Object creation
		
//		Object initialization
		ansh.name = "Ansh Kumar";
		ansh.gender = "Male";
		ansh.age = 30;
		
		
		ansh.print();
		ansh.run();
		ansh.eat();
		ansh.sleep();
	}

}