package advancedjava;

import javax.swing.*;
public class IsWhatSpace {
	public static void main(String[] args) {
		char ch=JOptionPane.showInputDialog("Enter a character").charAt(0);
		boolean test=Character.isWhitespace(ch);
		System.out.println(test);
	}
}
