package userinput;

import javax.swing.*;

public class ConvertVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//converting int to string
		int num=5;
		String word = "" + num;
		
		System.out.println(word+5);
		
		//converting string to integer
		String word1 ="10";
		int num1=Integer.parseInt(word1);
		System.out.println(num1-5);
		
		//
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		System.out.println(num2);
	}

}
