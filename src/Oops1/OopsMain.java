package Oops1;

class Man {

    private String name, gender;
    private int age;

    // No-arg constructor
    public Man() {
        System.out.println("Man.Man(0)");
    }

    // Parameterized constructor
    public Man(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Man.Man(3)");
    }

    public void print() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Gender is: " + gender);
        System.out.println();
    }
}

public class OopsMain {

    public static void main(String[] args) {

        Man ansh = new Man("Ansh Kumar", 20, "male");
        ansh.print();

        Man vikas = new Man("Vikas Kumar", 20, "male");
        vikas.print();

        Man anoop = new Man("Anoop", 30, "male");
        anoop.print();

        Man anurag = new Man("Anurag", 30, "male");
        anurag.print();

        Man vinay = new Man("Vinay", 32, "male");
        vinay.print();

        System.out.println("OOPS_1.main()");
    }
}
