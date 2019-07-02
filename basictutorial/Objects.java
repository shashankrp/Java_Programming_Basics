package tutorials.basic;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
	public static void main(String[] args) {
		int number = 5;
		
		//JFrame and JLabels are the types of objects that can be stored in the variables like window and label

		// create our window
		JFrame window = new JFrame();  //window variable that holds JFrame objects, and we're creating a new JFrame to assign to our variable
		window.setTitle("My Window"); // we are calling methods on our JFrmae object to configure it  
		window.setSize(800, 600);
		window.setVisible(true);

		JLabel label = new JLabel(); // label variable holds JLable objects, and we're creating a new JLabel to assign to our variable 
		label.setText("My Label"); // we're calling the setText method on our JLabel objects to set its text property
		window.add(label); // we're calling the add method of our JFrame object to add our label to the window 
		
		String s = "hai";
	}
}
