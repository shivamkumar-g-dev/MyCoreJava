package Oops1;
class ConsOverLoading1 {

	private int id, salary;
	private String name, gender;

	//no argu
	public ConsOverLoading1() {
		System.out.println("ConsOverLoading1.ConsOverLoading()");
	}

	// with argu
	public ConsOverLoading1(String name) {
		this();
		this.name = name;
		System.out.println("ConsOverLoading1.ConsOverLoading(1)");

	}

	public ConsOverLoading1(String name, String gender) {
		this(name);
		this.gender = gender;
		System.out.println("ConsOverLoading1.ConsOverLoading(2)");

	}

	public ConsOverLoading1(String name, String gender, int id) {
		this(name, gender);
		this.id = id;
		System.out.println("ConsOverLoading1.ConsOverLoading(3)");

	}
	
	public ConsOverLoading1(String name, String gender, int id,int salary) {
		this(name, gender,id);
		this.salary = salary;
		System.out.println("ConsOverLoading1.ConsOverLoading(4)");
	}

	public void print() {
		System.out.println("name is: " + name);
		System.out.println("gender is: " + gender);
		System.out.println("Id is: " + id);
		System.out.println("salary is: " + salary);
		System.out.println("----------------------------------");
	}

}

public class Consoverloading {

	public static void main(String[] args) {

		
		ConsOverLoading1 c1 = new ConsOverLoading1("Kunal", "Male", 101,90000);
		c1.print();
	}

}