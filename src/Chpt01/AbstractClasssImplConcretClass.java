package Chpt01;

/*
 * An abstract class can extent concrete class
 */
public abstract class AbstractClasssImplConcretClass extends ConcretClass{
	public enum Days { Mon, Tue, Wed};
	public static void main(String[] args) {
		for(Days d : Days.values()) {
			System.out.println(d);
		}
	}
}
