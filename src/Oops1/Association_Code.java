package Oops1;

class Carr{
	private String name;
	private final Engine engine;
	private Driver driver;
	
	public Carr() {
		// Strong-Association ---->Composition
		engine = new Engine(1111,440);
		System.out.println("Carr.Carr()");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine getEngine() {
		return engine;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	@Override
	public String toString() {
		System.out.println("Carr.toString()");
		return "Carr = [name = "+name+", engine = "+engine+",driver = "+driver+"]";
	}
}

class Engine{
	private int hp,torqe;

	public Engine(int hp, int torqe) {
		super();
		this.hp = hp;
		this.torqe = torqe;
		System.out.println("Engine.Engine()");
	}

	@Override
	public String toString() {
		System.out.println("Engine.toString()");
		return "Engine [hp=" + hp + ", torqe=" + torqe + "]";
	}
	
	
}

class Driver{
	private String name,address;

	public Driver(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		System.out.println("Driver.Driver()");
	}

	@Override
	public String toString() {
		System.out.println("Driver.toString()");
		return "Driver [name=" + name + ", address=" + address + "]";
	}
	
	
}

public class Association_Code {
	public static void main(String[] args) {
		
		
		Driver ashok = new Driver("Ashok","Noida");
		Carr c1 = new Carr();	
		System.out.println(c1);
		
		c1.setName("Tesla");
		c1.setDriver(ashok);
		System.out.println(c1);
	}
}