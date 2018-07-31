package Chpt02;

public class WhichOverridenIsCalled {
	
	// Method 1
	public void callOverload(Superclass object) {
		System.out.println("Superclass version of callOverload was called");
	}
	
	// Method 2
	public void callOverload(Subclasss object) {
		System.out.println("Subclass version of callOverload was called");
	}
	
	
	public static void main(String[] args) {
		/*
		 *  overriden methods are decided at runtime based on the object.
		 */
		Superclass sb = new Subclasss();
		Superclass sp = new Superclass();
		Subclasss sub = new Subclasss();
		
		// the object type decides which overriden method to call
		// Superclass sb = new Subclasss();
		sb.print();
		// compiler error: there is no such a method in Superclass.
		sb.print("123");
		
		// Superclass sp = new Superclass();
		sp.print();
		
		

		/*
		 * overloaded methods are decided based on the reference type
		 */
		
		WhichOverridenIsCalled wc = new WhichOverridenIsCalled();
		
		// pass a reference of Superclass, which points to a Subclass Object, to the overloaded method
		// callOverloaded() and see which version is called.
		wc.callOverload(sb);
		// Result: Superclass version(Method 1) of callOverload was called
		
		
	}
	

}
