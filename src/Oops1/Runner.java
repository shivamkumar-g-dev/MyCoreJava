package Oops1;

class Cars12 {
	String brand;
	double price;

	public Cars12(String brand, double price) {
     this.brand = brand;
     this.price = price;
     System.out.println("Cars constructor called: ");
 }

 public void display() {
     System.out.println("Brand: " + brand + " Price: " + price);
 }

 public void start() {
     System.out.println("Starting the " + brand);
 }
}


class SUVs12 extends Cars12 {
	double groundClearance;

	public SUVs12(String brand, double price, double groundClearance) {
		super(brand, price); 
		this.groundClearance = groundClearance;
		System.out.println("SUVs constructor called: ground clearance = " + groundClearance);
	}

	public void showSUVFeatures() {
		System.out.println("SUV features -> Ground clearance: " + groundClearance + " mm");
	}

	public void driveOffroad() {
		System.out.println(brand + " is driving off-road.");
	}
}

	class Creta12 extends SUVs12 {
		String variant;

		public Creta12(String brand, double price, double groundClearance, String variant) {
			super(brand, price, groundClearance);
			this.variant = variant;
			System.out.println("Creta constructor called: variant = " + variant);
		}

		public void showVariant() {
			System.out.println("Creta variant: " + variant);
		}

		public void honk() {
			System.out.println(brand + " Creta honks: Beep Beep!");
		}
	}


class Sedans12 extends Cars12 {
	double bootSpace; 

	public Sedans12(String brand, double price, double bootSpace) {
		super(brand, price);
		this.bootSpace = bootSpace;
		System.out.println("Sedans constructor called: boot space = " + bootSpace + " L");
	}

	public void showSedanFeatures() {
		System.out.println("Sedan features -> Boot space: " + bootSpace + " L");
	}

	public void comfortDrive() {
		System.out.println(brand + " sedan offers a comfortable drive.");
	}
}

class Verna12 extends Sedans12 {
	String engineType;

	public Verna12(String brand, double price, double bootSpace, String engineType) {
		super(brand, price, bootSpace);
		this.engineType = engineType;
		System.out.println("Verna constructor called: engine = " + engineType);
	}

	public void showEngine() {
		System.out.println("Verna engine type: " + engineType);
	}

	public void moreFeatures() {
		System.out.println("Verna has advanced safety and comfort features.");
	}
}



//Runner.java
public class Runner {
	public static void main(String[] args) {
		System.out.println("=== Creating (SUV) objects ===");
		Creta12 creta1 = new Creta12("Hyundai", 150, 185, "SX");
		creta1.display();
		creta1.start();
		creta1.showSUVFeatures();
		creta1.showVariant();
		creta1.driveOffroad();
		System.out.println();

		Creta12 creta2 = new Creta12("Hyundai", 1700, 190, "SX(O)");
		creta2.display();
		creta2.honk();
		System.out.println();

		Creta12 creta3 = new Creta12("Hyundai", 1600, 180, "Sport");
		creta3.display();
		System.out.println();

		System.out.println("=== Creating (Sedan) objects ===");
		Verna12 verna1 = new Verna12("Hyundai", 1400, 480, "Diesel");
		verna1.display();
		verna1.showSedanFeatures();
		verna1.showEngine();
		System.out.println();

		Verna12 verna2 = new Verna12("Hyundai", 15500, 510, "Petrol");
		verna2.comfortDrive();
		System.out.println();

		Verna12 verna3 = new Verna12("Hyundai", 14999, 495, "Hybrid");
		verna3.display();
	}
}