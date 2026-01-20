package Oops1;

class Student {
    private String name;
    private int age;
    private String gender;
    private int rollNo;
    private String className;


    public Student(String name, int age, String gender, int rollNo, String className) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rollNo = rollNo;
        this.className = className;
    }


    public String getName() { 
    	return name; 
    	}
    public int getAge() {
    	return age;
    	}
    public String getGender() { 
    	return gender; 
    	}
    public int getRollNo() { 
    	return rollNo; 
    	}
    public String getClassName() {
    	return className; 
    	}


    public void setName(String name) 
    { 
    	this.name = name;
    }
    public void setAge(int age) { 
    	this.age = age; 
    	}
    public void setGender(String gender) {
    	this.gender = gender;
    	}
    public void setRollNo(int rollNo) {
    	this.rollNo = rollNo;
    	}
    public void setClassName(String className) {
    	this.className = className; 
    	}


    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Class: " + className);
        System.out.println("--------------------------------");
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Ansh Kumar", 20, "Male", 101, "B.tech");
        Student s2 = new Student("Vikas Kumar", 21, "Male", 102, "B.tech");
        Student s3 = new Student("Anoop", 22, "Male", 103, "M.tech");


        s1.print();
        s2.print();
        s3.print();


        s1.setAge(25);
        s1.setClassName("Bca");

        System.out.println("After updating Ansh's details:");
        s1.print();
    }
}
