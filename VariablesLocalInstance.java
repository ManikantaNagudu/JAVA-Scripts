package org.programs;

public class VariablesLocalInstance {
	
	static int staticVar=100; //Static variable 
	
	int instanceVar=200; //instance variable

	public static void main(String[] args) {
		
	int localVar = 300; // local variable
	
	// We can access static/Local variables without creating an Object of a class
	 System.out.println("Value of a Static Variable is "+staticVar);
	 System.out.println("Value of a Local Variable is "+localVar);
	 // Creating an instance of a class 'VariablesLocalInstanceClass2' 
	 VariablesLocalInstance var=new VariablesLocalInstance();
	 System.out.println("Value of a Instance Variable is "+ var.instanceVar);
	 
	}

}
 