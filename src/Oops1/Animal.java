package Oops1;


class Animal {

private String name;

public Animal(String name) {
	this.name = name;
	System.out.println("Animal.Animal()");
}

public void wakeUp() {
	System.out.println("Animal.wakeUp()");
}

public void hustle() {
	System.out.println("Animal.hustle()");
}

public void eat() {
	System.out.println(name + " is eating");
}

public void sleep() {
	System.out.println("Animal.sleep()");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}

class DogeshBhai extends Animal {

private String color;

public DogeshBhai(String name, String color) {
	super(name);
	this.color = color;
	System.out.println("DogeshBhai.DogeshBhai()");
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}


}


class Puppy extends DogeshBhai
{
private int age;
public Puppy(String name,String color,int age)
{
	super(name,color);
	this.setAge(age);
	System.out.println("Puppy.Puppy()");
}




public static void main(String[] args) {
	Puppy d = new Puppy("Jimmy","black",2);
	d.wakeUp();
	d.hustle();
	d.eat();
	d.sleep();
	
	System.out.println("Name is: "+d.getName());
	System.out.println("COlor is: "+d.getColor());
	System.out.println("------------------");

}




public int getAge() {
	return age;
}




public void setAge(int age) {
	this.age = age;
}

}
