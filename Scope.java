package tutorials.basic;

public class Scope {

	// because x is declared outside of any method, it is in scope of all methods,
	// in other words
	// any method can access x
	static int x; // declaring the variable x

	public static void main(String[] args) {
		x = 5; // assigning a value to x
		System.out.println(x);
		doSomething();
		System.out.println(x);
	}

	static void doSomething() {
		x = 10; // assigning a value to x
	}

	static void doSomethingLocally() {
		// because y in declared inside this method, it is local to this method, in
		// other words
		// no other methods has access to y
		int y = 100; //declaring and initializing the variable y

	}

}
