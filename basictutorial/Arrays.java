package tutorials.basic;

public class Arrays {

	public static void main(String[] args) {
		int x; // creating that one box in memory that can store one int value
		int[] myArray; // declaring an array that will store int
		//myArray = new int[50000]; // initializing array to be capable of holding 4 int
		myArray = new int[] {1,2,3,4,5,6,7,8,9,10};

		/*x = 5;
		myArray[0] = x;
		myArray[1] = 3;
		myArray[2] = 0;
		myArray[3] = 1;*/

		/*for (int counter = 0; counter < 50000; counter++) {
			myArray[counter] = counter;
		}*/

		// iterate over an array
		// for (int i = 0; i < myArray.length; i++) {
		// System.out.println(myArray[i]);
		// }

		for (int number : myArray) {
			System.out.println(number);
		}
	}

}
