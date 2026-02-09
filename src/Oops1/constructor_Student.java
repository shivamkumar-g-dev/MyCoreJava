package Oops1;

class Student1 {
	private String name,gender;
	private int age,std,Rollno;
	
	public Student1(){
		System.out.println("Student.Student(0)");
	}	

	public Student1(String name,int age,int Rollno,String gender,int std) {
		this.name=name;
		this.age=age;
		this.Rollno=Rollno;
		this.gender=gender;
		this.std=std;
		
		System.out.println("Student.Student(3)");
	}
	
	public void print() {
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Roll No is: "+Rollno);
		System.out.println("Gender is: "+gender);
		System.out.println("class is: "+std);
		System.out.println();
	}
}
public class constructor_Student{
	public static void main(String[] args)
		{
			Student1 a = new Student1("Amit",21,10121,"male",10);
			a.print();
			
		System.out.println("constructor_Student.main(0)");
			
		} 

}