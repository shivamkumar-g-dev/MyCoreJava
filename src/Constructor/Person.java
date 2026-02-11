package Constructor;

class Person1 { 
	 private String name,gender;
	 private int age;

	 public Person1(String name,int age,String gender) {
		 this.name = name;
		 this.age = age;
		 this.gender = gender;
		 
	 }
	 
	 public void print() {
			System.out.println("Name is: " + name);
			System.out.println("Age is: " + age);
			System.out.println("Gender is: " + gender);
			System.out.println();
	}
}
public class Person {
	    public static void main(String[] args) {
	    	Person1 s1 = new Person1("Shivam",24,"Male");
	    	s1.print();
	    	Person1 s2 = new Person1("vikas",32,"male");
	    	s2.print();
	    	System.out.println("OOPs_!.main()");
	    }
	}