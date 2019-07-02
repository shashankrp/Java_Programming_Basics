package advancedjava;

import javax.swing.JOptionPane;

public class Project {
public static void main(String[] args) {
	//String fname="",sname="", first="", second="", temp="1"
	
	int i = 2;
	while(i!=0) {
	String Fname=JOptionPane.showInputDialog("Enter the first name");
	String Lname=JOptionPane.showInputDialog("Enter the Last/Surname name");
	int age=Integer.parseInt(JOptionPane.showInputDialog("Enter the age"));
		if(age>18) {
			String f=Fname.toUpperCase();
			String l=Lname.toUpperCase();
			f.compareTo(f);
			l.compareTo(l);
			System.out.println(f.charAt(0)+". "+l);
			System.out.println(age);
			i--;
			}
		
		else {
			System.out.println("Your age is less than 18");
		}
	}
	}
}
