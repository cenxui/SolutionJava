package operater;

import static java.lang.System.*;

public class SolutionInstanceof {

	public static void main(String[] args) {
		HeayAnimal hippo = new Hippo();
		out.println(hippo instanceof Hippo);
		out.println(hippo instanceof HeayAnimal);
		out.println(hippo instanceof Elephant);
		out.println(hippo instanceof Mother); // possible for some subclass
//		Hippo anotherHippo = new Hippo();
//		out.println(anotherHippo instanceof Elephant); //error the declaration is impossible to fit
		
	}
	
	private static void checkType(Object animal) {
		out.print(animal.getClass().getName());
		if (animal instanceof Flyable) {	
			((Flyable)animal).fly();
		}
		
		if (animal instanceof Animal ) {
			out.println("Anaimal");
		}
		
		if (animal instanceof Bird) {
			out.println("Bird");
		}
	}
	
}

interface Mother {
	
}

class HeayAnimal {
	
}

class Hippo extends HeayAnimal {
	
}

class Elephant extends HeayAnimal {
	
}

class Animal {
	void eat() {
		
	}
}

interface Flyable {
	default void fly() {
		out.print("Flying");
	}
}

class Cat extends Animal {
	
}

class Bird extends Animal implements Flyable {

}