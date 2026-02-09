package Oops1;

class Employee {
	
//	Instance - Variables
	private String name, gender;
	private int age;
	static final String compName="HCL";
	
//	Instance - Methods
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
		System.out.println("Company is: "+ compName);

		System.out.println();
	}
}
public class static_final {

	public static void main(String[] args) {
				
//		Var declaration
		Employee ansh = new Employee();//--> Reference variable
		ansh.setter("Ansh Kumar",33,"Male");
		ansh.print();
		
		Employee vikas = new Employee();//--> Reference variable
		vikas.setter("Vikas Kumar",34,"Male");
		vikas.print();
		
	}

}