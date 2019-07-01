package tutorials.basic;

public class AccessModifires {
	
	//Private is the most restrictive 
	//Default 
	//Protected
	//Public
	
	//these modifiers could also be applied for the variables 	
	
	private int x;
	public int y;
	
	
	public static void main(String[] args) {

	}

	//public visibility means that this method can be accessed anywhere in the program so 
	//long has you have an instance of this class to call it from
	public void doSomethingPublic() {

	}

	//Private visibility means that this method can't be accessed anywhere other than inside of this class
	private void doSomethingPrivate() {

	}

	//Protected visibility means that this method can only be accessed inside of this package and 
	//subclasses of this class 
	protected void doSomethingProtected() {

	}

	//default visibility means that this method can only be accessed inside of this package 
	//subclasses can't access these
	void doSomething() {

	}
}
