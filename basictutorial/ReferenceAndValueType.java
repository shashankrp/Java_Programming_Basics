package tutorials.basic;

public class ReferenceAndValueType {

	public static void main(String[] args) {
		// byte, short, int, long, float, double, boolean, char these are the value type 
		//any time when you are using a different type they are reference type like String or person or JLabel 
		
		
		//This is an example for value type 
		int x=5;
		addOneTo(x); // we are passing the value type, so we pass a copy of the value of x,which is 5
		
		System.out.println(x);
		
		//this is an example for reference type
		Person john;
		john = new Person("John"); // we are creating a new person object, and assigning john to refer to it  
		john.setAge(20);
		celebrateBirthday(john);  // we're passing that reference to a method, so the method can use that reference to manipulate the object
		System.out.println(john.getAge());
		
	}
	private static void celebrateBirthday(Person person) {
		person.setAge(person.getAge()+1);
		
	}
	
	// manipulate a copy that we have passed 
	static void addOneTo(int number) {
		number=number + 1;
	}

}
