package tutorials.basic;

//braking the codes into fragments
public class Methods {

	public static void main(String[] args) {
		sayHelloWorld();
		sayHelloTo("Charlie");

		System.out.println(returnFive());

		// f(x)=x*x;
		int result = Square(5);
		System.out.println(result);

	}
//this method both returns a value and takes in data
	static int Square(int x) {
		return x * x;
	}

	// this method returns the value 5
	static int returnFive() {
		return 5;
	}

	// this method will say hello to whatever name is passed when called
	static void sayHelloTo(String name) {
		System.out.println("Hello, " + name);
	}

	// this method simply says "Hello World"
	static void sayHelloWorld() {
		System.out.println("Hello World");
	}
}
