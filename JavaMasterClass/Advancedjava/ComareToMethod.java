package advancedjava;

import javax.swing.*;
public class ComareToMethod {

	public static void main(String[] args) {
		//compare two method will compare two character/strings it takes there ASCII values to compare
		String let1="John";
		String let2="Jack";
		if(let1.compareTo(let2)<0) {
			System.out.println(let1+" then "+let2);
		}
		else {
			System.out.println(let2+" then "+let1);
		}
	}

}
