package accessmodifiers;

public class BaseClass {
	// Private variable, accessible only within BaseClass
	private int baseVariable = 10;

	// Protected method, accessible within the same package and subclasses
	protected void baseMethod() {
		System.out.println("BaseClass: baseMethod");
	}

	// Public method to access the private variable
	public int getBaseVariable() {
		return baseVariable;
	}
}
