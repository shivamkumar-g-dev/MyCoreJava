package Oops1;

abstract class Animal23 {

	 String name;

	public Animal23(String name) {
		this.name = name;
	}
	public abstract void eat() ;
}

class DogeshBhai33 extends Animal23 {
	private String color;
	public DogeshBhai33(String name, String color) {
		super(name);
		this.color = color;
	}
	@Override
	public void eat() {
		System.out.println(name + " can eat veg and non-veg both............");
		System.out.println("------------------");
	}


}

class Cow4 extends Animal23 {
	private int age;

	public Cow4(String name, String color, int age) {
		super(name);
		this.age = age;
	}

	@Override
	public void eat() {
	System.out.println("Eating.................");
	}

}

public class Abstract {

	public static void main(String[] args) {
		Animal23 d = new DogeshBhai33("Shimbha", "black");
		d.eat();

		Animal23 c = new Cow4("Jimmy", "black", 10);
		c.eat();
		

	}

//public class Abstract {

}
