package Constructor;


public class TypesOfBlocks {
	
	public TypesOfBlocks() {
		System.out.println("TypesOfBlocks.constructor()");
	}

	static {
		System.out.println("TypesOfBlocks.staticBlock(1)");
	}
	
	static {
		System.out.println("TypesOfBlocks.staticBlock(2)");
	}
	
	{
		System.out.println("TypesOfBlocks.instanceBlock(1)");
	}
	
	{
		System.out.println("TypesOfBlocks.instanceBlock(2)");
	}

	public static void main(String[] args) {

		TypesOfBlocks t1 = new TypesOfBlocks();
		{
			int n =90;
			System.out.println("TypesOfBlocks.localBlock()  "+n);
		}		
	}
}