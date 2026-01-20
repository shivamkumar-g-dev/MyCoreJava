package Oops1;

class Animals {
public void wakeUp() {
	System.out.println("Animals.wakeUp()");
}

public void eat() {
	System.out.println("Animals.eat()");
}

public void sleep() {
	System.out.println("Animals.sleep()");
}

}

class DogeshBhai3 extends Animals {

}


class Pilla5 extends DogeshBhai3
{

public void run()
{
	System.out.println("Pilla.run()");
}


}
public class MultiLevel {

public static void main(String[] args) {

	Animals a = new Animals();
	a.wakeUp();
	a.eat();
	a.sleep();
	System.out.println("------------------");

	DogeshBhai3 d = new DogeshBhai3();
	d.wakeUp();
	d.eat();
	d.sleep();
	System.out.println("------------------");
	

	Pilla5 p = new Pilla5();
	p.wakeUp();
	p.eat();
	p.sleep();
	p.run();
	System.out.println("------------------");
	
}

}