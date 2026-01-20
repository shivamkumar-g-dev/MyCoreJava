package Oops1;

/*
interface Vehicle1 {

	public abstract void startEngine();

	public abstract void turnOffEngine();

}

interface Car1{
//	Java Constants 
	public static final double PI_VALUE = 3.14;
	
	
	public abstract void run();

	public abstract void device();

	public abstract void playMusic();

}


class SUV
{
	public void m1()
	{
		System.out.println("SUV.m1()");
	}
}

class Swift extends SUV implements Car1,Vehicle1 {

	@Override
	public void run() {
		System.out.println("Swift.run()");
	}

	@Override
	public void device() {
		System.out.println("Swift.device()");
	}

	@Override
	public void startEngine() {
		System.out.println("Swift.startEngine()");
	}

	@Override
	public void turnOffEngine() {
		System.out.println("Swift.turnOffEngine()");
	}

	@Override
	public void playMusic() {
		System.out.println("Swift.playMusic()");
	}

}

public class Abstract_Interface {

	public static void main(String[] args) {

		Swift s = new Swift();
		s.startEngine();
		s.device();
		s.run();
		s.turnOffEngine();
		s.m1();
		
		
		System.out.println(Car1.PI_VALUE);
		
		
	}

}*/


interface Vehicle44 {

	public abstract void startEngine();

	public abstract void turnOffEngine();

}

interface Car44{
//	Java Constants 
	public static final double PI_VALUE = 3.14;
	
	
	public abstract void run();

	public abstract void device();

	default public void playMusic() {
		System.out.println("Car44.playMusic()");
	}

}


class SUV
{
	public void m1()
	{
		System.out.println("SUV.m1()");
	}
}

class Swift extends SUV implements Car44,Vehicle44 {

	@Override
	public void run() {
		System.out.println("Swift.run()");
	}

	@Override
	public void device() {
		System.out.println("Swift.device()");
	}

	@Override
	public void startEngine() {
		System.out.println("Swift.startEngine()");
	}

	@Override
	public void turnOffEngine() {
		System.out.println("Swift.turnOffEngine()");
	}

	@Override
	public void playMusic() {
		System.out.println("Swift.playMusic()");
	}

}

public class Abstract_Interface {

	public static void main(String[] args) {

		Swift s = new Swift();
		s.startEngine();
		s.device();
		s.run();
		s.turnOffEngine();
		s.m1();
		
		
		System.out.println(Car44.PI_VALUE);
		
		
	}

}