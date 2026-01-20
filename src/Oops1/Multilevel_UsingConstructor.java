package Oops1;

//Multi-Level Inheritance
class Animal9 {
	private String name;

	public Animal9(String name) {
		this.name = name;
		System.out.println("Animal9.Animal()");
	}

	public void wakeUp() {
		System.out.println("Animal9.wakeUp()");
	}

	public void eat() {
		System.out.println(name + " is eating");
	}

	public void sleep() {
		System.out.println("Animal9.sleep()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class DogeshBhai7 extends Animal9 {

	private String color;

	public DogeshBhai7(String name, String color) {
		super(name);
		this.color = color;
		System.out.println("DogeshBhai7.DogeshBhai()");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class Puppy21 extends DogeshBhai7{
	private int age;
	public Puppy21(String name,String color,int age)
	{
		super(name,color);
		this.age=age;
		System.out.println("Puppy.Puppy()");
	}
}

public class Multilevel_UsingConstructor {

public static void main(String[] args) {
	Puppy21 d = new Puppy21("Jimmy","black",2);
	d.wakeUp();
	d.eat();
	d.sleep();
	
	System.out.println("Name is: "+d.getName());
	System.out.println("COlor is: "+d.getColor());
	System.out.println("------------------");

	}
}