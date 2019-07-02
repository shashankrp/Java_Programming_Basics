package tickettester;


//This was the project that they have given us to develop
import javax.swing.*;

public class TicketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5, counter = 0, counter1 = 0;
		while (num > 0) {
			int age = 0;
			age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age"));
			num--;
			if (age > 18 && age != 18) {
				counter++;
				System.out.println(age + "Entering");
			} else {
				counter1++;
				System.out.println(age + "not Entering");
			}
		}
		System.out.println(counter1 + " are the numbers that are not allowed to enter and " + counter
				+ " are the numbers that are allowed " + (counter*20)+ "%");
	}

}
