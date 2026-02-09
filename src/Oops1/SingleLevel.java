package Oops1;

class Animal4 {
public void wakeUp() {
	System.out.println("Animal4.wakeUp()");
}

public void hustle() {
	System.out.println("Animal4.hustle()");
}

public void eat() {
	System.out.println("Animal4.eat()");
}

public void sleep() {
	System.out.println("Animal4.sleep()");
}

}

class DogeshBhai12 extends Animal4 {

}

public class SingleLevel  {

public static void main(String[] args) {

	Animal4 a = new Animal4();
	a.wakeUp();
	a.hustle();
	a.eat();
	a.sleep();
	System.out.println("------------------");

	DogeshBhai12 d = new DogeshBhai12();
	d.wakeUp();
	d.hustle();
	d.eat();
	d.sleep();
	System.out.println("------------------");
	
}

}