package Oops1;

class Animal78 {
	public void wakeUp() {
		System.out.println("Animal.wakeUp()");
	}

	public void hustle() {
		System.out.println("Animal.hustle()");
	}

	public void eat() {
		System.out.println("Animal.eat()");
	}

	public void sleep() {
		System.out.println("Animal.sleep()");
	}
}

class DogeshBhai6 extends Animal78 {

}

class Pilla extends DogeshBhai6
{
	
	public void run()
	{
		System.out.println("Pilla.run()");
	}
	
	
}

class Tiger extends Animal78
{
	
}
public class Inheritance {

	public static void main(String[] args) {
		System.out.println("---------ANIMAL---------");
		Animal78 a = new Animal78();
		a.wakeUp();
		a.hustle();
		a.eat();
		a.sleep();
		System.out.println("------------------");
		System.out.println("---------DogeshBhai6---------");
		DogeshBhai6 d = new DogeshBhai6();
		d.wakeUp();
		d.hustle();
		d.eat();
		d.sleep();
		System.out.println("------------------");
		
		System.out.println("---------PILLA---------");

		Pilla p = new Pilla();
		p.wakeUp();
		p.hustle();
		p.eat();
		p.sleep();
		p.run();
		System.out.println("------------------");
		
		System.out.println("---------TIGER---------");
		Tiger t = new Tiger();
		t.wakeUp();
		t.hustle();
		t.eat();
		t.sleep();
		System.out.println("------------------");
		
	}

}
//}