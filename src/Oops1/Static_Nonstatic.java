package Oops1;

class test{
	static int staticVariable = 10;  
  
    int instanceVariable = 20;       


    static void staticMethod() {     
        System.out.println("Static method");
      
        System.out.println(staticVariable); 

    }

    void instanceMethod() {         
        System.out.println("Instance method");
        
      
        System.out.println(staticVariable);  
   
        System.out.println(instanceVariable); 
    }
}

	
