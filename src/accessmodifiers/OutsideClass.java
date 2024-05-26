package accessmodifiers;

import java.util.Scanner;

public class OutsideClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Create an instance of DerivedClass
		DerivedClass derivedClass = new DerivedClass();

		// Attempt to access baseMethod (which is overridden as public in DerivedClass)
		derivedClass.baseMethod();

		// Access the public variable derivedVariable
		System.out.println("DerivedClass: derivedVariable = " + derivedClass.derivedVariable);

		// Attempt to access private variable baseVariable directly (will cause an
		// error)
		// System.out.println("BaseClass: baseVariable = " + derivedClass.baseVariable);
		// // Uncommenting this will cause a compilation error

		// Access private variable baseVariable via public method
		System.out.println("BaseClass: baseVariable (via getter) = " + derivedClass.getBaseVariable());

		// Prompt user to press enter to finish
		System.out.println("Press Enter to exit.");
		scanner.nextLine();
	}
}
