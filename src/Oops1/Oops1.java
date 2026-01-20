package Oops1;


class Person  {
			
//			Instance - Variables
			String name, gender;
			int age;

public Person(String string, int i, String string2) {
				// TODO Auto-generated constructor stub
			}

			//			Instance - Methods
			public void run() {
				System.out.println("Person.run()");
			}

			public void eat() {
				System.out.println("Person.eat()");
			}

			public void sleep() {
				System.out.println("Person.sleep()");
			}
			
			public void print()
			{
				System.out.println("Name is: "+name);
				System.out.println("Age is: "+age);
				System.out.println("Gender is: "+gender.length());
				System.out.println();
			}

		}

		public class Oops1 {

			public static void main(String[] args) {
//				Var declaration
				Person ansh;//--> Reference variable
				int n;
				
				n = 10;
				ansh = new Person(null, n, null);
				ansh.name="Ansh Kumar";
				ansh.age=33;
				ansh.gender="Male";
				ansh.print();
				
			}

		}
