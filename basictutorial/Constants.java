package tutorials.basic;

public class Constants {
	
	//final int WIDTH=800, HEIGHT=600; these are instance variable where every time we create a new constants object there would 
	//be different copies of memory  
	
	public static final int WIDTH=800, HEIGHT=600;  // for all the constant objects there will be only one width and height memory  
	public static final Person P1 = new Person("");
	
	public static void main(String[] args) {
		
		//constants never change once a value is assigned
		//usually static 
		// by convention constants are upper case
		//declare constant using "final" modifier
		//constants can be public because there's no harm in accessing variable directly if you can't alter it 
		//we can't access the constants by the objects because they are usually static,
		//so we must access the constants by the class name directly
		System.out.println(Constants.WIDTH);	
		System.out.println(Math.PI);
	}
}
