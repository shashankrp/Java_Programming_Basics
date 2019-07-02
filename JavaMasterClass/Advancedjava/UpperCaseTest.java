package advancedjava;

import javax.swing.*;
public class UpperCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//here the methods are fixed it applyies only to string 
		String word = JOptionPane.showInputDialog("Enter a word");
		System.out.println(word.toUpperCase());
		
		System.out.println(word.toLowerCase());		
		
		
	}

}
