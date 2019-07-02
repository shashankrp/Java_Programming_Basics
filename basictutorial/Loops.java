package tutorials.basic;

public class Loops {

	public static void main(String[] args) {
		// whileloop();
		//doWhile();
		forloop();

	}

	static void whileloop() {
		int counter = 0;
		while (counter < 10) {
			counter = counter + 1;
			System.out.println(counter);
		}
	}

	static void doWhile() {
		int counter = 10;
		do {
			counter = counter + 1;
			System.out.println(counter);
		} while (counter < 10);
	}

	static void forloop() {
		//for initializes the condition; condition to see if we should run the loop; change counter variable  
		for (int counter = 0; counter < 10; counter = counter + 1) {
			System.out.println(counter);
		}
	}
}
