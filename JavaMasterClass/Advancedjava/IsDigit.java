package advancedjava;

import javax.swing.*;
public class IsDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch=JOptionPane.showInputDialog("Enter a number").charAt(0);
		boolean b=Character.isDigit(ch);
		
		if(b) {
			System.out.println("It is a number");
		}
		else {
			System.out.println("Its not a number");
		}
	}

}
