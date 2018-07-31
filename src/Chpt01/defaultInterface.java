package Chpt01;

import java.util.concurrent.SynchronousQueue;

// relative files: 
// classImplementingDefaultInterface in package Chpt01
// classImplementingDefaultInterfaceInChpt01 in package Chpt02

interface defaultInterface {
	// #################### interface variables ##############################
	// all vars in interface must be declared as public static final. 
	public static final int i = 1;
	
	// Implicitly vars are declared as public static final.
	long l = 2;
	
	
	// #################### interface methods ##############################
	// methods must be
	// 1. static or default or abstract or strictfp
	// 2. public is assumed and optional.
	
	public abstract void method01();
	
	// default method and static method must have method body
	public default void method02() {
	}
	public static void method03() {
		;
	}
	
	// public is assumed and optional 
	abstract void method04();
	default void method05() {
		
	}
	static void method06() {
		
	}
	
	// Illegal modifier for the interface method staticMethod01; 
	// only public, abstract, default, static and strictfp are permitted.
	// protected static void staticMethod01() {
	//		System.out.println(1);
	//}
	
}
