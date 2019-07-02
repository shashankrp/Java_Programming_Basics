package advancedjava;

import javax.swing.*;
public class IsLetterMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//these methods could only be applied to charecters
		char ch=JOptionPane.showInputDialog("Enter a character").charAt(0);
		if(Character.isLetter(ch)) {
			System.out.println("hello");
		}
		//isletter is check a character to see if its a letter
		
	}

}
