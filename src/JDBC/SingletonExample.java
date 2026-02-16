package JDBC;

/*
class DataBase
{
	private DataBase()
	{
		System.out.println("DataBase.DataBase()");
	}
//	Eager Loading(Early)
	private static DataBase instance = new DataBase();
	
	
	public static DataBase getInstance()
	{
		return instance;
	}

}

public class SingletonExample {

	public static void main(String[] args) {
		DataBase d1 =  DataBase.getInstance();
		DataBase d2 =  DataBase.getInstance();
		DataBase d3 =  DataBase.getInstance();
		
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
	}

}
*/

class DataBase
{
	private DataBase()
	{
		System.out.println("DataBase.DataBase()");
	}

	private static DataBase instance = new DataBase();
	
	
	public static DataBase getInstance()
	{
		//Lazy Loading
		if(instance == null) {
			instance = new DataBase();
		}
		return instance;
	}

}

public class SingletonExample {

	public static void main(String[] args) {
		DataBase d1 =  DataBase.getInstance();
		DataBase d2 =  DataBase.getInstance();
		
		System.out.println(d1);
		System.out.println(d2);
	
		
	}

}
