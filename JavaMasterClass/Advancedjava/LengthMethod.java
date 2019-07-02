package advancedjava;

import javax.swing.*;	
public class LengthMethod {

	public static void main(String[] args) {
		String word=JOptionPane.showInputDialog("Enter a password");
		if(word.length()>6) {
			System.out.println("password is valid");
		}
		else {
			System.out.println("password is not valid");	
		}
	}

}
