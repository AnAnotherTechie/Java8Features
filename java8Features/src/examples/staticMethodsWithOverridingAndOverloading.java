package examples;


	/* Java program to show that if static method is redefined by 
	a derived class, then it is not overriding. */

	// Superclass 
	class Base { 
		
		// Static method in base class which will be hidden in subclass 
		public static void display() { 
			System.out.println("Base"); 
		} 
		
		// Non-static method which will be overridden in derived class 
		public static void print() { 
			System.out.println("Non-static or Instance method from Base"); 
		} 
	} 

	// Subclass 
	class Derived extends Base { 
		
		// This method hides display() in Base 
		public static void display() { 
			System.out.println("Derived"); 
		} 
			
		// This method overrides print() in Base 
		public  static void print() { 
			System.out.println("Non-static or Instance method from Derived"); 
	} 
	} 

	// Driver class 

public class staticMethodsWithOverridingAndOverloading {
	public static void main(String[] args) {
		Base  obj1 = new Base(); 
			
		// As per overriding rules this should call to class Derive's static 
		// overridden method. Since static method can not be overridden, it 
		// calls Base's display() 
		obj1.display(); 
			
		// Here overriding works and Derive's print() is called 
		obj1.print();	 
		} 
	} 



