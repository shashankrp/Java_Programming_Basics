package tutorials.basic;

public class Conditionals {
	public static void main(String[] args) {
		// if (some expression that evaluates true
		// do something

		boolean sayHello = false;
		if (sayHello) {
			System.out.println("Hello");
		} else {
			System.out.println("Goodbye");
		}
		// >, <, >= ,=< ,!=, ==

		// if(x=5) assign 5 to x
		// if(x==5) test whether x has the value 5

		// && AND || OR (shift + backslash)
		
		int playerX=50;
		
		if (true && false) {
			System.out.println("AND executed");
		}
		
		//it our player is past the left side the screen or if the player is past the right side
		//of the screen
		if (playerX<0 || playerX>800) {
			//some code to reverse our players direction
			System.out.println("OR executed");
		}
	}

}
