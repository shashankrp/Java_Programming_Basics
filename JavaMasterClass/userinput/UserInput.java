package userinput;


import javax.swing.*;

public class UserInput {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?") ;
	System.out.println(name);
}
}
