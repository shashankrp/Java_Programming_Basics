package game;

public abstract class GameObject {
//inside a abstract class abstract methods
//which would be extended to other class 
	private int x;
	public void y(){
	}
	
	//this method must be implemented by any class that extends GameObject
	public abstract void draw();
	
	//menu and player are the two objects are of type GameObjects

	public static void main(String[] args) {
		Player player = new Player(); // as the player class is not abstract it is allowed to be used
		player.someMethod();
		//player.draw();
		
		Menu menu = new Menu();
		//menu.draw();
		
		GameObject[] gameobjects = new GameObject[2];
		gameobjects[0]=player;
		gameobjects[1]=menu;
		
		for(GameObject obj: gameobjects) {
			obj.draw();
		}
		
		//GameObject myObject = new GameObject();
		// abstract classes exists to be extracted,they can't be instantiated

	}
}
