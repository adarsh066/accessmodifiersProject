package accessmodifiers;

public class DerivedClass extends BaseClass {
	// Public variable, accessible from anywhere
	public int derivedVariable = 20;

	// Public method overriding the protected baseMethod
	@Override
	public void baseMethod() {
		System.out.println("DerivedClass: derivedMethod");
	}
}
