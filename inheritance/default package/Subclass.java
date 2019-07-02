package overriding;

//subclass is inheriting all the variables and methods defined in Base 

public class Subclass extends Base{
	public static void main(String[] args) {
		Subclass s=new Subclass();
		
	}
	public Subclass() {
		sayHello(); //we are calling the sayhello method defined in the Base  
	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		super.sayHello();
		System.out.println("Hi");
	}
}
